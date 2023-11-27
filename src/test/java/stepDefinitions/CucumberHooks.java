package stepDefinitions;

import Utils.BaseClass;
import Utils.CommonUtils;
import com.fasterxml.jackson.databind.ser.Serializers;
import io.cucumber.java.*;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CucumberHooks {
    @Before
    public void before(Scenario scenario){
        System.out.println("Hello Java Program!!!!");
        System.out.println("Executing "+scenario.getName());
    }

    @After
    public void tearDown(Scenario scenario){
        WebDriver driver = BaseClass.getDriver();
        driver.quit();
        System.out.println("Driver instance is closed");
        String scenarioStatus = scenario.getStatus().toString();
        System.out.println("Scenario status is :"+scenarioStatus);
    }

    @BeforeStep
    public void beforeStep(){
        System.out.println("Core Java!!!!!!");
    }

    @AfterStep
    public void afterStep() throws Exception{
        WebDriver driver = BaseClass.getDriver();
        TakesScreenshot ts = (TakesScreenshot)driver;
        File src =ts.getScreenshotAs(OutputType.FILE);
        String projectPath = System.getProperty("user.dir");
        String screenshotsPath = CommonUtils.generateScreenshotsFolder(projectPath);


        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("ddMMMyyyy_HHmmss");
        String dateTime = now.format(formatter);
        File dest = new File(screenshotsPath+"//dateTime.jpg");
        FileUtils.copyFile(src,dest);
        System.out.println("screenshot is captured");
    }
}
