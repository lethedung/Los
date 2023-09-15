package losscript.sale.sale;

import com.aventstack.extentreports.Status;
import commons.BaseTest;
import lospageobjects.sale.sale.*;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import reportconfig.ExtentTestManager;

import java.lang.reflect.Method;

import static commons.BasePage.getRandomInt;
import static commons.GlobalConstants.PROJECT_PATH;
import static commons.GlobalConstants.SALE_LOGIN_URL;
import static org.testng.Assert.assertTrue;

public class CreateNewCase extends BaseTest {
    private String account, password, frontIDCartIMG, frontIDCartText, backIDCartIMG,
            backIDCartText, fullFaceIMG, fullFaceText, iDCardIssue, mobilePhone, temporaryAddressProvince,
            temporaryAddressDistrict, productCategory, schemeProduct, billType, billOwner, customerCodeBill,
            billAmount1, billAmount2, billAmount3, loanConsumer, loanTerm, applicationDate, saleDecision,
            pOADocument, customerAndStaffPhoto, customerPhotoInsideHouse, customerPhotoFrontHouse, serviceBill;
    private String browserName;
    private SaleLoginPageObject saleLoginPage;
    private SaleHomePageObject saleHomePage;
    private NewCaseHomePageObject newCaseHomePage;
    private CustomerIdentificationPageObject customerIdentificationPage;
    private InformationSalePageObject informationSalePage;

    @BeforeClass
    public void beforeClass() {
        browserName = "chrome";
        saleLoginPage = new SaleLoginPageObject(SALE_LOGIN_URL);
        account = "sale1";
        password = "It123456";
        frontIDCartIMG = PROJECT_PATH + "\\uploadFiles\\Front.jpg";
        frontIDCartText = "Mặt trước CMND/CCCD";
        backIDCartIMG = PROJECT_PATH + "\\uploadFiles\\Back.jpg";
        backIDCartText = "Mặt sau CMND/CCCD";
        fullFaceIMG = PROJECT_PATH + "\\uploadFiles\\Face.jpg";
        fullFaceText = "Ảnh khách hàng";
        iDCardIssue = "An Giang";
        mobilePhone = "09150" + getRandomInt();
        temporaryAddressProvince = "An Giang";
        temporaryAddressDistrict = "Huyện An Phú";
        productCategory = "Bill Facilities";
        schemeProduct = "BF03";
        billType = "Hóa đơn điện";
        billOwner = "Khách hàng";
        customerCodeBill = getRandomInt();
        billAmount1 = "2000000";
        billAmount2 = "2000000";
        billAmount3 = "2000000";
        loanConsumer = "20000000";
        loanTerm = "6 tháng";
        applicationDate = getCurrentDate();
        saleDecision = "Chuyển lên bước tiếp theo";
        pOADocument = "Chứng từ chứng minh cư trú (POA)";
        customerAndStaffPhoto = "Ảnh chụp khách hàng và nhân viên kinh doanh";
        customerPhotoInsideHouse = "Ảnh chụp Khách hàng đứng trong nhà";
        customerPhotoFrontHouse = "Ảnh chụp Khách hàng đứng trước nhà";
        serviceBill = "Hóa đơn dịch vụ";
    }

