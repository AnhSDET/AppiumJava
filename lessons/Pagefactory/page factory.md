
https://github.com/SeleniumHQ/selenium/wiki/PageFactory

http://www.tjmaher.com/2017/05/basic-appium-framework-part-four.html

   <pre><code>public HomeScreenPage(AndroidDriver driver) {  
     this.driver = driver;  
     PageFactory.initElements(new AppiumFieldDecorator(driver, 30, TimeUnit.SECONDS), this);  
   } </code></pre>


If in our test we create a new instance of the HomePageScreen and pass an AndroidDriver to it, it will automatically initialize all mobile elements on the page, waiting up to thirty seconds if need be before failing this step.

Next, we call AppiumFieldDecorator. It is the "Default decorator for use with PageFactory. Will decorate 1) all of the WebElement fields and 2) List of WebElement that have @AndroidFindBy, @AndroidFindBys, or @iOSFindBy/@iOSFindBys annotation with a proxy that locates the elements using the passed in ElementLocatorFactory".

... What does that mean? I honestly have no clue.
