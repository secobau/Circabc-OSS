describe("Create interest group", function() {
  beforeEach(function() {
    cy.login(
      Cypress.env("category.admin.username"),
      Cypress.env("category.admin.password")
    );
  });
  it("successfully created interest group ", function() {
    cy.visit("me/roles", {
      failOnStatusCode: false
    });
    cy.get(".group-title>a").click();
    cy.get(".page-header__actions>.cta").click();
    cy.get("[data-cy=name]").type(Cypress.env("interest.group.name"));
    cy.get("[data-cy=title]>.field>[data-cy=text]").type(
      Cypress.env("interest.group.title")
    );
    
    cy.get(
      "[data-cy=description]>.field>.editor-container>[data-cy=textarea]>.p-editor-container>.p-editor-content>.ql-editor"
    ).type(Cypress.env("interest.group.description"));
    cy.get(
      "[data-cy=contact]>.field>.editor-container>[data-cy=textarea]>.p-editor-container>.p-editor-content>.ql-editor"
    ).type(Cypress.env("interest.group.contact"));
    cy.get("[data-cy=ok]").click();
    cy.get("[data-cy=search]").type(Cypress.env("interest.group.admin.username"));
    cy.get("[data-cy=search-button]").click();
    cy.get("[data-cy=users]").select(
      Cypress.env("interest.group.admin.first.name") +
        " " +
        Cypress.env("interest.group.admin.last.name") +
        " (" +
        Cypress.env("interest.group.admin.email") +
        ")"
    );
    cy.get("[data-cy=select]").click();
    cy.get("[data-cy=ok]").click();
    cy.get("[data-cy=ok]").click();
  });
});
