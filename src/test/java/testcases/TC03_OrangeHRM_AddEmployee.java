package testcases;

import Utils.CommonUtils;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.yaml.snakeyaml.Yaml;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.time.Duration;
import java.util.Map;
import java.util.Properties;

public class TC03_OrangeHRM_AddEmployee {
    public static void main(String[] args) throws Exception{
        String projectPath = System.getProperty("user.dir");
        //FileInputStream fis_Properties = new FileInputStream(projectPath+"//TestData//TestData_Batch1.properties");
        //Properties prop = new Properties();
        //prop.load(fis_Properties);
        Yaml yaml = new Yaml();
        FileInputStream fis_Yaml = new FileInputStream(projectPath+"//TestData//TestData_Batch1.yaml");
        Map<String, String> map = yaml.load(fis_Yaml);
        String browser = map.get("browserName");
        System.out.println("Browser from Yaml file is :"+browser);

        //String browser = prop.getProperty("browserName");
        //System.out.println("Browser from Properties file is :"+browser);

        //WebDriver driver = CommonUtils.launchBrowser(browser);

        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("requireWindowFocus",true);

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        options.addArguments("--start-maximized");
        options.merge(caps);

        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));


        FileInputStream fis = new FileInputStream(projectPath+"//TestData//TestData.xlsx");
        XSSFWorkbook wbk = new XSSFWorkbook(fis);
        XSSFSheet sh = wbk.getSheet("OrangeHRM_AddEmployee");

        //String url = prop.getProperty("orangeHRM_URL");
        String url = map.get("orangeHRM_URL");
        driver.get(url);
        System.out.println(url + "OrangeHRM URL is loaded");

        driver.manage().window().maximize();
        System.out.println("Chrome Browser window is maximized");

        WebElement element_UserName = driver.findElement(By.id("txtUsername"));
        String userName = sh.getRow(1).getCell(2).getStringCellValue();
        element_UserName.sendKeys(userName);
        System.out.println("Admin is entered as a UserName");

        String password = sh.getRow(1).getCell(3).getStringCellValue();
        driver.findElement(By.className("password-input")).sendKeys(password);
        System.out.println("Password is entered");

        driver.findElement(By.tagName("button")).click();
        System.out.println("Login button is clicked");

        String s1 = driver.getCurrentUrl();
        if(s1.contains("client/#/dashboard")){
            System.out.println("Login is successful");
        }else{
            System.out.println("Login is not successful");
        }


        driver.findElement(By.partialLinkText("Employee List")).click();
        System.out.println("Employee List is link is clicked");

    /**
        driver.findElement(By.id("addEmployeeButton")).click();
        System.out.println("Add Employee button is clicked");


        WebElement element_firstName =driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/form/oxd-decorator/div/div[2]/div/div[1]/div/div/div/oxd-employee-name-input/div/input[1]"));
        element_firstName.sendKeys("Automation");

        element_firstName.clear();

        String firstName = sh.getRow(1).getCell(4).getStringCellValue();
        element_firstName.sendKeys(firstName);
        System.out.println("Testing is entered as FirstName");

        String lastName = sh.getRow(1).getCell(5).getStringCellValue();
        driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys(lastName);
        System.out.println("Selenium is entered as LastName");


        driver.findElement(By.xpath("//button[@data-id='location']/div/div/div")).click();
        System.out.println("Location drop-down is clicked");

        String location = sh.getRow(1).getCell(6).getStringCellValue();
        CommonUtils.selectDropDown(By.xpath(""),location);

        driver.findElement(By.xpath("//button[@type='button'][@class='btn btn-secondary']")).click();
        System.out.println("Next button is clicked");


        driver.findElement(By.xpath("//form[@sf-model='personal.formModel']/materializecss-decorator[4]/div/sf-decorator[2]/div/div/input")).click();
        System.out.println("Marital Status is clicked");


        String maritalStatus = sh.getRow(1).getCell(7).getStringCellValue();
        CommonUtils.selectDropDown(By.xpath("//div[@id='emp_marital_status_inputfileddiv']/div/ul/li"),maritalStatus);

        boolean isNextPresent =  driver.findElement(By.xpath("//button[@translate='Next']")).isDisplayed();
        if(isNextPresent){
            driver.findElement(By.xpath("//button[@translate='Next']")).click();
            System.out.println("Next button is displayed and It is clicked");
        }else{
            System.out.println("Next button is not displayed");
        }


        driver.findElement(By.xpath("//label[text()='Region']/../div[1]/button/div/div/div")).click();
        System.out.println("Region drop-down is clicked");
        String region = sh.getRow(1).getCell(8).getStringCellValue();
        CommonUtils.selectDropDown(By.xpath("//label[text()='Region']/../div/div/div/ul/li"),region);


        driver.findElement(By.xpath("//label[text()='FTE']/../div/button/div/div/div")).click();
        System.out.println("FTE drop-down is clicked");


        driver.findElement(By.xpath("//span[text()='1']")).click();
        System.out.println("FTE value 1 is selected");


        driver.findElement(By.xpath("//label[text()='Temporary Department']/../div/button/div/div/div")).click();
        System.out.println("Temporary Department drop-down is clicked");


        driver.findElement(By.xpath("//span[text()='Sub unit-4']")).click();
        System.out.println("Temporary Department value Sub-Unit-4 is selected");

        WebElement element  = driver.findElement(By.xpath("//button[@ng-show='vm.showFinishButton']"));
        boolean b =element.isEnabled();
        if(b){
            element.click();
            System.out.println("Save button is clicked and It is enabled");
        }else{
            System.out.println("Save button is not enabled");
        }


        String actualName = driver.findElement(By.xpath("//div[text()='Full Name: ']/span")).getText();
        String expectedName = firstName+" "+lastName;
        if(actualName.equalsIgnoreCase(expectedName)){
            System.out.println("Add Employee is successful");
        }else{
            System.out.println("Add Employee is Successful");
        }

        String empID = driver.findElement(By.xpath("//div[text()='Employee Id: ']/span")).getText();
        System.out.println("New Employee Id is:"+empID);

        **/
        /**String empID = "7895623";
        FileOutputStream fos = new FileOutputStream(projectPath+"//TestData//TestData_Batch1.properties");
        prop.load(fis_Properties);
        prop.setProperty("empID",empID);
        prop.setProperty("EmployeeName","Dharanishankar");
        prop.store(fos,"EmployeeName data is updated in Properties file");
        fos.close();**/
        String empID = "7895623";
        FileWriter fw = new FileWriter(projectPath+"//TestData//TestData_Batch1.yaml");
        //Map<String, String> map1 = yaml.load(fis_Yaml);
        //map1.put("EmployeeID",empID);
        map.put("browserName","chrome");
        yaml.dump(map,fw);
        fw.close();
        driver.quit();
    }
}
