package SeleniumTeachings.webDriver;

import Utils.CommonUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ActionsDemo3 {
    public static void main(String[] args) throws Exception{
        WebDriver driver = CommonUtils.launchBrowser("chrome");
        driver.get("https://www.gap.com/");

        WebElement element_boys =driver.findElement(By.xpath("//a[@data-divisionname='Boys']"));
        Actions action = new Actions(driver);
        action.moveToElement(element_boys).perform();
        System.out.println("Mouse hover is happened on Boys menu");

        Thread.sleep(5000);
        action.click(driver.findElement(By.xpath("(//a[@aria-label='categories jeans']/span)[2]"))).perform();
        System.out.println("Jeans link is clicked");
    }
}
