package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FinancePage extends BasePage{
    public FinancePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//button[@mat-menu-item][2]")
    private WebElement financeBtn;

    @FindBy(xpath = "//button[@class='mat-mdc-menu-item mat-focus-indicator ng-star-inserted']")
    private WebElement myFinanceBtn;

    @FindBy(xpath = "//*[contains(@class,'ng-star-inserted') and contains(., 'Zilha Kalac')]")
    private WebElement student;

    @FindBy(xpath = "//*[@class='mat-sort-header-content' and contains(text(),'Student')]")
    private WebElement studentText;

    @FindBy(xpath = "(//*[@class='mat-ripple mat-mdc-button-ripple'])[4]")
    private WebElement threeDots;

    @FindBy(xpath = "//*[contains(text(),'Excel')]")
    private WebElement excellReport;

     @FindBy(xpath = "//*[contains(text(),'Pdf')]")
    private WebElement pdfReport;

     @FindBy(xpath = "(//*[@class='mdc-tab__content'])[2]")
     private WebElement feeBalanceDetail;

     @FindBy(xpath = "(//*[@class='mdc-data-table__content ng-star-inserted'])[2]")
     private WebElement installmentTable;

     @FindBy (xpath = "//div[@class='mat-sort-header-content' and contains (text() , 'Date')]")
     private WebElement dateInstallmentTable;


     public void clickFinanceAndMyFinaceBtns(){
         clickElement(financeBtn);
         clickElement(myFinanceBtn);
     }

     public void verifyFinancePage(){
         verifyDisplayed(studentText, "Student" );
     }

     public void clickStudentTable(){
         clickElement(studentText);
     }

     public void clickFeeBalanceDetailBtn(){
         clickElement(feeBalanceDetail);
     }
     public void verifyInsatllmentTableisVisible(){
         verifyDisplayed(dateInstallmentTable, "Date" );
     }


     public void clickThreedots(){
         clickElement(threeDots);
     }
     public void clickExcellRepost(){
         clickElement(excellReport);
     }







}
