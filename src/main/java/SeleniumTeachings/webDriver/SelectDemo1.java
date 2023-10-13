package SeleniumTeachings.webDriver;

import Utils.CommonUtils;
import Utils.Config;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class SelectDemo1 {
    public static void main(String[] args) throws Exception{
        WebDriver driver =  CommonUtils.launchBrowser("chrome");

        driver.get(Config.amazon_URL);
        WebElement element_search = driver.findElement(By.xpath("//select[@aria-describedby='searchDropdownDescription']"));
        Select ob = new Select(element_search);
        ob.selectByIndex(5);
        System.out.println("5th Position of drop-down is selected");

        Thread.sleep(3000);
        ob.selectByIndex(10);
        System.out.println("10th Position of drop-down is selected");

        Thread.sleep(3000);
        ob.selectByValue("search-alias=hpc");
        System.out.println("Health & Personal care values are selected from the drop-down");

        Thread.sleep(3000);
        ob.selectByVisibleText("Prime Video");
        System.out.println("Prime Video is selected from the drop-down");

        Thread.sleep(3000);
        boolean b=ob.isMultiple();
        if(b){
            System.out.println("Drop-down is allowing multiple selection");
        }else{
            System.out.println("Drop-down is allowing single selection");
        }

        List<WebElement> element_values = ob.getOptions();
        for(WebElement element:element_values){
            String text1 = element.getText();
            System.out.println(text1);
        }
    }
}
