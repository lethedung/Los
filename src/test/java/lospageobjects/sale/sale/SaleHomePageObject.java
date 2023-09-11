package lospageobjects.sale.sale;

import commons.BasePage;
import driver.DriverManager;
import lospageuis.sale.sale.SaleHomePageUI;

import java.util.Collection;

public class SaleHomePageObject extends BasePage {

    public SaleHomePageObject() {
    }

    public String getTextAccount() {
        waitForElementVisible(SaleHomePageUI.ACCOUNT_SALE);
        return getElementText(SaleHomePageUI.ACCOUNT_SALE);
    }

    public void clickToIconCasesStartCase() {
//        waitForLoadingIconInvisible();
        sleepInSecond(5);
        waitForElementClickable(SaleHomePageUI.ICON_CASES_START_CASE);
        clickToElement(SaleHomePageUI.ICON_CASES_START_CASE);
    }
}
