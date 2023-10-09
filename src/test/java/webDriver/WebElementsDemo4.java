package webDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementsDemo4 {
    public static void main(String[] args) throws Exception{
        WebDriver driver = new ChromeDriver();
        System.out.println("Chrome Browser is launched");

        driver.get("https://demowebshop.tricentis.com/");
        System.out.println("Automation Exercise URL is loaded");

        driver.manage().window().maximize();
        System.out.println("Chrome Browser window is maximized");

        driver.findElement(By.cssSelector("a[class='ico-login']")).click();
        System.out.println("Login button is clicked");

        driver.findElement(By.cssSelector("input[id='Email'][class='email']")).sendKeys("aarosagarch@gmail.com");
        System.out.println("Email is entered");

        driver.findElement(By.cssSelector("#Password")).sendKeys("Admin@123");
        System.out.println("Password is entered");

        driver.findElement(By.cssSelector(".button-1.login-button")).click();
        System.out.println("Login button is clicked");

        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[text()='Shopping cart']")).click();
        System.out.println("Shopping-cart link is clicked");

        String attributeValue = driver.findElement(By.cssSelector(".product-name")).getAttribute("href");
        System.out.println("href attributeValue value is :"+attributeValue);

        String tagValue = driver.findElement(By.cssSelector(".product-name")).getTagName();
        System.out.println("TagName is :"+tagValue);

        String css1 = driver.findElement(By.xpath("//td[@class='product-picture']/img[@title='Show details for Computing and Internet']")).getCssValue("color");
        System.out.println("Color is "+css1);

        String css2 = driver.findElement(By.xpath("//td[@class='product-picture']/img[@title='Show details for Computing and Internet']")).getCssValue("font-family");
        System.out.println("font-family is "+css2);

        int x=driver.findElement(By.xpath("//td[@class='product-picture']/img[@title='Show details for Computing and Internet']")).getLocation().getX();
        System.out.println("X co-ordinate value is :"+x);

        int y=driver.findElement(By.xpath("//td[@class='product-picture']/img[@title='Show details for Computing and Internet']")).getLocation().getY();
        System.out.println("Y co-ordinate value is :"+y);

        int height = driver.findElement(By.xpath("//td[@class='product-picture']/img[@title='Show details for Computing and Internet']")).getSize().getHeight();
        System.out.println("Height is :"+height);

        int width = driver.findElement(By.xpath("//td[@class='product-picture']/img[@title='Show details for Computing and Internet']")).getSize().getWidth();
        System.out.println("Width is :"+width);

    }
}
