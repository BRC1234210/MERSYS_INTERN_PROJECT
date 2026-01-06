package StepDefinitions;

import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import pages.AssignmentPage;
import pages.HomePage;
import utility.BaseDriver;

public class US_20_Assignment_Feature {

    WebDriver driver;
    HomePage homePage;
    AssignmentPage assignmentPage;

    @Then("The student clicks the assignments button on the hamburger menu")
    public void theStudentClicksTheAssignmentsButtonOnTheHamburgerMenu() throws InterruptedException {
        driver = BaseDriver.getDriver();

        assignmentPage = new AssignmentPage(driver);
        homePage = new HomePage(driver);

        homePage.clickAssignmentButton();


    }

    @Then("The student clicks the i button to the right of the assignments on the assignment list")
    public void theStudentClicksTheIButtonToTheRightOfTheAssignmentsOnTheAssignmentList() throws InterruptedException {
        assignmentPage.iIcon();
        Thread.sleep(3000);
        driver.navigate().back();

        Thread.sleep(3000);
    }

    @Then("The student clicks the favorite button to the right of the assignments on the assignment list")
    public void theStudentClicksTheFavoriteButtonToTheRightOfTheAssignmentsOnTheAssignmentList() throws InterruptedException {
        assignmentPage.starButton();


    }
}

