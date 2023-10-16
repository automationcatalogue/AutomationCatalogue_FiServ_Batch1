package SeleniumTeachings.webDriver;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertDemo {
    public static void main(String[] args) throws Exception{
        WebDriver driver = new ChromeDriver();
        System.out.println("Chrome Browser is launched");

        driver.manage().window().maximize();
        System.out.println("Chrome Browser window is maximized");

        driver.get("https://demoqa.com/alerts");
        System.out.println("Demoqa website is loaded");

        Thread.sleep(4000);
        WebElement ele_Button = driver.findElement(By.xpath("//div[@id='javascriptAlertsWrapper']/div[4]//button"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].click();",ele_Button);
        System.out.println("4th Click me button is clicked");
        Thread.sleep(4000);

        Alert al =  driver.switchTo().alert();
        al.sendKeys("Automation Catalogue");
        Thread.sleep(4000);

        al.accept();
        System.out.println("Alert is accepted");

        int x=10;
        float y=x;

        float a=5.236f;
        int b=(int)a;

        //al.dismiss();
        //System.out.println("Alert is dismissed");

        //String str = al.getText();
        //System.out.println("Alert Text is :"+str);
    }
}
