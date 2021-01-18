https://www.selenium.dev/documentation/en/guidelines_and_recommendations/page_object_models/


- Page objects themselves should never make verifications or assertions
- A page object does not necessarily need to represent all the parts of a page itself. The same principles used for page objects can be used to create “Page Component Objects” that represent discrete chunks of the page and can be included in page objects. These component objects can provide references the elements inside those discrete chunks, and methods to leverage the functionality provided by them. You can even nest component objects inside other component objects for more complex pages. If a page in the AUT has multiple components, or common components used throughout the site (e.g. a navigation bar), then it may improve maintainability and reduce code duplication.

http://www.tjmaher.com/2017/05/basic-appium-framework-part-four.html

"The Page Object Design Pattern provides the following advantages

1. There is a clean separation between test code and page specific code such as locators (or **their use** if you're using a UI Map) and layout.

2. There is a single repository for the services or operations offered by the page rather than having these services scattered throughout the tests.
