//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-558 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.01.17 at 12:50:48 PM GMT 
//


package eu.cec.digit.circabc.migration.entities.generated.permissions;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import eu.cec.digit.circabc.migration.entities.TypedProperty.DescriptionProperty;
import eu.cec.digit.circabc.migration.entities.TypedProperty.OwnerProperty;
import eu.cec.digit.circabc.migration.entities.TypedProperty.TitleProperty;
import eu.cec.digit.circabc.migration.entities.XMLElement;
import eu.cec.digit.circabc.migration.entities.adapter.DescriptionPropertyAdapter;
import eu.cec.digit.circabc.migration.entities.adapter.OwnerPropertyAdapter;
import eu.cec.digit.circabc.migration.entities.adapter.TitlePropertyAdapter;
import eu.cec.digit.circabc.migration.entities.generated.properties.I18NProperty;


/**
 * <p>Java class for emptyAccessProfile complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="emptyAccessProfile">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{https://circabc.europa.eu/Import/PropertiesSchema/1.0}titleProperties" minOccurs="0"/>
 *         &lt;element name="informationPermission" type="{https://circabc.europa.eu/Import/PermissionsSchema/1.0}informationPermissions" minOccurs="0"/>
 *         &lt;element name="libraryPermission" type="{https://circabc.europa.eu/Import/PermissionsSchema/1.0}libraryPermissions" minOccurs="0"/>
 *         &lt;element name="directoryPermission" type="{https://circabc.europa.eu/Import/PermissionsSchema/1.0}directoryPermissions" minOccurs="0"/>
 *         &lt;element name="eventPermission" type="{https://circabc.europa.eu/Import/PermissionsSchema/1.0}eventPermissions" minOccurs="0"/>
 *         &lt;element name="newsgroupPermission" type="{https://circabc.europa.eu/Import/PermissionsSchema/1.0}newsgroupPermissions" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "emptyAccessProfile", propOrder = {
    "i18NTitles",
    "title",
    "i18NDescriptions",
    "description",
    "owner",
    "informationPermission",
    "libraryPermission",
    "directoryPermission",
    "eventPermission",
    "newsgroupPermission"
})
@XmlSeeAlso({
    ImportedProfile.class,
    AccessProfile.class
})
public class EmptyAccessProfile
    extends XMLElement
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "I18NTitle", namespace = "https://circabc.europa.eu/Import/PropertiesSchema/1.0")
    protected List<I18NProperty> i18NTitles;
    @XmlElement(namespace = "https://circabc.europa.eu/Import/PropertiesSchema/1.0", type = String.class)
    @XmlJavaTypeAdapter(TitlePropertyAdapter.class)
    protected TitleProperty title;
    @XmlElement(name = "I18NDescription", namespace = "https://circabc.europa.eu/Import/PropertiesSchema/1.0")
    protected List<I18NProperty> i18NDescriptions;
    @XmlElement(namespace = "https://circabc.europa.eu/Import/PropertiesSchema/1.0", type = String.class)
    @XmlJavaTypeAdapter(DescriptionPropertyAdapter.class)
    protected DescriptionProperty description;
    @XmlElement(namespace = "https://circabc.europa.eu/Import/PropertiesSchema/1.0", type = String.class)
    @XmlJavaTypeAdapter(OwnerPropertyAdapter.class)
    protected OwnerProperty owner;
    @XmlElement(defaultValue = "InfNoAccess")
    protected InformationPermissions informationPermission;
    @XmlElement(defaultValue = "LibNoAccess")
    protected LibraryPermissions libraryPermission;
    @XmlElement(defaultValue = "DirNoAccess")
    protected DirectoryPermissions directoryPermission;
    @XmlElement(defaultValue = "EveNoAccess")
    protected EventPermissions eventPermission;
    @XmlElement(defaultValue = "NwsNoAccess")
    protected NewsgroupPermissions newsgroupPermission;

    /**
     * Default no-arg constructor
     * 
     */
    public EmptyAccessProfile() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public EmptyAccessProfile(final List<I18NProperty> i18NTitles, final TitleProperty title, final List<I18NProperty> i18NDescriptions, final DescriptionProperty description, final OwnerProperty owner, final InformationPermissions informationPermission, final LibraryPermissions libraryPermission, final DirectoryPermissions directoryPermission, final EventPermissions eventPermission, final NewsgroupPermissions newsgroupPermission) {
        super();
        this.i18NTitles = i18NTitles;
        this.title = title;
        this.i18NDescriptions = i18NDescriptions;
        this.description = description;
        this.owner = owner;
        this.informationPermission = informationPermission;
        this.libraryPermission = libraryPermission;
        this.directoryPermission = directoryPermission;
        this.eventPermission = eventPermission;
        this.newsgroupPermission = newsgroupPermission;
    }

    /**
     * Gets the value of the i18NTitles property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the i18NTitles property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getI18NTitles().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link I18NProperty }
     * 
     * 
     */
    public List<I18NProperty> getI18NTitles() {
        if (i18NTitles == null) {
            i18NTitles = new ArrayList<I18NProperty>();
        }
        return this.i18NTitles;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public TitleProperty getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(TitleProperty value) {
        this.title = value;
    }

    /**
     * Gets the value of the i18NDescriptions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the i18NDescriptions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getI18NDescriptions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link I18NProperty }
     * 
     * 
     */
    public List<I18NProperty> getI18NDescriptions() {
        if (i18NDescriptions == null) {
            i18NDescriptions = new ArrayList<I18NProperty>();
        }
        return this.i18NDescriptions;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public DescriptionProperty getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(DescriptionProperty value) {
        this.description = value;
    }

    /**
     * Gets the value of the owner property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public OwnerProperty getOwner() {
        return owner;
    }

    /**
     * Sets the value of the owner property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwner(OwnerProperty value) {
        this.owner = value;
    }

    /**
     * Gets the value of the informationPermission property.
     * 
     * @return
     *     possible object is
     *     {@link InformationPermissions }
     *     
     */
    public InformationPermissions getInformationPermission() {
        return informationPermission;
    }

    /**
     * Sets the value of the informationPermission property.
     * 
     * @param value
     *     allowed object is
     *     {@link InformationPermissions }
     *     
     */
    public void setInformationPermission(InformationPermissions value) {
        this.informationPermission = value;
    }

    /**
     * Gets the value of the libraryPermission property.
     * 
     * @return
     *     possible object is
     *     {@link LibraryPermissions }
     *     
     */
    public LibraryPermissions getLibraryPermission() {
        return libraryPermission;
    }

    /**
     * Sets the value of the libraryPermission property.
     * 
     * @param value
     *     allowed object is
     *     {@link LibraryPermissions }
     *     
     */
    public void setLibraryPermission(LibraryPermissions value) {
        this.libraryPermission = value;
    }

    /**
     * Gets the value of the directoryPermission property.
     * 
     * @return
     *     possible object is
     *     {@link DirectoryPermissions }
     *     
     */
    public DirectoryPermissions getDirectoryPermission() {
        return directoryPermission;
    }

    /**
     * Sets the value of the directoryPermission property.
     * 
     * @param value
     *     allowed object is
     *     {@link DirectoryPermissions }
     *     
     */
    public void setDirectoryPermission(DirectoryPermissions value) {
        this.directoryPermission = value;
    }

    /**
     * Gets the value of the eventPermission property.
     * 
     * @return
     *     possible object is
     *     {@link EventPermissions }
     *     
     */
    public EventPermissions getEventPermission() {
        return eventPermission;
    }

    /**
     * Sets the value of the eventPermission property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventPermissions }
     *     
     */
    public void setEventPermission(EventPermissions value) {
        this.eventPermission = value;
    }

    /**
     * Gets the value of the newsgroupPermission property.
     * 
     * @return
     *     possible object is
     *     {@link NewsgroupPermissions }
     *     
     */
    public NewsgroupPermissions getNewsgroupPermission() {
        return newsgroupPermission;
    }

    /**
     * Sets the value of the newsgroupPermission property.
     * 
     * @param value
     *     allowed object is
     *     {@link NewsgroupPermissions }
     *     
     */
    public void setNewsgroupPermission(NewsgroupPermissions value) {
        this.newsgroupPermission = value;
    }

    public EmptyAccessProfile withI18NTitles(I18NProperty... values) {
        if (values!= null) {
            for (I18NProperty value: values) {
                getI18NTitles().add(value);
            }
        }
        return this;
    }

    public EmptyAccessProfile withI18NTitles(Collection<I18NProperty> values) {
        if (values!= null) {
            getI18NTitles().addAll(values);
        }
        return this;
    }

    public EmptyAccessProfile withTitle(TitleProperty value) {
        setTitle(value);
        return this;
    }

    public EmptyAccessProfile withI18NDescriptions(I18NProperty... values) {
        if (values!= null) {
            for (I18NProperty value: values) {
                getI18NDescriptions().add(value);
            }
        }
        return this;
    }

    public EmptyAccessProfile withI18NDescriptions(Collection<I18NProperty> values) {
        if (values!= null) {
            getI18NDescriptions().addAll(values);
        }
        return this;
    }

    public EmptyAccessProfile withDescription(DescriptionProperty value) {
        setDescription(value);
        return this;
    }

    public EmptyAccessProfile withOwner(OwnerProperty value) {
        setOwner(value);
        return this;
    }

    public EmptyAccessProfile withInformationPermission(InformationPermissions value) {
        setInformationPermission(value);
        return this;
    }

    public EmptyAccessProfile withLibraryPermission(LibraryPermissions value) {
        setLibraryPermission(value);
        return this;
    }

    public EmptyAccessProfile withDirectoryPermission(DirectoryPermissions value) {
        setDirectoryPermission(value);
        return this;
    }

    public EmptyAccessProfile withEventPermission(EventPermissions value) {
        setEventPermission(value);
        return this;
    }

    public EmptyAccessProfile withNewsgroupPermission(NewsgroupPermissions value) {
        setNewsgroupPermission(value);
        return this;
    }

}
