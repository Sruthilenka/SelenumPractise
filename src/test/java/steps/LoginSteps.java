package steps;

import PageObjects.LoginPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.Map;


public class LoginSteps {

    public WebDriver driver;
    private LoginPage loginPage;

    @Before
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        loginPage = new LoginPage(driver);
    }

    @Given("I am on login page")
    public void i_am_on_login_page() {
      /*  WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
        loginPage = new LoginPage(driver);*/
        loginPage.onLoginPage();
    }

    @When("I entered login credentials")
    public void i_entered_login_credentials(DataTable dataTable) {
        List<Map<String,String>> userdata = dataTable.asMaps(String.class, String.class);
        String userName = userdata.get(0).get("username");
        String password = userdata.get(0).get("password");

       loginPage.enterDetails(userName,password);
    }

    @Then("I click on Login button")
    public void i_click_on_Login_button() {
        loginPage.clickLogin();
    }

    @After
    public void tearDown(){
        if(driver!= null){
            driver.quit();
        }
    }

}
