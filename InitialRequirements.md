Initial requirements, an overview of what the system intends to achieve

# Requirements #

An overview of the system requirements are as follows

[customers](customers.md)
[MarketResearchTechnicalRequirements](MarketResearchTechnicalRequirements.md)

**Customers**
  * Search - Search by name, type, area, and other criteria TBC
  * Create - Ability to create new customers, this will be a form that should be populated by the user. Relevant checks will be implemented to stop duplicates/bad data etc.
  * Edit - Based on user privileges, the user will be able to modify certain criteria of the customer

**Projects**
  * Searching - User should be able to search for a project based on its name, type, associated customer, dates and other criteria TBC
  * User will be able to create a project, this will be done using a web form
  * User can update and add extra information to a project, updates, interactions with customer and so forth

**Market research**
  * User will be able to insert information based on each customer such as current systems they use and whether they are looking to upgrade


# Details #

> ## Customers ##

The main focus of the system will be around customers. When a user logs onto the application they will be able to review their customers and check the status of any potential projects they have with them. Each customer can have multiple projects assigned to them, this will enable the user to track potential projects, then when a project is won they can continue with further projects in the future

The customer will have a status, such as the following:
  * None Specified - For those not identified / visited
  * Potential Customer - Those with meetings / proposals in progress
  * Customer - Customer won, they have 1 of your systems

The customer entity should contain the following items:
  * Name
  * Address and contact details
  * Type, such as commercial, non-profit etc
  * User assigned to - Which sales rep is currently assigned this customer
  * Status - as mentioned above


> ## Projects ##

TBA
> ## Market Research ##

This page will present a form with market research information, allowing the user to enter information such as current DMS system, Student records system and such. This will allow the user to obtain profiling information about the client when speaking to them, this will in turn help us to create specific targetted reports, and to also make suggestions on products/services that can be sold to that client. For example, if we know client A has system X, we can inform them about our integration with system X at client B