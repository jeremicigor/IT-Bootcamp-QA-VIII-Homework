package domaci21_3.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SignUpTests extends BaseTest {

    @Test
    public void varifyIfAttributeTypeInEmailFieldIsEmail() {
        getSignUpPage().open();
        Assert.assertEquals(getSignUpPage().getEmailField().getAttribute("type"), "email");
    }

    @Test
    public void varifyIfAttributeTypeInPasswordFieldIsPassword() {
        getSignUpPage().open();
        Assert.assertEquals(getSignUpPage().getPasswordField().getAttribute("type"), "password");
    }

    @Test
    public void varifyIfThereIsSignUpInUrl() {
        getSignUpPage().open();
        Assert.assertTrue(getDriver().getCurrentUrl().contains("signup"));
    }

    @Test
    public void varifyIfLeavingAllFieldsEmptyWillAllowSignUp() {
        getSignUpPage().open()
                .clickSignMeUpBtn();
        Assert.assertEquals(getDriver().getCurrentUrl(), "https://vue-demo.daniel-avellaneda.com/signup");
    }

    @Test
    public void varifyIfLeavingNameFieldEmptyWillAllowSignUp() {
        getSignUpPage().open()
                .enterDataToEmailField("kjaskj1@gmail.com")
                .enterDataToPasswordField("salkjdlkjsad")
                .enterDataToConfirmPasswordField("salkjdlkjsad");
        Assert.assertEquals(getDriver().getCurrentUrl(), "https://vue-demo.daniel-avellaneda.com/signup");
    }

    @Test
    public void varifyIfEnteringInvalidEmailWillAllowSignUp() {
        getSignUpPage().open()
                .enterDataToNameField("Ikgjane")
                .enterDataToEmailField("alsdkjnb")
                .enterDataToPasswordField("kfjhaklsjfaklj")
                .enterDataToConfirmPasswordField("kfjhaklsjfaklj");
        Assert.assertEquals(getDriver().getCurrentUrl(), "https://vue-demo.daniel-avellaneda.com/signup");
    }

    @Test
    public void varifyIfEnteringTooShortPasswordWillAllowSignUp() {
        getSignUpPage().open()
                .enterDataToNameField("aklsjdebb2")
                .enterDataToEmailField("janjenell3@gmail.com")
                .enterDataToPasswordField("1332")
                .enterDataToConfirmPasswordField("1332")
                .waitForTooShortPassErrorMsg();
        Assert.assertTrue(getSignUpPage().getTooShortPassErrorMsg().isDisplayed());
    }
}