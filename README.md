# AppiumJava
Appium Android iOS Maven TestNG Jenkin

## How to get started with the Appium automation test

### I. Installtion all the dependencies - See this (TBU)

### II. Set up the  Appium 
- iOS/Android driver 
In order to run the test on what Android or iOS, you need a specific platform driver

`import io.appium.java_client.android.AndroidDriver;` 

`public static IOSDriver<IOSElement> driver;`

How to understand this  [IOSDriver<IOSElement> ](https://appium.github.io/java-client/io/appium/java_client/ios/IOSDriver.html)

- Setting up the test server – This is where the tester provides the parameters to run the server such as the port and host. 

`final String APPIUM_SERVER = "http://127.0.0.1:4723/wd/hub";`

`url = new URL(APPIUM_SERVER);`
 
- capabilities

            DesiredCapabilities capability = new DesiredCapabilities();
            capability.setCapability(MobileCapabilityType.PLATFORM_NAME, "iOS");
            capability.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone 12 Pro Max");
            capability.setCapability(MobileCapabilityType.PLATFORM_VERSION, "14.2");
            capability.setCapability(MobileCapabilityType.AUTOMATION_NAME, "XCUITest");
            capability.setCapability(MobileCapabilityType.UDID, "41E824F2-3169-4BF5-8289-1BB0E9091601");
            capability.setCapability(MobileCapabilityType.APP, "");
            capability.setCapability(MobileCapabilityType.NO_RESET, true);