    @Test
    public void createNewCaseSuccess(Method method) {
        ExtentTestManager.startTest(method.getName(), "Login Success");
        ExtentTestManager.getTest().log(Status.INFO, "Step 01: Input Account Textbox");
        saleLoginPage.inputToAccountTextbox(account);

        ExtentTestManager.getTest().log(Status.INFO, "Step 02: Input Password Textbox");
        saleLoginPage.inputToPasswordTextbox(password);

        ExtentTestManager.getTest().log(Status.INFO, "Step 04: Click Button Login");
        saleHomePage = saleLoginPage.clickToLoginButton();

        ExtentTestManager.getTest().log(Status.INFO, "Step 05: Check Go To The Homepage");
        assertTrue(saleHomePage.getTextAccount().contains(account));

        ExtentTestManager.startTest(method.getName(), "Create NewCase Success");
        ExtentTestManager.getTest().log(Status.INFO, "Step 06: Click Icon Cases Start Case");
        newCaseHomePage = saleHomePage.clickToIconCasesStartCase();

        ExtentTestManager.getTest().log(Status.INFO, "Step 07: Click Customer Base Pricing - Sale (Sale Input Data And Upload Document)");
        customerIdentificationPage = newCaseHomePage.clickToCustomerBasePricing();

        ExtentTestManager.getTest().log(Status.INFO, "Step 08: Input Front ID Cart");
        customerIdentificationPage.inputFrontIDCart(frontIDCartIMG, frontIDCartText);

        ExtentTestManager.getTest().log(Status.INFO, "Step 09: Input Back ID Cart");
        customerIdentificationPage.inputBackIDCart(backIDCartIMG, backIDCartText);

        ExtentTestManager.getTest().log(Status.INFO, "Step 10: Input Full Face");
        customerIdentificationPage.inputFullFace(fullFaceIMG, fullFaceText);

        ExtentTestManager.getTest().log(Status.INFO, "Step 11: Click Complete Button");
        informationSalePage = customerIdentificationPage.clickCompleteButton();

        ExtentTestManager.getTest().log(Status.INFO, "Step 12: Input Identification Card Issue");
        informationSalePage.inputIDCardIssue(iDCardIssue);

        ExtentTestManager.getTest().log(Status.INFO, "Step 13: Input Phone");
        informationSalePage.inputMobilePhone(mobilePhone);

        ExtentTestManager.getTest().log(Status.INFO, "Step 14: Click Mobile Owner Status");
        informationSalePage.clickMobileOwnerStatus();

        ExtentTestManager.getTest().log(Status.INFO, "Step 15: Click Has Smart Phone");
        informationSalePage.clickHasSmartPhone();

        ExtentTestManager.getTest().log(Status.INFO, "Step 16: Input Temporary Address Province");
        informationSalePage.inputTemporaryAddressProvince(temporaryAddressProvince);

        ExtentTestManager.getTest().log(Status.INFO, "Step 17: Input Temporary Address District");
        informationSalePage.inputTemporaryAddressDistrict(temporaryAddressDistrict);

        ExtentTestManager.getTest().log(Status.INFO, "Step 18: Input Product Category");
        informationSalePage.inputProductCategory(productCategory);

        ExtentTestManager.getTest().log(Status.INFO, "Step 19: Input Scheme Product");
        informationSalePage.inputSchemeProduct(schemeProduct);

        ExtentTestManager.getTest().log(Status.INFO, "Step 20: Input Bill Type");
        informationSalePage.inputBillType(billType);

        ExtentTestManager.getTest().log(Status.INFO, "Step 21: Input Bill Owner");
        informationSalePage.inputBillOwner(billOwner);

        ExtentTestManager.getTest().log(Status.INFO, "Step 22: Input Bill Owner");
        informationSalePage.inputCustomerCodeBill(customerCodeBill);

        ExtentTestManager.getTest().log(Status.INFO, "Step 23: Input Bill Owner");
        informationSalePage.inputBillAmount1(billAmount1);

        ExtentTestManager.getTest().log(Status.INFO, "Step 24: Input Bill Owner");
        informationSalePage.inputBillAmount2(billAmount2);

        ExtentTestManager.getTest().log(Status.INFO, "Step 25: Input Bill Owner");
        informationSalePage.inputBillAmount3(billAmount3);

        ExtentTestManager.getTest().log(Status.INFO, "Step 26: Input Loan Consumer");
        informationSalePage.inputLoanConsumer(loanConsumer);

        ExtentTestManager.getTest().log(Status.INFO, "Step 27: Input Loan Term");
        informationSalePage.inputLoanTerm(loanTerm);

        ExtentTestManager.getTest().log(Status.INFO, "Step 28: Input Application Date");
        informationSalePage.inputApplicationDate(applicationDate);

        ExtentTestManager.getTest().log(Status.INFO, "Step 29: Click Validate Button");
        informationSalePage.clickValidateButton();

        ExtentTestManager.getTest().log(Status.INFO, "Step 30: Input Sale Decision");
        informationSalePage.inputSaleDecision(saleDecision);

        ExtentTestManager.getTest().log(Status.INFO, "Step 31: Click Complete Button");
        informationSalePage.clickCompleteButton();

        ExtentTestManager.getTest().log(Status.INFO, "Step 32: Input POA Document");
        informationSalePage.inputPOADocument(fullFaceIMG, pOADocument);

        ExtentTestManager.getTest().log(Status.INFO, "Step 33: Input Customer And Staff Photo");
        informationSalePage.inputCustomerAndStaffPhoto(fullFaceIMG, customerAndStaffPhoto);

        ExtentTestManager.getTest().log(Status.INFO, "Step 34: Input Customer Photo Inside House");
        informationSalePage.inputCustomerPhotoInsideHouse(fullFaceIMG, customerPhotoInsideHouse);

        ExtentTestManager.getTest().log(Status.INFO, "Step 35: Input Customer Photo Front House");
        informationSalePage.inputCustomerPhotoFrontHouse(fullFaceIMG, customerPhotoFrontHouse);

        ExtentTestManager.getTest().log(Status.INFO, "Step 36: Input Service Bill");
        informationSalePage.inputServiceBill(fullFaceIMG, serviceBill);

        ExtentTestManager.getTest().log(Status.INFO, "Step 37: Click Submit Button");
        informationSalePage.clickSubmitButton();

        ExtentTestManager.getTest().log(Status.INFO, "Step 38: Click Continue Button");
        saleHomePage = informationSalePage.clickContinueButton();
    }
}
