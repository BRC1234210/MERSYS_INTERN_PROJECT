package StepDefinitions;

import hooks.Hooks;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.HomePage;
import pages.LoginPage;
import utility.BaseDriver;

public class US_01_SuccessLoginSteps {

    WebDriver driver;
    private static final Logger log = LoggerFactory.getLogger(US_01_SuccessLoginSteps.class);

    HomePage homePage;
    LoginPage loginPage;
    @When("Navigate to the webpage.")
    public void navigateToTheWebpage() {
        driver=Hooks.driver;
        homePage=new HomePage(driver);
        loginPage=new LoginPage(driver);
    }

    @Then("Enter username and password")
    public void enterUsernameAndPassword() {
        loginPage.sendkeysUsernameInput("baris_cansiz");
        loginPage.sendkeysPasswordInput("Hifamm2027.");
    }

    @Then("Click login button")
    public void clickLoginButton() {
        loginPage.clickLoginButton();
    }

    @Then("Verify Home page opened")
    public void verifyHomePageOpened() {
        homePage.verifyHomePage();
    }
}
