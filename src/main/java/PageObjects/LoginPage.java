package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class LoginPage {

    private WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    //locators
    private final By userName = By.xpath("//input[@placeholder='Username']");
    private final By password = By.cssSelector("#password");
    private final By loginButton = By.xpath("//input[@type='submit']");

    public void onLoginPage(){
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
    }

    public void enterDetails(String userName1,String password1){
        driver.findElement(userName).sendKeys(userName1);
        driver.findElement(password).sendKeys(password1);
    }

    public void clickLogin(){
        driver.findElement(loginButton).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(500));
    }
}
