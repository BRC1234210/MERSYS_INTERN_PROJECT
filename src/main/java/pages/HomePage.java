package pages;

import org.apache.logging.log4j.util.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import javax.swing.text.html.CSS;
import java.util.logging.XMLFormatter;

public class HomePage extends BasePage {


    @FindBy(xpath = "//img[@style='padding-right: 12px; padding-bottom: 4px; padding-top: 4px; max-height: 74px;']")
    private WebElement technoStudyWebsiteButton;

    public void clickTechnoStudyWebsite(){
        clickElement(technoStudyWebsiteButton);
    }

    @FindBy(xpath = "//ms-layout-menu-button[@page='COURSES']")
    private WebElement coursesButton;

    public void clickCoursesButton() {
        clickElement(coursesButton);
    }

    @FindBy(xpath = "//ms-layout-menu-button[@page='CALENDAR']")
    private WebElement calendarButton;

    public void clickCalendarButton() {
        clickElement(calendarButton);
    }

    @FindBy(xpath = "//ms-layout-menu-button[@page='ATTENDANCE']")
    private WebElement attendanceButton;

    public void clickAttendanceButton() {
        clickElement(attendanceButton);
    }

    @FindBy(xpath = "//ms-layout-menu-button[@page='ASSIGNMENT']")
    private WebElement assignmentButton;

    public void clickAssignmentButton() {
        clickElement(assignmentButton);
    }

    @FindBy(xpath = "//ms-layout-menu-button[@page='GRADING']")
    private WebElement gradingButton;

    public void clickGradingButton() {
        clickElement(gradingButton);
    }

    @FindBy(xpath = "(//span[@class='mdc-button__label']//*[@data-icon='bars'])[1]")
    private WebElement hamburgerMenuButton;

    public void clickHamburgerMenu() {
        clickElement(hamburgerMenuButton);
    }

    @FindBy(xpath = "//button[@class='mdc-icon-button mat-mdc-icon-button mat-mdc-button-base mat-mdc-tooltip-trigger mat-unthemed mat-mdc-tooltip-disabled']")
    private WebElement notificationButton;

    public void clicknotificationButton() {
        clickElement(notificationButton);
    }

    @FindBy(xpath = "//button[@class='mdc-icon-button mat-mdc-icon-button mat-mdc-button-base mat-mdc-tooltip-trigger mat-unthemed']")
    private WebElement messageButton;

    public void clickMessageButton() {
        clickElement(messageButton);
    }

    @FindBy(xpath = "//button[@class='mdc-button mat-mdc-button-base mat-mdc-menu-trigger user-button mat-mdc-button mat-unthemed']")
    private WebElement profileButton;

    public void clickProfileButton() {
        clickElement(profileButton);
    }

    @FindBy(xpath = "//span[@style='font-size: 20px; padding-top: 4px;']")
    private WebElement welcomeText;

    public void verifyHomePage(){
        verifyDisplayed(welcomeText,"welcome text is not displayed");
    }

    public HomePage(WebDriver driver) {
        super(driver);
    }
}
