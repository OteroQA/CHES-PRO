package stepDefinitions.base;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.bs.A;
import io.qameta.allure.Allure;
import io.qameta.allure.AllureLifecycle;
import io.qameta.allure.Attachment;
import io.qameta.allure.Step;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.AfterMethod;

import java.io.ByteArrayInputStream;
import java.sql.Timestamp;

import static driver.DriverFactory.cleanupDriver;
import static driver.DriverFactory.getDriver;

public class Hooks {

    @Before
    public void setup() {
        getDriver();
    }

    public static void captureImage() {
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        //ByteArrayInputStream bais = new ByteArrayInputStream(((TakesScreenshot) getDriver()).getScreenshotAs(OutputType.BYTES));
        //byte[] capturaPantalla = ((TakesScreenshot) getDriver()).getScreenshotAs(OutputType.BYTES);
        //Allure.getLifecycle().addAttachment(timestamp.toString(), "image","png", capturaPantalla);
        Allure.addAttachment(Allure.getLifecycle().getCurrentTestCaseOrStep().toString(), new ByteArrayInputStream(((TakesScreenshot) getDriver()).getScreenshotAs(OutputType.BYTES)));
    }

    @After
    public void tearDown() {
        cleanupDriver();
    }
}
