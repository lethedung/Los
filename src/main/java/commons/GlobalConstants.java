package commons;

import java.io.File;

public class GlobalConstants {
    public static final String PROJECT_PATH = System.getProperty("user.dir");
    public static final String JAVA_VERSION = System.getProperty("java.version");
    public static final String REPORT_NG_SCREENSHOT = PROJECT_PATH + File.separator + "reportNGImages" + File.separator;
    public static final int SHORT_TIMEOUT = 1;
    public static final int THREE_SECONDS = 3;
    public static final long FIVE_SECONDS = 5;
    public static final int LONG_TIMEOUT = 30;
    public static final String SALE_LOGIN_URL = "http://dev-dsa.shbfinance.com.vn/sysshbf/en/neoclassic/login/login";
    public static final String TEST_LOGIN_URL = "http://10.0.3.10:7777/forms/frmservlet?config=shbf";
}
