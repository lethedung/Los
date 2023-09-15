package lospageobjects.sale.sale;

import commons.BasePage;
import lospageuis.sale.sale.SaleHomePageUI;

public class NewCaseHomePageObject extends BasePage {

    public NewCaseHomePageObject() {
    }

    public CustomerIdentificationPageObject clickToCustomerBasePricing() {
        waitForAllElementVisible(SaleHomePageUI.CASES_SUB_FRAME);
        switchToFrameIframe(SaleHomePageUI.CASES_SUB_FRAME);
        doubleClick(SaleHomePageUI.CUSTOMER_BASE_PRICING);
        return new CustomerIdentificationPageObject();
    }
}
