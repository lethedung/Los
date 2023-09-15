package lospageobjects.sale.sale;

import commons.BasePage;
import commons.BasePageUI;
import lospageuis.sale.sale.CustomerIdPageUI;

public class CustomerIdentificationPageObject extends BasePage {

    public CustomerIdentificationPageObject() {
    }

    public void inputFrontIDCart(String frontIDCartIMG, String frontIDCartText) {
        waitForContainerLoadingInvisible();
        waitForAllElementVisible(CustomerIdPageUI.OPEN_CASES_FRAME);
        switchToFrameIframe(CustomerIdPageUI.OPEN_CASES_FRAME);
        uploadImage(BasePageUI.DYNAMIC_INPUT_IMG, frontIDCartIMG, frontIDCartText);
    }

    public void inputBackIDCart(String backIDCartIMG, String backIDCartText) {
        uploadImage(BasePageUI.DYNAMIC_INPUT_IMG, backIDCartIMG, backIDCartText);
    }

    public void inputFullFace(String fullFaceIMG, String fullFaceText) {
        uploadImage(BasePageUI.DYNAMIC_INPUT_IMG, fullFaceIMG, fullFaceText);
    }

    public InformationSalePageObject clickCompleteButton() {
        waitForElementVisible(CustomerIdPageUI.FRONT_IMG);
        waitForElementVisible(CustomerIdPageUI.BACK_IMG);
        waitForElementVisible(CustomerIdPageUI.FULL_FACE_IMG);
        scrollToElement(CustomerIdPageUI.COMPALELE_BUTTON);
        clickToElement(CustomerIdPageUI.COMPALELE_BUTTON);
        return new InformationSalePageObject();
    }
}
