package webDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementsDemo3 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        System.out.println("Chrome browser window is launched");

        driver.get("https://www.google.com/");
        System.out.println("Google Search website is loaded");

        driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys("India");
        System.out.println("India is entered");

        driver.findElement(By.xpath("//textarea[@name='q']")).submit();
        System.out.println("India is searched");

    }
}
