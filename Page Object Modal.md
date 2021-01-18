https://www.selenium.dev/documentation/en/guidelines_and_recommendations/page_object_models/


- Page objects themselves should never make verifications or assertions
- A page object does not necessarily need to represent all the parts of a page itself. The same principles used for page objects can be used to create “Page Component Objects” that represent discrete chunks of the page and can be included in page objects. These component objects can provide references the elements inside those discrete chunks, and methods to leverage the functionality provided by them. You can even nest component objects inside other component objects for more complex pages. If a page in the AUT has multiple components, or common components used throughout the site (e.g. a navigation bar), then it may improve maintainability and reduce code duplication.
