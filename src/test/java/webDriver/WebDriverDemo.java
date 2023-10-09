package webDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverDemo {
    public static void main(String[] args) throws InterruptedException{
        WebDriver driver = new ChromeDriver();
        System.out.println("Chrome Browser is launched");

        driver.get("https://automatetest-trials710.orangehrmlive.com/");
        System.out.println("OrangeHRM website is loaded");

        String s1 = driver.getTitle();
        System.out.println("Title of the Page is :"+s1);

        //driver.manage().window().maximize();
        WebDriver.Options op = driver.manage();
        WebDriver.Window win = op.window();
        win.maximize();
        System.out.println("Maximize the Chrome Browser");

        String url = driver.getCurrentUrl();
        System.out.println("URL is :"+url);

        String pageSource = driver.getPageSource();
        System.out.println("Page Source is :"+pageSource);

        driver.navigate().to("https://www.linkedin.com");
        s1 = driver.getTitle();
        System.out.println(s1);

        Thread.sleep(5000);

        driver.navigate().back();
        System.out.println("OrangeHRM Application is loaded");

        Thread.sleep(5000);
        driver.navigate().forward();
        System.out.println("LinkedIn Website is loaded");
        Thread.sleep(5000);
        driver.quit();
    }
}
