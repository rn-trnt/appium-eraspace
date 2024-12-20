package Eraspace;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class BaseTest {

  protected AndroidDriver driver;
  protected PageObjects page;

  @BeforeMethod
  public void setup() throws MalformedURLException {
    UiAutomator2Options options = new UiAutomator2Options()
        .setPlatformName("Android")
        .setPlatformVersion("15")
        .setDeviceName("emulator-5554")
        .setAppPackage("com.eraspace.app") // The App is already installed on Emulator Device
        .setAppActivity("com.eraspace.home.presentation.HomeActivity")
        .setAutomationName("UiAutomator2")
        .setNoReset(false)
        .setFullReset(false)
        .setClearSystemFiles(true);

    options.setCapability("autoGrantPermissions", true);

    // Initialize the AndroidDriver
    driver = new AndroidDriver(new URL("http://127.0.0.1:4723/"), options);
    driver.setSetting("enableMultiWindows", true);
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    page = new PageObjects(driver);
  }

  @AfterMethod
  public void tearDown() {
    if (driver != null) {
      driver.quit();
    }
  }
}
