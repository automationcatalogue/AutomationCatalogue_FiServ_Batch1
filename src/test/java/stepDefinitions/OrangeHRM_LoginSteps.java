package stepDefinitions;

import Utils.BaseClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.time.Duration;

public class OrangeHRM_LoginSteps {

    @Given("User is opened the Chrome browser")
    public void openBrowser(){
        WebDriver driver = new ChromeDriver();
        System.out.println("Chrome Browser is launched");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        new BaseClass(driver);
    }

    @Given("User launches OrangeHRM application URL")
    public void launchURL(){
        WebDriver driver = BaseClass.getDriver();
        driver.get("https://automationdata-trials710.orangehrmlive.com/");
        System.out.println("OrangeHRM Application is loaded");
    }

    @When("User is entered the {string} as UserName")
    public void enterUserName(String userName){
        WebDriver driver = BaseClass.getDriver();
        driver.findElement(By.id("txtUsername")).sendKeys(userName);
        System.out.println(userName+" is entered as a UserName");
    }

    @And("User is entered the {string} as Password")
    public void enterPassword(String password){
        WebDriver driver = BaseClass.getDriver();
        driver.findElement(By.className("password-input")).sendKeys(password);
        System.out.println("Password is entered");
    }

    @When("User is clicked on Login button")
    public void clickLoginButton(){
        WebDriver driver = BaseClass.getDriver();
        driver.findElement(By.tagName("button")).click();
        System.out.println("Login button is clicked");
    }

    @Then("User verifies the HomePage title")
    public void verifyTitle(){
        WebDriver driver = BaseClass.getDriver();
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle,"Employee Management","Title is not matched");
        System.out.println("Title is matched");
    }

    @When("User is entered the Invalid Password")
    public void enterInvalidPassword(){
        WebDriver driver = BaseClass.getDriver();
        driver.findElement(By.className("password-input")).sendKeys("Test@123");
        System.out.println("Password is entered");
    }

    @Given("User verifies Invalid Credentials message")
    public void verifyInvalidCredentials(){
        WebDriver driver = BaseClass.getDriver();
        String message = driver.findElement(By.xpath("//div[@class='toast-message']")).getText();
        Assert.assertTrue(message.contains("Invalid Credentials"), "Invalid functionality is not working");
        System.out.println("Invalid functionality is working");
    }
}
