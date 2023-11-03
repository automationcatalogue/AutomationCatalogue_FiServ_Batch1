package SeleniumTeachings.webDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class JSDemo {
    public static void main(String[] args) throws Exception{
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        driver.get("https://automationteste-trials710.orangehrmlive.com/");
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("document.getElementById('txtUsername').value='Admin'");
        System.out.println("Admin is entered as UserName");

        WebElement element_password = driver.findElement(By.xpath("//input[@placeholder='Password']"));
        js.executeScript("arguments[0].value='Admin@123'",element_password);
        System.out.println("Password is entered");

        WebElement element_Login = driver.findElement(By.xpath("//button[@type='submit']"));
        js.executeScript("arguments[0].click()", element_Login);
        System.out.println("Login button is clicked");

        String title = js.executeScript("return document.title").toString();
        System.out.println("Title of the Application is :"+title);

        String url = js.executeScript("return document.URL").toString();
        System.out.println("URL of the Application is :"+url);

        String domain = js.executeScript("return document.domain").toString();
        System.out.println("Domain of the Application is :"+domain);

        js.executeScript("history.go(0)");
        System.out.println("Chrome Browser is Refreshed/Reloaded");

        WebElement element_EmployeeManagement = driver.findElement(By.xpath("(//a[@data-automation-id='menu_pim_viewEmployeeList'])[1]"));
        js.executeScript("arguments[0].click();", element_EmployeeManagement);
        System.out.println("Employee Management Link is clicked");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//i[text()='add']")));

        Thread.sleep(3000);
        js.executeScript("window.scrollBy(0,50)");
        Thread.sleep(3000);
        js.executeScript("window.scrollBy(0,100)");
        Thread.sleep(3000);
        js.executeScript("window.scrollBy(0,-75)");
        Thread.sleep(3000);
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        Thread.sleep(3000);
        js.executeScript("window.scrollTo(0, -document.body.scrollHeight)");
        Thread.sleep(3000);
        WebElement element_EmployeeText = driver.findElement(By.xpath("//td[text()='Jenny  Fisher ']"));
        js.executeScript("arguments[0].scrollIntoView(true);", element_EmployeeText);

        List<WebElement> elements_Rows = driver.findElements(By.xpath("//table[@id='employeeListTable']/tbody/tr"));
        System.out.println("TotalNumber of Rows present in WebTable is :"+elements_Rows.size());

        String empTitle = driver.findElement(By.xpath("//table[@id='employeeListTable']/tbody/tr[3]/td[4]")).getText();
        System.out.println("Employee Title is :"+empTitle);

        List<WebElement> elements_EmpNames = driver.findElements(By.xpath("//table[@id='employeeListTable']/tbody/tr/td[3]"));
        boolean isEmployeeExists = false;
        for(WebElement element_empName:elements_EmpNames){
            String empName = element_empName.getText();
           if(empName.equalsIgnoreCase("Goutam Ganesh")){
               String supervisorName = element_empName.findElement(By.xpath(".//following-sibling::td[6]")).getText();
               System.out.println("Supervisor Name is :"+supervisorName);
               isEmployeeExists=true;
               break;
           }
        }

        if(isEmployeeExists){
            System.out.println("Employee is found!!!");
        }else{
            System.out.println("Employee is not found!!!");
        }
    }
}
