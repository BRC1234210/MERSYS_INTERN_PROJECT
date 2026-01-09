package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.AssignmentPage;
import pages.HomePage;
import pages.LoginPage;
import pages.MessagingPage;
import utility.BaseDriver;

public class US_21_assignmentSteps {
    public Logger log = LogManager.getLogger(this.getClass());
    WebDriver driver;
    HomePage homePage;
    AssignmentPage assignmentPage;
    MessagingPage messagingPage;

    @Then("Click assignments button from hamburger menu")
    public void clickAssignmentsButtonFromHamburgerMenu() {
        driver= BaseDriver.getDriver();
        assignmentPage=new AssignmentPage(driver);
        homePage=new HomePage(driver);
        messagingPage=new MessagingPage(driver);
        homePage.clickAssignmentButton();
        log.info("Assignment button is clickable.");
    }

    @And("Verify assignments page opened")
    public void verifyAssignmentsPageOpened() {
        assignmentPage.verifyAssignmentText();
        log.info("Assignment page opened.");
    }

    @Then("Verify submit button is visible next to assignment")
    public void verifySubmitButtonIsVisibleNextToAssignment() {
        assignmentPage.verifySubmitButton();
        log.info("submit button is displayed.");
    }

    @And("Click assignment submit icon")
    public void clickAssignmentSubmitIcon() {
        assignmentPage.clickSubmitButton();
        log.info("Submit button is clickable.");
    }

    @Then("Verify assignment submission popup opened")
    public void verifyAssignmentSubmissionPopupOpened() {
        assignmentPage.verifySubmissionAttemptText();
        log.info("The submission popup opened");
    }

    @And("Write text in assignment editor")
    public void writeTextInAssignmentEditor(String message) {
        messagingPage.enterMessageBody(message);
        log.info("");
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
