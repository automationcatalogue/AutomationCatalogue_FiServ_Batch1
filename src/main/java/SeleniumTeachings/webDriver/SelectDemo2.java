package SeleniumTeachings.webDriver;

import Utils.CommonUtils;
import Utils.Config;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SelectDemo2 {
    public static void main(String[] args) throws Exception{
        WebDriver driver =  CommonUtils.launchBrowser("chrome");
        driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");

        WebElement element = driver.findElement(By.cssSelector("#ide"));
        Select ob = new Select(element);
        Thread.sleep(1000);
        ob.selectByVisibleText("NetBeans");
        Thread.sleep(1000);
        ob.selectByIndex(0);
        Thread.sleep(1000);
        ob.selectByValue("ij");
        Thread.sleep(1000);

        WebElement element1 = ob.getFirstSelectedOption();
        String text = element1.getText();
        System.out.println("First Selected option value is :"+text);

        boolean b=ob.isMultiple();
        if(b){
            System.out.println("Drop-down is allowing multiple selection");
        }else{
            System.out.println("Drop-down is allowing single selection");
        }

        ob.deselectByIndex(3);
        Thread.sleep(1000);
        ob.deselectByValue("ec");
        Thread.sleep(1000);
        ob.deselectByVisibleText("IntelliJ IDEA");
    }
}
