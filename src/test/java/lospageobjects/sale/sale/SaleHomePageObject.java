package lospageobjects.sale.sale;

import commons.BasePage;
import lospageuis.sale.sale.SaleHomePageUI;

public class SaleHomePageObject extends BasePage {

    public SaleHomePageObject() {
    }

    public String getTextAccount() {
        waitForElementVisible(SaleHomePageUI.ACCOUNT_SALE);
        return getElementText(SaleHomePageUI.ACCOUNT_SALE);
    }

    public NewCaseHomePageObject clickToIconCasesStartCase() {
        waitForAllElementVisible(SaleHomePageUI.CASES_FRAME);
        switchToFrameIframe(SaleHomePageUI.CASES_FRAME);
        clickToElement(SaleHomePageUI.ICON_CASES_START_CASE);
        return new NewCaseHomePageObject();
    }
}
