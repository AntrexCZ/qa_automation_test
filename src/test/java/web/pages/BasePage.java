package web.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public abstract class BasePage {
    public static final String BASE_URL = "https://docs.google.com/forms/d/e/1FAIpQLScNx9xK2LM-G3Z3fJXOQapiSK1IAoNXc_67MyS-soTfhDXotA/viewform?edit2=2_ABaOnudBUzANNcAatwMSdZRX42BDN6c7reN3GaPZ0GOcYX5lH2W_zT5ns985Wjc0TrUgjhc";
    private static final Duration DEFAULT_TIMEOUT_SECONDS = Duration.ofSeconds(10);

    protected WebDriver driver;
    protected WebDriverWait wait;

/*    public BasePage(WebDriver driver) {
        System.setProperty("webdriver.chrome.driver", "C://Users//antre//Downloads//chromedriver_win32_98");
        this.driver = driver;
        this.wait = new WebDriverWait(driver, DEFAULT_TIMEOUT_SECONDS);

    }*/

    protected void waitAndClick (WebElement locator) {
        wait.until(ExpectedConditions.elementToBeClickable(locator)).click();
    }

    protected WebElement waitVisibility(WebElement locator) {
        return wait.until(ExpectedConditions.visibilityOf(locator));
    }

    @FindBy(id = "div#i6")
    public static WebElement FirstCheckBox;

    @FindBy(id = "div#i15")
    private WebElement SecondCheckBox;

    @FindBy(className = "div[class*=\"Checked\"]")
    public WebElement CheckBoxChecked;

    @FindBy(className="quantumWizTextinputPaperinputInputArea")
    private WebElement DateTime;

    @FindBy(className = "freebirdFormviewerComponentsQuestionBaseErrorText")
    private WebElement ThirdQuestionValidationError;






}
