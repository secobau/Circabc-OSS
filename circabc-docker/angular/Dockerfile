#################################################################################
#       Copyright (C) 2020        Sebastian Francisco Colomar Bauza             #
#       SPDX-License-Identifier:  GPL-2.0-only                                  #
#################################################################################
FROM 										\
	alpine/git:1.0.25-amd64@sha256:78e2b58fcb76d71368b961f43e02682dc1f23bc6266319e6cc21e848bf7f1b53 \
	AS 									\
	clone
#################################################################################
ARG 										\
	branch=docker
ARG 										\
	dir_clone=/clone
ARG 										\
	hostname=github.com
ARG 										\
	repository=Circabc-OSS
ARG 										\
	username=academiaonline
ARG 										\
	zip=alfresco-community-4.2.f.zip
WORKDIR 									\
	${dir_clone}
RUN 										\
	git 									\
		clone 								\
			https://${hostname}/${username}/${repository} 		\
			--branch 						\
				${branch} 					\
			--single-branch 					\
	&& 									\
	cat ${repository}/${zip}.parts/x* 1> ${zip} 				\
	&& 									\
	unzip ${zip} 								\
	&& 									\
	mv web-server/webapps/alfresco.war ${repository}/circabc-resources/ 	\
										;
#################################################################################
FROM 										\
	maven:3.6.3-openjdk-15@sha256:e8ab59fe2b7dc16643e8f38a2e7df7f26a72be377ab15c4224301fa9bd5ab55f \
	AS 									\
	build
#################################################################################
ARG 										\
	dir_build=/build
ARG 										\
	dir_clone=/clone
ARG 										\
	folder_angular=circabc-docker/angular
ARG 										\
	folder_backend=circabc-backend/target
ARG 										\
	folder_frontend=circabc-frontend/dist/circabc
ARG 										\
	folder_tomcat=circabc-docker/tomcat
ARG 										\
	repository=Circabc-OSS
WORKDIR 									\
	${dir_build}
COPY 										\
	--from=clone 								\
	${dir_clone}/${repository} 						\
	.
RUN 										\
	mvn clean 								\
	&& 									\
	mvn clean package 							\
		-Dbackend-target.env=tomcat-docker 				\
		-Dfrontend-target.env=docker 					\
		-Dserver.node=N2 						\
	&& 									\
	mkdir -p 								\
		${folder_tomcat}/dist/ 						\
		${folder_angular}/dist/ 					\
	&& 									\
	cp -fv 									\
		${folder_backend}/circabc.war 					\
		${folder_tomcat}/dist/ 						\
	&& 									\
	cp -fv 									\
		-r 								\
		${folder_frontend} 						\
		${folder_angular}/dist/ 					\
										;
#################################################################################
FROM 										\
	nginx:1.19.6-alpine@sha256:01747306a7247dbe928db991eab42e4002118bf636dd85b4ffea05dd907e5b66 \
	AS 									\
	production
#################################################################################
ARG 										\
	dir_app=/usr/share/nginx/html
ARG 										\
	dir_build=/build
ARG 										\
	dir_clone=/clone
ARG 										\
	folder_angular=circabc-docker/angular
ARG 										\
	folder_backend=circabc-backend/target
ARG 										\
	folder_frontend=circabc-frontend/dist/circabc
ARG 										\
	folder_tomcat=circabc-docker/tomcat
WORKDIR 									\
	${dir_app}
RUN 										\
	rm -rf * 								\
	&& 									\
	mkdir ui 								\
										;
COPY 										\
	--from=build 								\
	${dir_build}/${folder_angular}/dist/circabc/ 				\
	ui
COPY 										\
	--from=build 								\
	${dir_build}/${folder_angular}/conf/nginx.conf 				\
	/etc/nginx/conf.d/default.conf
COPY 										\
	--from=build 								\
	${dir_build}/${folder_tomcat}/lib/mysql-connector-java-5.1.48.jar 	\
	lib/
COPY 										\
	--from=build 								\
	${dir_build}/${folder_tomcat}/conf/context.xml 				\
	conf/
COPY 										\
	--from=build 								\
	${dir_build}/${folder_tomcat}/wait-for-it.sh 				\
	.
#################################################################################
CMD 										\
	["nginx","-g","daemon off;"]
EXPOSE 										\
	80
#################################################################################
