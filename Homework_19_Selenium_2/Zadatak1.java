package predavanje1.domaci19;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zadatak1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\igorj\\Desktop\\QA kurs\\0 Data\\Chrome Driver\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://demoqa.com/text-box");

        driver.manage().window().maximize();

        WebElement fullName = driver.findElement(By.id("userName"));
        WebElement email = driver.findElement(By.id("userEmail"));
        WebElement addressCurrent = driver.findElement(By.id("currentAddress"));
        WebElement addressPermanent = driver.findElement(By.id("permanentAddress"));
        WebElement submitBtn = driver.findElement(By.id("submit"));

        Faker faker = new Faker();

        fullName.sendKeys(faker.name().fullName());
        email.sendKeys(faker.internet().emailAddress());
        addressCurrent.sendKeys(faker.address().fullAddress());
        addressPermanent.sendKeys(faker.address().fullAddress());

        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("window.scrollTo(0, 500)");

        submitBtn.click();

        WebElement fullNameCheck = driver.findElement(By.id("name"));
        WebElement emailCheck = driver.findElement(By.id("email"));

        if (fullNameCheck.isDisplayed()) {
            if (fullNameCheck.getText().contains(fullName.getText()) && emailCheck.getText().contains(email.getText())) {
                System.out.println("Data verified. Everything is fine.");
            } else {
                System.out.println("Data not verified. There is something wrong.");
            }
        }

        driver.close();

    }
}
