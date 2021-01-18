https://www.ontestautomation.com/using-wrapper-methods-for-better-error-handling-in-selenium/

Using the standard Selenium methods such as click() and sendKeys() directly in my script often results in failures as a result of the weg page element being invisible, disabled or reloaded (this last example resulting in a StaleElementReferenceException). 

Even using implicit waits when creating the WebDriver object didn’t always lead to stable tests, and I refuse to use Thread.sleep() (and so should you!). 

**Also, I didn’t want to use individual WebDriverWait calls for every single object that needed to be waited on, since that introduces a lot of extra code that needs to be maintained.** 

So I knew I had to do something more intelligent for my tests to be reliable – and therefore valuable as opposed to a waste of time and money.
