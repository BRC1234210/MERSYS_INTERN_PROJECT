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

    @FindBy(css = "[data-icon='user-graduate']")
    private WebElement student;

    @FindBy(xpath = "(//*[@class='mat-ripple mat-mdc-button-ripple'])[4]")
    private WebElement threeDots;

    @FindBy(xpath = "//*[contains(text(),'Excel')]")
    private WebElement excellReport;

     @FindBy(xpath = "//*[contains(text(),'Pdf')]")
    private WebElement pdfReport;


}
