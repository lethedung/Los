package losscript.sale.sale;

import com.aventstack.extentreports.Status;
import commons.BaseTest;
import lospageobjects.sale.sale.SaleHomePageObject;
import lospageobjects.sale.sale.SaleLoginPageObject;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import reportconfig.ExtentTestManager;

import java.lang.reflect.Method;

import static commons.GlobalConstants.SALE_LOGIN_URL;
import static org.testng.Assert.assertTrue;

public class CreateNewCase extends BaseTest {
    private String account, accountInvalid, password, passwordInvalid;
    private String browserName;
    private SaleLoginPageObject saleLoginPage;
    private SaleHomePageObject saleHomePage;

    @BeforeClass
    public void beforeClass() {
        browserName = "chrome";
        saleLoginPage = new SaleLoginPageObject(SALE_LOGIN_URL);
        account = "sale1";
        password = "It123456";
    }

    @Test
    public void createNewCaseSuccess(Method method) {
        ExtentTestManager.startTest(method.getName(), "Login Success");
        ExtentTestManager.getTest().log(Status.INFO, "Login - Step 01: Input Account Textbox");
        saleLoginPage.inputToAccountTextbox(account);

        ExtentTestManager.getTest().log(Status.INFO, "Login - Step 02: Input Password Textbox");
        saleLoginPage.inputToPasswordTextbox(password);

        ExtentTestManager.getTest().log(Status.INFO, "Login - Step 04: Click Button Login");
        saleHomePage = saleLoginPage.clickToLoginButton();

        ExtentTestManager.getTest().log(Status.INFO, "Login - Step 05: Check Go To The Homepage");
        assertTrue(saleHomePage.getTextAccount().contains(account));

        ExtentTestManager.getTest().log(Status.INFO, "Login - Step 06: Click Icon Cases Start Case");
        saleHomePage.clickToIconCasesStartCase();
    }
}
