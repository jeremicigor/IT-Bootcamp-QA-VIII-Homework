package domaci21_2.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SignUpTests extends BaseTest{

    @Test
    public void varifyIfAttributeTypeInEmailFieldIsEmail(){
        getSignUpPage().open();
        Assert.assertEquals(getSignUpPage().getEmailField().getAttribute("type"),"email");
    }
    @Test
    public void varifyIfAttributeTypeInPasswordFieldIsPassword(){
        getSignUpPage().open();
        Assert.assertEquals(getSignUpPage().getPasswordField().getAttribute("type"),"password");
    }
    @Test
    public void varifyIfThereIsSignUpInUrl(){
        getSignUpPage().open();
        Assert.assertTrue(getDriver().getCurrentUrl().contains("signup"));
    }
    @Test
    public void varifyIfLeavingAllFieldsEmptyWillAllowSignUp(){
        getSignUpPage().open();
        getSignUpPage().clickSignMeUpBtn();
        Assert.assertEquals(getDriver().getCurrentUrl(), "https://vue-demo.daniel-avellaneda.com/signup");
    }
    @Test
    public void varifyIfLeavingNameFieldEmptyWillAllowSignUp(){
        getSignUpPage().open();
        getSignUpPage().enterDataToEmailField("kjaskj1@gmail.com");
        getSignUpPage().enterDataToPasswordField("salkjdlkjsad");
        getSignUpPage().enterDataToConfirmPasswordField("salkjdlkjsad");
        Assert.assertEquals(getDriver().getCurrentUrl(), "https://vue-demo.daniel-avellaneda.com/signup");
    }
    @Test
    public void varifyIfEnteringInvalidEmailWillAllowSignUp(){
        getSignUpPage().open();
        getSignUpPage().enterDataToNameField("Ikgjane");
        getSignUpPage().enterDataToEmailField("alsdkjnb");
        getSignUpPage().enterDataToPasswordField("kfjhaklsjfaklj");
        getSignUpPage().enterDataToConfirmPasswordField("kfjhaklsjfaklj");
        Assert.assertEquals(getDriver().getCurrentUrl(), "https://vue-demo.daniel-avellaneda.com/signup");
    }
    @Test
    public void varifyIfEnteringTooShortPasswordWillAllowSignUp(){
        getSignUpPage().open();
        getSignUpPage().enterDataToNameField("aklsjdebb2");
        getSignUpPage().enterDataToEmailField("janjenell3@gmail.com");
        getSignUpPage().enterDataToPasswordField("1332");
        getSignUpPage().enterDataToConfirmPasswordField("1332");
        getSignUpPage().waitForTooShortPassErrorMsg();
        Assert.assertTrue(getSignUpPage().getTooShortPassErrorMsg().isDisplayed());
    }
}