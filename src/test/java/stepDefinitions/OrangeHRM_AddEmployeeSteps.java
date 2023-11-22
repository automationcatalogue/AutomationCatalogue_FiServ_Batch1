package stepDefinitions;

import Utils.BaseClass;
import Utils.CommonUtils;
import Utils.Config;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrangeHRM_AddEmployeeSteps {



    @Given("User launches OrangeHRM application in {string} browser")
    public void user_launches_orange_hrm_application_in_browser(String browserName) {
        WebDriver driver = CommonUtils.launchBrowser(browserName);
        driver.get(Config.orangeHRM_URL);
    }
    @When("User is entered {string} and {string} credentials")
    public void user_is_entered_and_credentials(String userName, String password) {
        WebDriver driver = BaseClass.getDriver();
        driver.findElement(By.id("txtUsername")).sendKeys(userName);
        System.out.println(userName+" is entered as a UserName");
        driver.findElement(By.className("password-input")).sendKeys(password);
        System.out.println("Password is entered");
    }
    @When("User clicked on Employee Management link")
    public void user_clicked_on_employee_management_link() {
        WebDriver driver = BaseClass.getDriver();

    }
    @When("User is clicked on Add Employee button")
    public void user_is_clicked_on_add_employee_button() {

    }
    @When("User is entered {string} and {string} and {string} and clicks Next button")
    public void user_is_entered_and_and_and_clicks_next_button(String string, String string2, String string3) {

    }
    @When("User is entered {string} and {string} and clicks Next button")
    public void user_is_entered_and_and_clicks_next_button(String string, String string2) {

    }
    @When("User is entered {string} and {string} and {string} and clicks on Save button")
    public void user_is_entered_and_and_and_clicks_on_save_button(String string, String string2, String string3) {

    }
    @Then("User verifies New employee Name and Employee Id")
    public void user_verifies_new_employee_name_and_employee_id() {

    }

}
