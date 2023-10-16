package testcases;


import Utils.CommonUtils;
import Utils.Config;
import Utils.TestData;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import pages.OrangeHRM_HomePage;
import pages.OrangeHRM_LoginPage;

import java.io.File;

public class TC01_OrangeHRM_AddEvent {
    public static void main(String[] args) throws Exception{
        String projectPath = System.getProperty("user.dir");
        System.out.println("Project Path is :"+projectPath);

        WebDriver driver = CommonUtils.launchBrowser("chrome");
        driver.get(Config.orangeHRM_URL);

        TakesScreenshot ts = (TakesScreenshot)driver;
        File src = ts.getScreenshotAs(OutputType.FILE);
        File dest = new File(projectPath+"//Screenshots//OrangeHRM_LoginPage.jpg");
        FileUtils.copyFile(src, dest);
        System.out.println("OrangeHRM Login page is captured");

        OrangeHRM_LoginPage.login_OrangeHRM(driver, TestData.userName, TestData.password);
        OrangeHRM_HomePage.verifyLogin(driver,Config.orangeHRM_HomePageURL);
        src = ts.getScreenshotAs(OutputType.FILE);
        dest = new File(projectPath+"//Screenshots//OrangeHRM_HomePage.jpg");
        FileUtils.copyFile(src, dest);
        System.out.println("OrangeHRM Home page is captured");

        driver.findElement(By.xpath("(//a[@data-automation-id='menu_onboarding_Onboarding'])[1]/span")).click();
        System.out.println("Onboarding link is clicked");

        Thread.sleep(8000);

        WebElement element_iframe = driver.findElement(By.xpath("//iframe[@id='noncoreIframe']"));
        driver.switchTo().frame(element_iframe);
        System.out.println("Switched into iframe");

        src = ts.getScreenshotAs(OutputType.FILE);
        dest = new File(projectPath+"//Screenshots//OrangeHRM_OnboardingPage.jpg");
        FileUtils.copyFile(src, dest);
        System.out.println("OrangeHRM Onboarding page is captured");

        driver.findElement(By.xpath("//i[text()='add']")).click();
        System.out.println("Add Event button is clicked");

        Thread.sleep(15000);
        driver.findElement(By.xpath("//input[@id='OhrmJob_name']")).sendKeys("TestAutomation");
        System.out.println("Add Event Name is entered");

        Thread.sleep(2000);
        driver.findElement(By.xpath("//label[@for='OhrmJob_location']/..//input")).click();
        System.out.println("Location drop-down is clicked");

        CommonUtils.selectDropDown(By.xpath("//label[@for='OhrmJob_location']/..//ul/li/span"),"Kenya Satalite office");

        src = ts.getScreenshotAs(OutputType.FILE);
        dest = new File(projectPath+"//Screenshots//OrangeHRM_AddEventPage.jpg");
        FileUtils.copyFile(src, dest);
        System.out.println("OrangeHRM Onboarding page is captured");

        driver.switchTo().defaultContent();
        System.out.println("Switched out/Exited from the frame");
    }
}
