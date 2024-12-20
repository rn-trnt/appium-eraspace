package Eraspace;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class PageObjects {

  AndroidDriver driver;

  public PageObjects(AndroidDriver driver) {
    this.driver = driver;
  }

  By emailField = By.id("com.eraspace.app.membership:id/edtPhoneOrEmail");
  By passwordField = By.id("com.eraspace.app.membership:id/edtPassword");
  By homeLoginButton = By.id("com.eraspace.app.home:id/btnLogin");
  By memberLoginButton = By.id("com.eraspace.app.membership:id/btnLogin");
  By notificationModal = By.id("com.android.permissioncontroller:id/permission_message");
  By allowNotificationButton = By.id("com.android.permissioncontroller:id/permission_allow_button");
  By newAndroidVersionInformation = By.xpath("//android.widget.ScrollView/android.widget.LinearLayout");
  By nextButton = By.id("com.eraspace.app:id/container");
  By locationModal = By.id("com.android.permissioncontroller:id/permission_message");
  By allowLocationButton = By.id("com.android.permissioncontroller:id/permission_allow_foreground_only_button");
  By homeTooltip = By.id("com.eraspace.app:id/balloon_card");
  By skipTooltipButton = By.id("com.eraspace.app:id/btnSkip");
  By emailErrorMessage = By.id("com.eraspace.app:id/textinput_error");
  By loginErrorMessage = By.xpath("//android.widget.TextView[@resource-id=\"com.eraspace.app.membership:id/tvError\"]");
  By homePage = By.id("com.eraspace.app.home:id/msvHome");
  By homePagePoint = By.id("com.eraspace.app.home:id/layerPoint");

  public void setEmailField(String email) {
    driver.findElement(emailField).clear();
    driver.findElement(emailField).sendKeys(email);
  }

  public void setPasswordField(String password) {
    driver.findElement(passwordField).clear();
    driver.findElement(passwordField).sendKeys(password);
  }

  public void clickHomeLoginButton() {
    driver.findElement(homeLoginButton).click();
  }

  public WebElement getMemberLoginButton() {
    return driver.findElement(memberLoginButton);
  }

  public void clickMemberLoginButton() {
    driver.findElement(memberLoginButton).click();
  }

  public WebElement getNotificationModal() {
    return driver.findElement(notificationModal);
  }

  public void clickAllowNotificationModal() {
    driver.findElement(allowNotificationButton).click();
  }

  public WebElement getNewAndroidVersionInformation() {
    return driver.findElement(newAndroidVersionInformation);
  }

  public void clickNextButton() {
    driver.findElement(nextButton).click();
  }

  public WebElement getLocationModal() {
    return driver.findElement(locationModal);
  }

  public void clickAllowLocationButton() {
    driver.findElement(allowLocationButton).click();
  }

  public WebElement getHomeTooltip() {
    return driver.findElement(homeTooltip);
  }

  public void clickSkipTooltipButton() {
    driver.findElement(skipTooltipButton).click();
  }

  public WebElement getEmailErrorMessage() {
    return driver.findElement(emailErrorMessage);
  }

  public WebElement getLoginErrorMessage() {
    return driver.findElement(loginErrorMessage);
  }

  public WebElement getHomePage() {
    return driver.findElement(homePage);
  }

  public WebElement getHomePagePoint() {
    return driver.findElement(homePagePoint);
  }

  public void startingSteps(){
    /* if (getNotificationModal().isDisplayed()) {
      clickAllowNotificationModal();
    } */

    /* if(getNewAndroidVersionInformation().isDisplayed()){
      clickNextButton();
    } */

    /* if(page.getLocationModal().isDisplayed()){
      page.clickAllowLocationButton();
    } */

    if (getHomeTooltip().isDisplayed()) {
      clickSkipTooltipButton();
    }


  }
}

