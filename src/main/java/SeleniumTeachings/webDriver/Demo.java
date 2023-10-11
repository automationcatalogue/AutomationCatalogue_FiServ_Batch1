package SeleniumTeachings.webDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.co.in");

        String s1 = driver.getTitle();
        System.out.println("Title of the page is :"+s1);

        driver.navigate().to("https://www.facebook.com");
        driver.quit();
    }
}
