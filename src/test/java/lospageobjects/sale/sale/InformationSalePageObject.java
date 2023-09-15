package lospageobjects.sale.sale;

import commons.BasePage;
import commons.BasePageUI;
import lospageuis.sale.sale.InformationSalePageUI;

public class InformationSalePageObject extends BasePage {

    public InformationSalePageObject() {
    }

    public void inputIDCardIssue(String iDCardIssue) {
        waitForPMModalLoadingInvisible();
        scrollToElement(InformationSalePageUI.ID_CARD_ISSUE_PARENT);
        selectItemInDefaultDropdown(InformationSalePageUI.ID_CARD_ISSUE_PARENT, iDCardIssue);
    }

    public void inputMobilePhone(String mobilePhone) {
        scrollToElement(InformationSalePageUI.MOBILE_PHONE_INPUT);
        sendKeyToElement(InformationSalePageUI.MOBILE_PHONE_INPUT, mobilePhone);
    }

    public void clickMobileOwnerStatus() {
        scrollToElement(InformationSalePageUI.MOBILE_OWNER_STATUS_CHECKBOX);
        clickToElement(InformationSalePageUI.MOBILE_OWNER_STATUS_CHECKBOX);
    }

    public void clickHasSmartPhone() {
        scrollToElement(InformationSalePageUI.HAS_SMART_PHONE_CHECKBOX);
        clickToElement(InformationSalePageUI.HAS_SMART_PHONE_CHECKBOX);
    }

    public void inputTemporaryAddressProvince(String temporaryAddressProvince) {
        scrollToElement(InformationSalePageUI.TEMPORARY_ADDRESS_PROVINCE_INPUT);
        selectItemInDefaultDropdown(InformationSalePageUI.TEMPORARY_ADDRESS_PROVINCE_INPUT, temporaryAddressProvince);
    }

    public void inputTemporaryAddressDistrict(String temporaryAddressDistrict) {
        scrollToElement(InformationSalePageUI.TEMPORARY_ADDRESS_DISTRICT_INPUT);
        selectItemInDefaultDropdown(InformationSalePageUI.TEMPORARY_ADDRESS_DISTRICT_INPUT, temporaryAddressDistrict);
    }

    public void inputProductCategory(String productCategory) {
        scrollToElement(InformationSalePageUI.PRODUCT_CATEGORY_INPUT);
        selectItemInDefaultDropdown(InformationSalePageUI.PRODUCT_CATEGORY_INPUT, productCategory);
    }

    public void inputSchemeProduct(String schemeProduct) {
        scrollToElement(InformationSalePageUI.SCHEME_PRODUCT_INPUT);
        selectItemInDefaultDropdown(InformationSalePageUI.SCHEME_PRODUCT_INPUT, schemeProduct);
    }

    public void inputBillType(String billType) {
        scrollToElement(InformationSalePageUI.BILL_TYPE_INPUT);
        selectItemInDefaultDropdown(InformationSalePageUI.BILL_TYPE_INPUT, billType);
    }

    public void inputBillOwner(String billOwner) {
        scrollToElement(InformationSalePageUI.BILL_OWNER_INPUT);
        selectItemInDefaultDropdown(InformationSalePageUI.BILL_OWNER_INPUT, billOwner);
    }

    public void inputCustomerCodeBill(String customerCodeBill) {
        scrollToElement(InformationSalePageUI.CUSTOMER_CODE_BILL_INPUT);
        sendKeyToElement(InformationSalePageUI.CUSTOMER_CODE_BILL_INPUT, customerCodeBill);
    }

    public void inputBillAmount1(String billAmount1) {
        scrollToElement(InformationSalePageUI.BILL_AMOUNT1_INPUT);
        sendKeyToElement(InformationSalePageUI.BILL_AMOUNT1_INPUT, billAmount1);
    }

    public void inputBillAmount2(String billAmount2) {
        scrollToElement(InformationSalePageUI.BILL_AMOUNT2_INPUT);
        sendKeyToElement(InformationSalePageUI.BILL_AMOUNT2_INPUT, billAmount2);
    }

