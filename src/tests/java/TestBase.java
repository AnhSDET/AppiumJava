import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.android.AndroidDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.BeforeSuite;

public class TestBase {
    public static URL url;//why you declare this? because URL is a class and you want to ....
    public static IOSDriver<IOSElement> driver;// why you need this?

    @BeforeSuite
    public void setUpAppium() {

        try {
            final String APPIUM_SERVER = "http://127.0.0.1:4723/wd/hub";
            url = new URL(APPIUM_SERVER);

            DesiredCapabilities capability = new DesiredCapabilities();
            capability.setCapability(MobileCapabilityType.PLATFORM_NAME, "iOS");
            capability.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone 12 Pro Max");
            capability.setCapability(MobileCapabilityType.PLATFORM_VERSION, "14.2");
            capability.setCapability(MobileCapabilityType.AUTOMATION_NAME, "XCUITest");
            capability.setCapability(MobileCapabilityType.UDID, "41E824F2-3169-4BF5-8289-1BB0E9091601");
            capability.setCapability(MobileCapabilityType.APP, "");
            capability.setCapability(MobileCapabilityType.NO_RESET, true);

            driver = new IOSDriver<IOSElement>(url, capability);
            driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        } catch (Exception exception) {
            System.out.println("Cause is : " + exception.getCause());
            System.out.println("Message is :"+exception.getMessage());
            exception.printStackTrace();

        }
    }
}
