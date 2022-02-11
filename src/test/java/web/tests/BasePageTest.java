package web.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.jsoup.Connection;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import web.pages.BasePage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.time.Duration;
import java.util.concurrent.TimeUnit;


public class BasePageTest {


        WebDriver driver;

        @BeforeAll
        static void setupClass() {
            WebDriverManager.chromedriver().setup();
        }

        @BeforeEach
        void setupTest() {
            driver = new ChromeDriver();
        }


        @AfterEach
        void teardown() {
            driver.quit();
        }

        @Test
        void test (){
        // Your test logic here

        driver.get(BasePage.BASE_URL);
        BasePage.FirstCheckBox.click();


        Assertions.assertTrue(BasePage.FirstCheckBox.isSelected());
    }
}
