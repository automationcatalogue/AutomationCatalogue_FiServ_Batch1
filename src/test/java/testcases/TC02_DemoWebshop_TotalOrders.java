package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class TC02_DemoWebshop_TotalOrders {
    public static void main(String[] args) throws Exception{
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://demowebshop.tricentis.com/");
        driver.findElement(By.xpath("//a[text()='Log in']")).click();
        driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("aarosagarch@gmail.com");
        driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("Admin@123");
        driver.findElement(By.xpath("//input[@value='Log in']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//a[@class='account'])[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[text()='Orders' and @class='inactive']")).click();
        Thread.sleep(3000);
        List<WebElement> allOrders =  driver.findElements(By.xpath("//div[@class='order-list']/div"));
        int totalOrdersCount = allOrders.size();
        System.out.println("Total Number of Orders");

        double sum=0;
        List<WebElement> elements_allOrderTotals =  driver.findElements(By.xpath("//div[@class='order-list']/div/ul/li[3]"));
        for(WebElement element_orderTotal:elements_allOrderTotals){
            String orderTotal = element_orderTotal.getText();
            orderTotal = orderTotal.split(":")[1].trim();

            double orderValue = Double.parseDouble(orderTotal);
            sum+=orderValue;
        }
        System.out.println("Total sum of all orders purchase is :"+sum);

        HashMap<String, Double> map = new HashMap<String, Double>();
        List<WebElement> elements_allOrderDates =  driver.findElements(By.xpath("//div[@class='order-list']/div/ul/li[2]"));
        for(WebElement element_OrderDate:elements_allOrderDates){
            String orderDate = element_OrderDate.getText();
            orderDate = orderDate.split(":")[1].trim().split(" ")[0];

            String orderTotal = element_OrderDate.findElement(By.xpath("./../li[3]")).getText();
            orderTotal = orderTotal.split(":")[1].trim();
            double orderValue = Double.parseDouble(orderTotal);

            if(map.containsKey(orderDate)){
                double previousTotalOrderValue =   map.get(orderDate);
                orderValue = orderValue+previousTotalOrderValue;
                map.put(orderDate, orderValue);
            }else{
                map.put(orderDate,orderValue);
            }
        }

        Set<Map.Entry<String, Double>> allEntries = map.entrySet();
        for(Map.Entry<String, Double> entry:allEntries){
            System.out.println(entry.getKey()+"----"+entry.getValue());
        }

        driver.quit();
    }
}
