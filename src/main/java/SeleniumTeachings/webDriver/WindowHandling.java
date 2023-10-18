package SeleniumTeachings.webDriver;

import Utils.CommonUtils;
import Utils.Config;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Set;

public class WindowHandling {
    public static void main(String[] args) throws Exception{
        WebDriver driver = CommonUtils.launchBrowser("chrome");
        driver.get(Config.amazon_URL);

        driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Laptops");
        driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).submit();
        Thread.sleep(10000);

        String parentWindowSession = driver.getWindowHandle();
        System.out.println("Parent Window Session id is :"+parentWindowSession);

        driver.findElement(By.xpath("//span[@data-component-type='s-search-results']/div/div[3]/div/div//h2//span")).click();
        System.out.println("First Search result of Laptops is clicked");

        Thread.sleep(6000);
        driver.switchTo().window(parentWindowSession);
        System.out.println("Switched back to parent window");

        Thread.sleep(4000);
        driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).clear();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Mobiles");
        driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).submit();
        Thread.sleep(6000);
        driver.findElement(By.xpath("//span[@data-component-type='s-search-results']/div/div[3]/div/div//h2//span")).click();
        System.out.println("First Search result of Mobiles is clicked");
        Thread.sleep(6000);

        Set<String> allSessions = driver.getWindowHandles();
        System.out.println("Sessions which are opened is :"+allSessions.size());

        driver.switchTo().window(parentWindowSession);
        System.out.println("Again Switched back to parent window");

        driver.close();
        System.out.println("Parent Window is closed");

        allSessions = driver.getWindowHandles();
        System.out.println("Sessions which are opened is :"+allSessions.size());

        for(String currentWindow:allSessions){
            driver.switchTo().window(currentWindow);
            String url = driver.getCurrentUrl();
            if(url.contains("keywords=Laptops")){
                break;
            }
        }
        System.out.println("Switched into Laptop session");

    }
}
