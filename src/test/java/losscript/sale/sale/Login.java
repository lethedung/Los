package losscript.sale.sale;

import com.aventstack.extentreports.Status;
import commons.BaseTest;
import lospageobjects.sale.sale.SaleHomePageObject;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import lospageobjects.sale.sale.SaleLoginPageObject;
import reportconfig.ExtentTestManager;

import java.lang.reflect.Method;

import static commons.GlobalConstants.*;
import static org.testng.Assert.assertTrue;

public class Login extends BaseTest {
    private String account, accountInvalid, password, passwordInvalid;
    private String browserName;
    private SaleLoginPageObject saleLoginPage;
    private SaleHomePageObject saleHomePage;

    @BeforeClass
    public void beforeClass() {
        browserName = "chrome";
        saleLoginPage = new SaleLoginPageObject(SALE_LOGIN_URL);
        account = "sale1";
        accountInvalid = "a";
        password = "It123456";
        passwordInvalid = "a";
    }

    @Test
    public void loginEmptyData(Method method) {
        ExtentTestManager.startTest(method.getName(), "Input Empty Data");
        ExtentTestManager.getTest().log(Status.INFO, "Login - Step 01: Input Empty Account Textbox");
        saleLoginPage.inputToAccountTextbox("");

        ExtentTestManager.getTest().log(Status.INFO, "Login - Step 02: Input Empty Password Textbox");
        saleLoginPage.inputToPasswordTextbox("");

        ExtentTestManager.getTest().log(Status.INFO, "Login - Step 04: Click Button Login");
        saleLoginPage.clickToLoginButton();

        assertTrue(saleLoginPage.isTemporalMessageWarningDisplayed());
    }

    @Test
    public void loginInvalidData(Method method) {
        ExtentTestManager.startTest(method.getName(), "Input Invalid Data");
        ExtentTestManager.getTest().log(Status.INFO, "Login - Step 01: Input Invalid Account Textbox");
        saleLoginPage.inputToAccountTextbox(accountInvalid);

        ExtentTestManager.getTest().log(Status.INFO, "Login - Step 02: Input Invalid Password Textbox");
        saleLoginPage.inputToPasswordTextbox(passwordInvalid);

        ExtentTestManager.getTest().log(Status.INFO, "Login - Step 04: Click Button Login");
        saleLoginPage.clickToLoginButton();

        ExtentTestManager.getTest().log(Status.INFO, "Login - Step 04: Check Popup Error Displayed");
        assertTrue(saleLoginPage.isTemporalMessageWarningDisplayed());
    }

    @Test
    public void loginSuccess(Method method) {
        ExtentTestManager.startTest(method.getName(), "Login Success");
        ExtentTestManager.getTest().log(Status.INFO, "Login - Step 01: Input Account Textbox");
        saleLoginPage.inputToAccountTextbox(account);

        ExtentTestManager.getTest().log(Status.INFO, "Login - Step 02: Input Password Textbox");
        saleLoginPage.inputToPasswordTextbox(password);

        ExtentTestManager.getTest().log(Status.INFO, "Login - Step 04: Click Button Login");
        saleHomePage = saleLoginPage.clickToLoginButton();

        ExtentTestManager.getTest().log(Status.INFO, "Login - Step 05: Check Go To The Homepage");
        assertTrue(saleHomePage.getTextAccount().contains(account));
    }
}
