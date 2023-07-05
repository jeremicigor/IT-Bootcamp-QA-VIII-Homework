package domaci21_3.tests;

import domaci21_3.pages.SignUpPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

public class BaseTest {
    private WebDriver driver;
    private WebDriverWait wait;

    private SignUpPage signUpPage;

    @BeforeClass
    public void setUp() {


        System.setProperty("webdriver.chrome.driver", "C:\\Users\\igorj\\Desktop\\QA kurs\\0 Data\\Chrome Driver\\chromedriver.exe");
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        signUpPage = new SignUpPage(driver, wait);
    }

    public WebDriver getDriver() {
        return this.driver;
    }
    public WebDriverWait getWait(){
        return this.wait;
    }
    public SignUpPage getSignUpPage(){
        return this.signUpPage;
    }


    @AfterClass
    public void cleanUp() {
        driver.close();
    }
}
