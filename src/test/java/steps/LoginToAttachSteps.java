package steps;

import PageObjects.LoginToAttach;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import utilities.BaseClass;

public class LoginToAttachSteps {
    WebDriver driver;
    private LoginToAttach loginToAttach;

    public LoginToAttachSteps() {
        driver = BaseClass.getDriver();
        loginToAttach = new LoginToAttach(driver);
    }

    @Given("I navigate to the webpage on which file has to be attached")
    public void navigateToWebPage() {
        loginToAttach.navigateToWebPage();
    }

    @Given("I click on the Choose file option")
    public void chooseFile() {
        loginToAttach.chooseFileButtonClick();
    }

    @Then("upload the file from the System")
    public void uploadFileFromSystem() {
loginToAttach.uploadFileFromSystem();
    }

    @Then("upload the file from the project folder")
    public void uploadfileFromFolder() {
loginToAttach.uploadFileFromFolder();
    }


}
