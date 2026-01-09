package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class MessagingPage extends BasePage {

    protected Actions actions = new Actions(driver);


    @FindBy(xpath = "(//span[@class='mdc-button__label']//*[@data-icon='bars'])[1]")
    private WebElement hamburgerMenu;

    @FindBy(xpath = "//button[contains(@class,'mat-mdc-menu-trigger') and contains(.,'Mesajlaşma')]")
    private WebElement messagingLink;

    @FindBy(xpath = "//button[.//span[text()='Mesaj Gönder']]")
    private WebElement newMessageOption;

    @FindBy(xpath = "//button[.//span[text()='Gelen Kutusu']]")
    private WebElement inboxOption;

    @FindBy(xpath = "//button[.//span[text()='Giden Kutusu']]")
    private WebElement outboxOption;

    @FindBy(xpath = "//button[.//span[text()='Çöp']]")
    private WebElement trashOption;

    @FindBy(xpath = "//button[@class='mdc-icon-button mat-mdc-icon-button mat-mdc-button-base mat-mdc-tooltip-trigger mat-badge mat-badge-secondary secondary mat-unthemed mat-badge-above mat-badge-after mat-badge-medium mat-badge-hidden']")
    private WebElement receiversIcon;

    @FindBy(xpath = "//input[@placeholder='İsim, Kullanıcı Adı veya E-posta']")
    private WebElement recipientSearchField;

    @FindBy(xpath = "//span[contains(text(), 'Ekle & Kapat')]")
    private WebElement addAndCloseButton;

    @FindBy(xpath = "//button[.//span[text()='Tablo']]")
    private WebElement tableIcon;

    @FindBy(xpath = "//span[contains(text(), 'Dosyaları Ekle')]")
    private WebElement attachFilesIcon;

    @FindBy(xpath = "//input[@id='ms-text-field-0']")
    private WebElement subjectField;

    @FindBy(xpath = "//button[.//span[text()='Gönder']]")
    private WebElement sendButton;

    @FindBy(xpath = "//div[contains(text(), 'Bu mesajı çöp kutusuna')]")
    private WebElement confirmationDialog;

    @FindBy(xpath = "//button[@class='mdc-button mat-mdc-button-base secondary mat-tonal-button mat-unthemed']")
    private WebElement confirmYesButton;

    @FindBy(xpath = "//div[contains(@class, 'file')] | //div[contains(@class, 'attachment')]")
    private WebElement fileAttachmentDialog;

    @FindBy(xpath = "(//tr[contains(@class,'mat-mdc-row')])[1]//div[@class='mdc-checkbox']")
    private WebElement attachFileCheckboxIcon;

    @FindBy(xpath = "//table[contains(@class, 'mat-mdc-table')]")
    private WebElement messageTable;

    @FindBy(xpath = "//tr[contains(@class,'mat-mdc-row')]")
    private WebElement firstRow;

    @FindBy(xpath = "//div[@class='tox-collection__item-label' and text()='Tablo']")
    private WebElement tableSubmenu;

    @FindBy(xpath = "//button[contains(., 'Dosyalarımdan')]")
    private WebElement myFilesOption;

    @FindBy(xpath = "//ms-button[@caption='GENERAL.BUTTON.SELECT']//button")
    private WebElement selectFileButton;

    @FindBy(xpath = "(//tr[contains(@class,'mat-mdc-row')])[1]//button[@confirm]")
    private WebElement deleteButton;

    @FindBy(xpath = "//ms-standard-button[@icon='sync']//button")
    private WebElement refreshIcon;


    public MessagingPage(WebDriver driver) { super(driver);
    }

    public void clickHamburgerMenu() {
        clickElement(hamburgerMenu);
    }
    public void hoverOverMessagingLink() {
        wait.until(ExpectedConditions.visibilityOf(messagingLink));
        actions.moveToElement(messagingLink).perform();
    }
    public void clickNewMessageOption() {
        clickElement(newMessageOption);
    }
    public void clickInboxOption() {
        clickElement(inboxOption);
    }
    public void clickOutboxOption() {
        clickElement(outboxOption);
    }
    public void clickTrashOption() {
        clickElement(trashOption);
    }
    public void clickAttachFileCheckBox() {
        clickElement(attachFileCheckboxIcon);
    }
    public boolean isSubmenuLinkVisible(String linkText) {
        try {
            String xpath = "//button[.//span[text()='" + linkText + "']]";
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
            return driver.findElement(By.xpath(xpath)).isDisplayed();
        } catch (TimeoutException | NoSuchElementException e) {
            return false;
        }
    }
    public void verifyNewMessagePageDisplayed() {
        wait.until(ExpectedConditions.visibilityOf(subjectField));
    }

    public void verifyTextEditorPresent() {
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(
            By.xpath("//iframe[contains(@id,'tiny-angular')]")
        ));
        driver.switchTo().defaultContent();
    }

    public void verifyInboxPageDisplayed() {
        verifyPageDisplayed("Gelen Kutusu");
    }

    public void verifyOutboxPageDisplayed() {
        verifyPageDisplayed("Giden Kutusu");
    }

    public void verifyTrashPageDisplayed() {
        verifyPageDisplayed("Çöp");
    }

    private void verifyPageDisplayed(String pageName) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(
            By.xpath("//span[contains(normalize-space(), '" + pageName + "')]")
        ));
    }

    public void verifyMessageListDisplayed() {
        wait.until(ExpectedConditions.visibilityOf(messageTable));
    }
    public void clickReceiversIcon() {
        clickElement(receiversIcon);
    }

    public void searchRecipientByTerm(String searchTerm) {
        sendKeysToElement(recipientSearchField, searchTerm);
    }
    public void selectRecipientOption(String recipientName) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(
            By.xpath("//tr[contains(@class,'mat-mdc-row')]")
        ));

        WebElement row = wait.until(ExpectedConditions.elementToBeClickable(
            By.xpath("//tr[contains(@class,'mat-mdc-row') and contains(.,'" + recipientName + "')]")
        ));
        row.click();
    }

    public void closeRecipientPanel() {
        clickElement(addAndCloseButton);
    }
    public void verifyRecipientDisplayedInField(String recipientName) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(
            By.xpath("//span[contains(text(), '" + recipientName + "')]")
        ));
    }

    public void verifyRecipientPanelDisplayed() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(
            By.xpath("//input[@placeholder='İsim, Kullanıcı Adı veya E-posta']")
        ));
    }

    public void verifyRecipientListFiltered() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(
            By.xpath("//tr[@role='row' and contains(@class,'mat-mdc-row')]")
        ));
    }
    public void clickSubjectField() {
        clickElement(subjectField);
    }
    public void enterSubject(String subject) {
        sendKeysToElement(subjectField, subject);
    }
    public void clickTextEditor() {
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(
            By.xpath("//iframe[contains(@id,'tiny-angular')]")
        ));
        driver.switchTo().defaultContent();
    }

    public void enterMessageBody(String message) {
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(
            By.xpath("//iframe[contains(@id,'tiny-angular')]")
        ));
        WebElement body = driver.findElement(By.xpath("//body[@id='tinymce']"));
        body.click();
        body.sendKeys(message);
        driver.switchTo().defaultContent();
    }

    public void selectAllTextInEditor() {
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(
            By.xpath("//iframe[contains(@id,'tiny-angular')]")
        ));
        WebElement body = driver.findElement(By.xpath("//body[@id='tinymce']"));
        body.sendKeys(Keys.chord(Keys.CONTROL, "a"));
        driver.switchTo().defaultContent();
    }

    public void copyTextInEditor() {
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(
            By.xpath("//iframe[contains(@id,'tiny-angular')]")
        ));
        WebElement body = driver.findElement(By.xpath("//body[@id='tinymce']"));
        body.sendKeys(Keys.chord(Keys.CONTROL, "c"));
        driver.switchTo().defaultContent();
    }

    public void pasteTextInEditor() {
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(
            By.xpath("//iframe[contains(@id,'tiny-angular')]")
        ));
        WebElement body = driver.findElement(By.xpath("//body[@id='tinymce']"));
        String currentText = body.getText();
        body.sendKeys(currentText);
        driver.switchTo().defaultContent();
    }
    public void clickTableIcon() {
        clickElement(tableIcon);
    }
    public void createTable(int rows, int cols) {
        wait.until(ExpectedConditions.elementToBeClickable(tableSubmenu));
        tableSubmenu.click();

        String ariaLabel = rows + " columns, " + cols + " rows";
        WebElement tablePicker = wait.until(ExpectedConditions.elementToBeClickable(
            By.xpath("//div[@role='button' and @aria-label='" + ariaLabel + "']")
        ));

        actions.moveToElement(tablePicker).click().perform();
    }

    public void clickAttachFilesIcon() {
        clickElement(attachFilesIcon);
    }

    public void selectFileFromMyFiles() {
        clickElement(myFilesOption);
    }

    public void selectFirstFileFromList() {
        wait.until(ExpectedConditions.visibilityOf(firstRow));
        clickAttachFileCheckBox();
        clickElement(selectFileButton);
    }

    public void clickSendButton() {
        clickElement(sendButton);
    }

    public void verifySuccessMessageDisplayed() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(
            By.xpath("//div[contains(text(), 'başarı') or contains(text(), 'Başarı')]")
        ));
    }

    public void verifyMessageInList(String messageSubject) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(
            By.xpath("//div[contains(text(), '" + messageSubject + "')]")
        ));
    }

    public void clickTrashIcon() {
        clickElement(deleteButton);
    }

    public void verifyDeleteConfirmationDisplayed() {
        wait.until(ExpectedConditions.visibilityOf(confirmationDialog));
    }

    public void clickConfirmYesButton() {
        clickElement(confirmYesButton);
    }
    public void clickRefreshIcon() {
        clickElement(refreshIcon);
    }

}
