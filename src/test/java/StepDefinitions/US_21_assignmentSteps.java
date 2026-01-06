package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.AssignmentPage;
import pages.HomePage;
import pages.LoginPage;
import utility.BaseDriver;

public class US_21_assignmentSteps {
    WebDriver driver;
    HomePage homePage;
    AssignmentPage assignmentPage;

    @Then("Click assignments button from hamburger menu")
    public void clickAssignmentsButtonFromHamburgerMenu() {
        driver= BaseDriver.getDriver();
        assignmentPage=new AssignmentPage(driver);
        homePage=new HomePage(driver);
        homePage.clickAssignmentButton();
    }

    @And("Verify assignments page opened")
    public void verifyAssignmentsPageOpened() {
        
    }

    @Then("Verify submit button is visible next to assignment")
    public void verifySubmitButtonIsVisibleNextToAssignment() {
        
    }

    @And("Click assignment submit icon")
    public void clickAssignmentSubmitIcon() {
        
    }

    @Then("Verify assignment submission popup opened")
    public void verifyAssignmentSubmissionPopupOpened() {
        
    }

    @And("Write text in assignment editor")
    public void writeTextInAssignmentEditor() {
        
    }

    @And("Paste text into editor")
    public void pasteTextIntoEditor() {
        
    }

    @And("Add image or table into editor")
    public void addImageOrTableIntoEditor() {
        
    }

    @Then("Attach file to assignment")
    public void attachFileToAssignment() {
        
    }

    @And("Save assignment as draft")
    public void saveAssignmentAsDraft() {
        
    }

    @Then("Verify success message displayed for draft save")
    public void verifySuccessMessageDisplayedForDraftSave() {
        
    }

    @And("Click submit assignment button")
    public void clickSubmitAssignmentButton() {
        
    }

    @Then("Verify confirmation popup opened")
    public void verifyConfirmationPopupOpened() {
        
    }

    @When("Approve assignment submission")
    public void approveAssignmentSubmission() {
        
    }

    @Then("Verify success message displayed for submission")
    public void verifySuccessMessageDisplayedForSubmission() {
    }
}
