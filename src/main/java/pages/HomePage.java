package pages;

import org.apache.logging.log4j.util.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import javax.swing.text.html.CSS;
import java.util.logging.XMLFormatter;

public class HomePage extends BasePage {


    @FindBy(xpath = "//div/img[@style='padding-right: 12px; padding-bottom: 4px; padding-top: 4px; max-height: 74px;']")
    private WebElement imageButton;

    public void clickImageButton(){
        clickElement(imageButton);
    }

    public void verifyImageButton(){
        verifyDisplayed(imageButton,"Image button is not displayed.");
    }

    @FindBy(css = "[data-icon='chalkboard-user']")
    private WebElement coursesButton;

    public void clickCoursesButton() {
        clickElement(coursesButton);
    }

    @FindBy(xpath = "//ms-layout-menu-button[@page='CALENDAR']")
    private WebElement calendarButton;

    public void clickCalendarButton() {
        clickElement(calendarButton);
    }

    @FindBy(xpath = "//ms-layout-menu-button[@page='ATTENDANCE]")
    private WebElement attendanceButton;

    public void clickAttendanceButton() {
        clickElement(attendanceButton);
    }

    @FindBy(xpath = "//ms-layout-menu-button[@page='ASSIGNMENT']")
    private WebElement assignmentButton;

    public void clickAssignmentButon(){
        clickElement(assignmentButton);
    }

    @FindBy(xpath = "//ms-layout-menu-button[@page='GRADING']")
    private WebElement gradingButton;

    public void clickGradingButton(){
        clickElement(gradingButton);
    }

    @FindBy(css = "[class='mdc-button mat-mdc-button-base mat-mdc-menu-trigger mat-mdc-button-wrapper mat-mdc-button mat-mdc-button-unchecked mat-unthemed']")
    private WebElement hamburgerMenüButton;

    public void clickHamburgerMenüButton(){
        clickElement(hamburgerMenüButton);
    }

    @FindBy(xpath = "//button[@class='mdc-icon-button mat-mdc-icon-button mat-mdc-button-base mat-mdc-tooltip-trigger mat-unthemed mat-mdc-tooltip-disabled']")
    private WebElement notificationButton;

    public void clickNotificationButton(){
        clickElement(notificationButton);
    }

    @FindBy(css = "[class='avatar-mini']")
    private WebElement profileButton;
                                                    // en sağda çıkan şapkalı simge
    public void clickProfileButton(){
        clickElement(profileButton);
    }


    @FindBy(css = "[class='username mr-12']")
    private WebElement profile2Button;            // üstteki butonla aynı şeyi açıyor.

    public void clickProfile2Button(){
        clickElement(profile2Button);
    }




    @FindBy(xpath = "//button[@class='mdc-icon-button mat-mdc-icon-button mat-mdc-button-base mat-mdc-tooltip-trigger mat-unthemed'] ")
    private WebElement messageBoxButton;

    public void clickMessageBoxButton(){
        clickElement(messageBoxButton);
    }

    public HomePage(WebDriver driver) {
        super(driver);
    }
}
