package SeleniumTeachings.webDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WebDriverWaitDemo2 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.hyrtutorials.com/p/waits-demo.html");
        driver.findElement(By.cssSelector(".main.section>div>div div div article div button:nth-of-type(2)")).click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Textbox2']")));
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//input[@placeholder='Textbox2']"))));
        driver.findElement(By.xpath("//input[@placeholder='Textbox2']")).sendKeys("Automation");
    }
}
