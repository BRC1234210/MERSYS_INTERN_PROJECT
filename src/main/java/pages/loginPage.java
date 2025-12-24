package pages;

import io.qameta.allure.internal.shadowed.jackson.databind.ser.Serializers;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class loginPage extends BasePage {


    //------------------------//
@FindBy (xpath = "//input[@id='mat-input-0']")
private WebElement  usernameInput;

public void sendkeysUsername(String username){
    sendKeysToElement(usernameInput,username);
    }


    //---------------------//
@FindBy (xpath = "//input[@id='mat-input-1']")
private WebElement passwordInput;

public void sendkeysPassword(String password){
    sendKeysToElement(passwordInput,password);
}


//---------------------//
@FindBy(xpath = "//label[@class='mdc-label']")
private WebElement rememberMeButton;

public void clickRememberMeButton(){
    clickElement(rememberMeButton);
    }

    //-------------------------//
@FindBy(xpath = "//span[@class='mdc-button__label']")
private WebElement logInButton;

public void clickLoginButton(){
    clickElement(logInButton);
}


//---------------------//
@FindBy(xpath = "//a[@class='forgot-password']")
private WebElement forgotPasswordButton;

    public void clickForgotPasswordButton(){
        clickElement(forgotPasswordButton);
    }




public loginPage(WebDriver driver) {
        super(driver);
    }
}
