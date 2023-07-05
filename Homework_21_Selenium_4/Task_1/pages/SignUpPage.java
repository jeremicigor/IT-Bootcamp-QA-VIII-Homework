package domaci21_1.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SignUpPage extends BasePage {
    private WebElement nameField;
    private WebElement emailField;
    private WebElement passwordField;
    private WebElement confirmPasswordField;
    private WebElement signMeUpBtn;
    private WebElement tooShortPassErrorMsg;

    public SignUpPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public WebElement getNameField() {
        this.nameField = getDriver().findElement(By.id("name"));
        return nameField;
    }

    public WebElement getEmailField() {
        this.emailField = getDriver().findElement(By.id("email"));
        return emailField;
    }

    public WebElement getPasswordField() {
        this.passwordField = getDriver().findElement(By.id("password"));
        return passwordField;
    }

    public WebElement getConfirmPasswordField() {
        this.confirmPasswordField = getDriver().findElement(By.id("confirmPassword"));
        return confirmPasswordField;
    }

    public WebElement getSignMeUpBtn() {
        this.signMeUpBtn = getDriver().findElement(By.xpath("//button[@type ='submit']"));
        return signMeUpBtn;
    }
    public WebElement getTooShortPassErrorMsg(){
        this.tooShortPassErrorMsg = getDriver().findElement(By.xpath("//div[text()='This field must have no less than 5 characters']"));
        return tooShortPassErrorMsg;
    }

    public void enterDataToNameField(String text){
        getNameField().sendKeys(text);
    }
    public void enterDataToEmailField(String text){
        getEmailField().sendKeys(text);
    }
    public void enterDataToPasswordField(String text){
        getPasswordField().sendKeys(text);
    }
    public void enterDataToConfirmPasswordField(String text){
        getConfirmPasswordField().sendKeys(text);
    }
    public void clickSignMeUpBtn(){
        getSignMeUpBtn().click();
    }
    public void waitForTooShortPassErrorMsg(){
        getWait().until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='This field must have no less than 5 characters']")));
    }

    public void open(){
        getDriver().get("https://vue-demo.daniel-avellaneda.com/signup");
    }
}
