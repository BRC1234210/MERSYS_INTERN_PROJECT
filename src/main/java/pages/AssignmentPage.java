package pages;

import io.cucumber.java.de.Wenn;
import io.cucumber.java.eo.Se;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class AssignmentPage extends BasePage{

    @FindBy(xpath = "(//div[@class='mat-mdc-text-field-wrapper mdc-text-field mdc-text-field--outlined'])[1]")
    private WebElement classSelect;// show All yazan select butonu

    public void classSelect(){
        clickElement(classSelect);
    }
    @FindBy(xpath = "(//div[@class='mat-mdc-select-trigger'])[2]")
    private WebElement statusSelect;        // statüs yazan select butonu

    public void statusSelect(){
        clickElement(statusSelect);
    }

    @FindBy(xpath = "//button[@matbutton='tonal']")
    private WebElement defaultViewSelect;    // default view yazan search ün yanındaki select

    public void defaultViewSelect(){

        clickElement(defaultViewSelect);
    }

    @FindBy(xpath = "(//button[@class='mat-mdc-menu-item mat-focus-indicator'])[1]")
    private WebElement defaultView1Select;

    public void selectDefaultView(){
        clickElement(defaultView1Select);
    }

    @FindBy(xpath = "(//mat-option[@class='mat-mdc-option mdc-list-item'])[2]")
    private WebElement mehmetSimsekSelect;   // class filtreleme

    public void mehmetSimsekSelect(){
        clickElement(mehmetSimsekSelect);
    }

    @FindBy(xpath = "//mat-option[@id='mat-option-2']")
    private WebElement resultsPublishedSelect;  // status filtreleme

    public void resultsPublishedSelect(){
        clickElement(resultsPublishedSelect);
    }

    @FindBy(xpath = "//mat-datepicker-toggle[@class='mat-datepicker-toggle']")
    private WebElement dueDateSelect;    // tarih filtreleme

    public void dueDate(){
        clickElement(dueDateSelect);
    }

    @FindBy(xpath = "(//td[@data-mat-col='2'])[1]")
    private WebElement startStudyDay;   // başlangıç ders günü filtrelemesi

    public void startStudyDay(){
        clickElement(startStudyDay);
    }

    @FindBy(xpath = "(//button[@class='mdc-icon-button mat-mdc-icon-button mat-mdc-button-base mat-mdc-tooltip-trigger button-calendar mat-unthemed'])[4]")
    private WebElement nextMonthButton;

    public void nextMonthButton(){
        clickElement(nextMonthButton);
    }


    @FindBy(xpath = "(//td[@data-mat-col='2'])[5]")
    private WebElement finishStudyDay;   //ders bitiş günü filtrelemesi

    public void finishStudyDay(){
        clickElement(finishStudyDay);
    }


    @FindBy(xpath = "//ms-search-button[@id='ms-search-button-0']")
    private WebElement searchButton;

    public void searchButton(){
        clickElement(searchButton);
    }






    //-------------- ------------------- ---------------------

    @FindBy(xpath = "//*[@id=\"container-3\"]/ms-assignment-panel-student/div/div/div/div[2]/div[2]/div[2]/div/div[2]/div/div")
    private WebElement javaB8;       // java B8 tıklama locator ı default.

    public void defaultJavaB8(){
        clickElement(javaB8);
    }
    @FindBy(xpath = "(//ms-icon-button[@icon='info'])[3]")
    private WebElement iIcon;               // info button

    public void iIcon(){
        clickElement(iIcon);
    }
    @FindBy(xpath = "(//ms-icon-button[@icon='file-import'])[3]")
    private  WebElement fileImport;     // infonun yanındaki gönderim butonu

    public void verifyFileImport(){
        verifyDisplayed(fileImport,"Submission popup is not displayed");
    }
    public void fileImport(){
        clickElement(fileImport);
    }
    @FindBy(xpath = "(//ms-icon-button[@icon='star'])[2]")
    private WebElement starButton;       // favorite button

    public void starButton(){
        clickElement(starButton);
    }
    public void verifyStarButton(){
        verifyDisplayed(starButton,"star button is not displayed");
    }
    @FindBy(xpath = "//span[@style='font-size: 16px; font-weight: 500; padding-left: 8px;']")
    private WebElement AssignmentText;   // assignment sayfasının açıldığına dair verify

    public void verifyAssignmentText(){
        verifyDisplayed(AssignmentText,"Assignment text is nor displayed");
    }
    //----------- ------------  ------------ ---------//

    @FindBy(xpath = "//mat-select[@id='mat-select-41']")
    private WebElement attachmentTypeSelect;  // attachment type yazan select

    public void attachmentTypeSelect(){
        clickElement(attachmentTypeSelect);
    }
    @FindBy(xpath = "//ms-button[@icon='paperclip']")
    private WebElement attachFilesButton;  // attach files yazan buton

    public void attachFilesButton(){
        clickElement(attachFilesButton);
    }
    @FindBy(xpath = "//ms-confirm-button[@icon='file-import']")
    private WebElement submitButton;      // submit button

    public void clickSubmitButton(){
        clickElement(submitButton);
    }
    public void verifySubmitButton(){
        verifyDisplayed(submitButton,"Submit button is not displayed.");
    }
    @FindBy(xpath = "//span[@class='title dialog-title']")
    private WebElement submissionAttemptText;    // gönderim sayfasının açıldığına dair verify

    public void verifySubmissionAttemptText(){
        verifyDisplayed(submissionAttemptText,"Test message is not displayed");
    }
    @FindBy(xpath = "//ms-button[@icon='save']")
    private WebElement saveButton;      // save as draft yazan taslak kaydetme butonu

    public void saveButton(){
        clickElement(saveButton);
    }
    @FindBy(xpath = "//mat-panel-description[@style='padding-top: 4px; padding-right: 20px !important; display: flex; align-items: center;']")
    private WebElement succesfullysave;    // taslağın kaydedildiğini doğrulama

    public void verifySuccesfullysave(){
        verifyDisplayed(succesfullysave,"The message could not be saved.");
    }
    @FindBy(xpath = "//strong[@style='color: rgb(30 41 59/1);']")
    private WebElement confirmText;      // göndermek için onay penceresinin verify

    public void verifyConfirmText(){
        verifyDisplayed(confirmText,"The confirmation window did not open.");
    }
    @FindBy(xpath = "//button[@class='mdc-button mat-mdc-button-base secondary mat-tonal-button mat-unthemed']")
    private WebElement yesButton; // gönderme işlemini onaylama butonu

    public void yesButton(){
        clickElement(yesButton);
    }
    @FindBy(xpath = "mat-panel-description[@style='padding-top: 4px; padding-right: 20px !important; display: flex; align-items: center;']")
    private WebElement succesfullySend;   // gönderme işlemini doğrulama

    public void verifySuccesfullySend(){
        verifyDisplayed(succesfullySend,"The message could not be sent.");
    }













    public AssignmentPage(WebDriver driver) {
        super(driver);
    }
}
