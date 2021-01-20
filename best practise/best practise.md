https://discuss.appium.io/t/pageobject-initialization-best-practices/13483

**About the Page Factory** - how it's clean - see the code
<pre><code>
    // region Identifiers
    final String IOS_USERNAME_FIELD = "SignInUsernameField";

    // endregion

    @iOSFindBy(accessibility = IOS_USERNAME_FIELD)
    @AndroidFindBy(uiAutomator = ANDROID_USERNAME_FIELD)
    private MobileElement usernameField;
; </code></pre>


http://www.tjmaher.com/2017/05/build-basic-appium-framework-install.html

**about the parameter**

<pre><code>AndroidDriver driver = new AndroidDriver(url, caps);</code></pre> 

Here, we are instantiating a new AndroidDriver, giving it the properties of what we set up as a url, and the DesiredCapabilities.

A sidenote about clean code: Imagine if we had called the DesiredCapabilities variable, "capabilites"... and we decided not to use the URL class. Then this line would have looked like:

AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);

... Writing it the way we did was a bit cleaner, no?
