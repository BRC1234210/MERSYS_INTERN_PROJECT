package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AssignmentPage extends BasePage{

    @FindBy(xpath = "mat-mdc-form-field w-100-p mat-mdc-form-field-type-mat-select mat-form-field-appearance-outline mat-primary ng-valid mat-form-field-animations-enabled ng-touched ng-dirty")
    private WebElement classSelect;    // show All yazan select butonu

    @FindBy(xpath = "//div[@id='mat-select-value-25']")
    private WebElement statüsSelect;        // statüs yazan select butonu

    @FindBy(xpath = "//span[@class='iso']")
    private WebElement defaultViewSelect;    // default view yazan search ün yanındaki select

    @FindBy(xpath = "//ms-search-button[@id='ms-search-button-9']")
    private WebElement searchButton;

    @FindBy(xpath = "//*[@id=\"container-3\"]/ms-assignment-panel-student/div/div/div/div[2]/div[2]/div[2]/div/div[2]/div/div")
    private WebElement javaB8;       // java B8 tıklama locator ı.

    @FindBy(xpath = "(//ms-icon-button[@icon='info'])[3]")
    private WebElement iIcon;               // info button

    @FindBy(xpath = "(//ms-icon-button[@icon='file-import'])[3]")
    private  WebElement fileImport;     // infonun yanındaki gönderim butonu

    @FindBy(xpath = "(//ms-icon-button[@icon='star'])[4]")
    private WebElement starButton;       // favorite button

    //----------- ------------  ------------ ---------//

    @FindBy(xpath = "//mat-select[@id='mat-select-41']")
    private WebElement attachmentTypeSelect;  // attachment type yazan select


















    public AssignmentPage(WebDriver driver) {
        super(driver);
    }
}
