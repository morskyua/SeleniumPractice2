package org.epam.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GmailLoginPage extends BasePage {
    @FindBy(id = "identifierId")
    private WebElement loginInput;

    @FindBy(xpath = "//span[text()='Next']")
    private WebElement nextLoginButton;

    @FindBy(xpath = "//*[@id=\"password\"]/div[1]/div/div[1]/input")
    private WebElement passwordInput;

    @FindBy(xpath = "//*[@id=\"passwordNext\"]/div/button")
    private WebElement nextPasswordButton;

    public WebElement getLoginInput() {
        return loginInput;
    }

    public WebElement getPasswordInput() {
        return passwordInput;
    }

    public WebElement getNextLoginButton() {
        return nextLoginButton;
    }

    public WebElement getNextPasswordButton() {
        return nextPasswordButton;
    }

    public void login(String login, String password) {
        getLoginInput().sendKeys(login);
        getNextLoginButton().click();
        getPasswordInput().sendKeys(password);
        getNextPasswordButton().click();
    }
}
