package SeleniumTeachings.webDriver;

import Utils.CommonUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WebDriverWaitDemo1 {
    public static void main(String[] args) {
        WebDriver driver = CommonUtils.launchBrowser("Chrome");
        driver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));

        driver.get("https://netbanking.hdfcbank.com/netbanking/");

        //driver.switchTo().frame("login_page");
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(driver.findElement(By.name("login_abcd"))));
        System.out.println("Switched into iframe");

        driver.findElement(By.cssSelector(".btn.btn-primary.login-btn")).click();
        System.out.println("CONTINUE button is clicked");


        wait.until(ExpectedConditions.alertIsPresent());

        Alert al = driver.switchTo().alert();
        al.accept();
        System.out.println("Alert is accepted");
    }
}
