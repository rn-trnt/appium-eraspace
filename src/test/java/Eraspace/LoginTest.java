package Eraspace;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

  @Test(priority = 1)
  public void invalidEmailLogin() throws InterruptedException {

    Thread.sleep(2000);
    page.startingSteps();

    page.clickHomeLoginButton();
    Assert.assertFalse(page.getMemberLoginButton().isEnabled());

    page.setEmailField("invalid@email.com");
    page.setPasswordField("invalid password");
    Assert.assertFalse(page.getMemberLoginButton().isEnabled());
    Assert.assertEquals(page.getEmailErrorMessage().getText(), "Email belum terdaftar");
  }

  @Test(priority = 2)
  public void invalidEmailFormatLogin() throws InterruptedException {

    Thread.sleep(2000);
    page.startingSteps();

    page.clickHomeLoginButton();
    Assert.assertFalse(page.getMemberLoginButton().isEnabled());

    page.setEmailField("invalid email format");
    page.setPasswordField("invalid password");
    Assert.assertFalse(page.getMemberLoginButton().isEnabled());
    Assert.assertEquals(page.getEmailErrorMessage().getText(), "Format email yang kamu masukkan salah");
  }

  @Test(priority = 3)
  public void invalidPhoneNumberLogin() throws InterruptedException {

    Thread.sleep(2000);
    page.startingSteps();

    page.clickHomeLoginButton();
    Assert.assertFalse(page.getMemberLoginButton().isEnabled());

    page.setEmailField("00000");
    page.setPasswordField("invalid password");
    Assert.assertFalse(page.getMemberLoginButton().isEnabled());
    Assert.assertEquals(page.getEmailErrorMessage().getText(), "Format no.handphone yang kamu masukkan salah");
  }

  @Test(priority = 4)
  public void invalidPasswordLogin() throws InterruptedException {

    Thread.sleep(2000);
    page.startingSteps();

    page.clickHomeLoginButton();
    Assert.assertFalse(page.getMemberLoginButton().isEnabled());

    page.setEmailField("trnt.automation@gmail.com");
    page.setPasswordField("invalid password");
    Assert.assertTrue(page.getMemberLoginButton().isEnabled());
    page.clickMemberLoginButton();

    // Assert.assertEquals(page.getLoginErrorMessage().getText(), "Email atau No Handphone belum terdaftar");
    Assert.assertEquals(page.getLoginErrorMessage().getText(), "Bad Request");
  }

  @Test(priority = 5)
  public void validLogin() throws InterruptedException {

    Thread.sleep(2000);
    page.startingSteps();

    page.clickHomeLoginButton();
    Assert.assertFalse(page.getMemberLoginButton().isEnabled());

    page.setEmailField("trnt.automation@gmail.com");
    page.setPasswordField("PasswordKuat@1");
    Assert.assertTrue(page.getMemberLoginButton().isEnabled());
    page.clickMemberLoginButton();

    Assert.assertTrue(page.getHomePage().isDisplayed());
    Assert.assertTrue(page.getHomePagePoint().isDisplayed());
  }

}
