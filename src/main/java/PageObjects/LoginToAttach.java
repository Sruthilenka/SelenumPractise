package PageObjects;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginToAttach {
    private WebDriver driver;

    public LoginToAttach(WebDriver driver) {
        this.driver = driver;
    }

    //locators
    private final By uploadFile = By.xpath("//input[@name='userfile']");

    public void navigateToWebPage(){
        driver.get("https://ps.uci.edu/~franklin/doc/file_upload.html");
    }

    public void chooseFileButtonClick(){
        driver.findElement(uploadFile).click();
    }

    public void uploadFileFromSystem(){
        driver.findElement(uploadFile).sendKeys("/Users/sruthilenka/Downloads/uploadimage.jpeg");

    }
    public void uploadFileFromFolder(){
    String projectPath = System.getProperty("user.dir");
    driver.findElement(uploadFile).sendKeys(projectPath+"/Files/uploadimage.jpeg");
    }
}

