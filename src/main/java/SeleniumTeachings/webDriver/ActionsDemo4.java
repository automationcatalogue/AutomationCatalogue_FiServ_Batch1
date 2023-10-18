package SeleniumTeachings.webDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class ActionsDemo4 {
    public static void main(String[] args) throws Exception{
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://jqueryui.com/slider/#colorpicker");

        WebElement element_frame=driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
        driver.switchTo().frame(element_frame);
        Thread.sleep(3000);

        WebElement element_red = driver.findElement(By.xpath("//div[@id='red']/span"));
        Actions action = new Actions(driver);

        action.clickAndHold(element_red);
        action.moveByOffset(0,-1000);
        action.release(element_red);

        action.build().perform();
    }
}
