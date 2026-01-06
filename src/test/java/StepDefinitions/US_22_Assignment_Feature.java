package StepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import pages.AssignmentPage;
import pages.HomePage;
import utility.BaseDriver;

public class US_22_Assignment_Feature {
    WebDriver driver;
    AssignmentPage assignmentPage;
    HomePage homePage;


    @When("The student clicks the assignments button on the hamburger menu.")
    public void theStudentClicksTheAssignmentsButtonOnTheHamburgerMenu() {
        driver = BaseDriver.getDriver();

        assignmentPage = new AssignmentPage(driver);
        homePage = new HomePage(driver);

        homePage.clickAssignmentButton();
    }

    @Then("The student sees the search button on the Assign page and clicks on it.")
    public void theStudentSeesTheSearchButtonOnTheAssignPageAndClicksOnIt() {
        assignmentPage.searchButton();
    }

    @When("the student performs a search without applying any filters \\(Default Search), all assigned tasks are listed.")
    public void theStudentPerformsASearchWithoutApplyingAnyFiltersDefaultSearchAllAssignedTasksAreListed() {
        assignmentPage.defaultViewSelect();

        assignmentPage.selectDefaultView();

    }

    @Then("The student filters the search \\(Course, Status, Semester).")
    public void theStudentFiltersTheSearchCourseStatusSemester() throws InterruptedException {
        assignmentPage.classSelect();
        assignmentPage.mehmetSimsekSelect();
        assignmentPage.statusSelect();
        assignmentPage.resultsPublishedSelect();
        assignmentPage.statusSelect();
        assignmentPage.dueDate();
        assignmentPage.startStudyDay();
        Thread.sleep(3000);
        assignmentPage.nextMonthButton();
        assignmentPage.finishStudyDay();
        Thread.sleep(3000);
        assignmentPage.searchButton();
    }

    @Then("The student accesses a dropdown menu \\(Display Format ...) on the Assignment page to sort the search results.")
    public void theStudentAccessesADropdownMenuDisplayFormatOnTheAssignmentPageToSortTheSearchResults() {
        assignmentPage.verifyStarButton();
    }

    @Then("The student sorts the results by course, type, date, and table using the dropdown menu \\(Display Format ...).")
    public void theStudentSortsTheResultsByCourseTypeDateAndTableUsingTheDropdownMenuDisplayFormat() {
        assignmentPage.verifyStarButton();
    }
}