    public void inputBillAmount3(String billAmount3) {
        scrollToElement(InformationSalePageUI.BILL_AMOUNT3_INPUT);
        sendKeyToElement(InformationSalePageUI.BILL_AMOUNT3_INPUT, billAmount3);
    }

    public void inputLoanConsumer(String loanConsumer) {
        scrollToElement(InformationSalePageUI.LOAN_CONSUMER_INPUT);
        sendKeyToElement(InformationSalePageUI.LOAN_CONSUMER_INPUT, loanConsumer);
    }

    public void inputLoanTerm(String loanTerm) {
        scrollToElement(InformationSalePageUI.LOAN_TERM_INPUT);
        selectItemInDefaultDropdown(InformationSalePageUI.LOAN_TERM_INPUT, loanTerm);
    }

    public void inputApplicationDate(String applicationDate) {
        scrollToElement(InformationSalePageUI.APPLICATION_DATE_INPUT);
        sendKeyToElement(InformationSalePageUI.APPLICATION_DATE_INPUT, applicationDate);
    }

    public void clickValidateButton() {
        scrollToElement(InformationSalePageUI.VALIDATE_BUTTON);
        clickToElement(InformationSalePageUI.VALIDATE_BUTTON);
    }

    public void inputSaleDecision(String saleDecision) {
        waitForPMModalLoadingInvisible();
        scrollToElement(InformationSalePageUI.SALE_DECISION_INPUT);
        selectItemInDefaultDropdown(InformationSalePageUI.SALE_DECISION_INPUT, saleDecision);
    }

    public void clickCompleteButton() {
        waitForPMModalLoadingInvisible();
        scrollToElement(InformationSalePageUI.COMPLETE_BUTTON);
        clickToElement(InformationSalePageUI.COMPLETE_BUTTON);
    }

    public void inputPOADocument(String fullFaceIMG, String pOADocument) {
        waitForContainerLoadingInvisible();
        uploadImage(BasePageUI.DYNAMIC_INPUT_IMG, fullFaceIMG, pOADocument);
    }

    public void inputCustomerAndStaffPhoto(String fullFaceIMG, String customerAndStaffPhoto) {
        uploadImage(BasePageUI.DYNAMIC_INPUT_IMG, fullFaceIMG, customerAndStaffPhoto);
    }

    public void inputCustomerPhotoInsideHouse(String fullFaceIMG, String customerPhotoInsideHouse) {
        uploadImage(BasePageUI.DYNAMIC_INPUT_IMG, fullFaceIMG, customerPhotoInsideHouse);
    }

    public void inputCustomerPhotoFrontHouse(String fullFaceIMG, String customerPhotoFrontHouse) {
        uploadImage(BasePageUI.DYNAMIC_INPUT_IMG, fullFaceIMG, customerPhotoFrontHouse);
    }

    public void inputServiceBill(String fullFaceIMG, String serviceBill) {
        uploadImage(BasePageUI.DYNAMIC_INPUT_IMG, fullFaceIMG, serviceBill);
    }

    public void clickSubmitButton() {
        waitForElementVisible(InformationSalePageUI.SERVER_BILL_IMG);
        waitForElementVisible(InformationSalePageUI.POA_DOCUMENT);
        waitForElementVisible(InformationSalePageUI.CUSTOMER_AND_STAFF_PHOTO);
        waitForElementVisible(InformationSalePageUI.CUSTOMER_PHOTO_INSIDE_HOUSE);
        waitForElementVisible(InformationSalePageUI.CUSTOMER_PHOTO_FRONT_HOUSE);
        scrollToElement(InformationSalePageUI.SUBMIT_BUTTON);
        clickToElement(InformationSalePageUI.SUBMIT_BUTTON);
    }

    public SaleHomePageObject clickContinueButton() {
        waitForElementVisible(InformationSalePageUI.CONTINUE_BUTTON);
        clickToElement(InformationSalePageUI.CONTINUE_BUTTON);
        return new SaleHomePageObject();
    }
}
