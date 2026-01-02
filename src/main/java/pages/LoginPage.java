package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {


// https://live.mersys.io/ (Çalışacağımız site)
    //------------------------//

    @FindBy(xpath = "//div[@class='mat-mdc-form-field-infix'][1]/input")
    private WebElement usernameInput;

    public void sendkeysUsernameInput(String username) {
        sendKeysToElement(usernameInput, username);
    }


    @FindBy(css = "input[formcontrolname='password']")
    private WebElement passwordInput;

    public void sendkeysPasswordInput(String password) {
        sendKeysToElement(passwordInput, password);
    }


    @FindBy(xpath = "span[class='mdc-button__label']")
    private WebElement loginButton;

    public void clickLoginButton(){
        clickElement(loginButton);
    }


    @FindBy(xpath = "//label[@class='mdc-label']")
    private WebElement rememberMeButton;

    public void clickRememberMeButton(){
        clickElement(rememberMeButton);
    }

    @FindBy(css = "[class='forgot-password'] ")
    private WebElement forgotPasswordButton;

    public void forgotPasswordButton(){
        clickElement(forgotPasswordButton);
    }


    public LoginPage(WebDriver driver) {
        super(driver);
    }
}