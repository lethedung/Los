package lospageobjects.sale.sale;

import commons.BasePage;
import driver.DriverManager;
import lospageuis.sale.sale.SaleLoginPageUI;

import static commons.GlobalConstants.SALE_LOGIN_URL;

public class SaleLoginPageObject extends BasePage {

    public SaleLoginPageObject(String loginUrl) {
        openPageUrl(loginUrl);
    }

    public void openLoginSale() {
        DriverManager.getDriver().get(SALE_LOGIN_URL);
    }

    public SaleHomePageObject clickToLoginButton() {
        waitForElementClickable(SaleLoginPageUI.LOGIN_BUTTON);
        clickToElement(SaleLoginPageUI.LOGIN_BUTTON);
        return new SaleHomePageObject();
    }

    public void inputToAccountTextbox(String account) {
        waitForElementVisible(SaleLoginPageUI.ACCOUNT_TEXTBOX);
        sendKeyToElement(SaleLoginPageUI.ACCOUNT_TEXTBOX, account);
    }

    public void inputToPasswordTextbox(String password) {
        waitForElementVisible(SaleLoginPageUI.PASSWORD_TEXTBOX);
        sendKeyToElement(SaleLoginPageUI.PASSWORD_TEXTBOX, password);
    }

    public boolean isTemporalMessageWarningDisplayed() {
        waitForElementVisible(SaleLoginPageUI.TEMPORAL_MESSAGE_WARNING);
        return isElementDisplay(SaleLoginPageUI.TEMPORAL_MESSAGE_WARNING);
    }
}
