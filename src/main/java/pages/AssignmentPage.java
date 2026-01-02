package pages;

import io.cucumber.java.de.Wenn;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AssignmentPage extends BasePage{

    @FindBy(xpath = "mat-mdc-form-field w-100-p mat-mdc-form-field-type-mat-select mat-form-field-appearance-outline mat-primary ng-valid mat-form-field-animations-enabled ng-touched ng-dirty")
    private WebElement classSelect;// show All yazan select butonu

    public void classSelect(){
        clickElement(classSelect);
    }
    @FindBy(xpath = "//div[@id='mat-select-value-25']")
    private WebElement statusSelect;        // statüs yazan select butonu

    public void statusSelect(){
        clickElement(statusSelect);
    }
    @FindBy(xpath = "//span[@class='iso']")
    private WebElement defaultViewSelect;    // default view yazan search ün yanındaki select

    public void defaultViewSelect(){
        clickElement(defaultViewSelect);
    }
    @FindBy(xpath = "//ms-search-button[@id='ms-search-button-9']")
    private WebElement searchButton;

    public void searchButton(){
        clickElement(searchButton);
    }

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
    @FindBy(xpath = "(//ms-icon-button[@icon='star'])[4]")
    private WebElement starButton;       // favorite button

    public void starButton(){
        clickElement(starButton);
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

    public void submitButton(){
        clickElement(submitButton);
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
