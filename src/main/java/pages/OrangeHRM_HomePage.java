package pages;

import org.openqa.selenium.WebDriver;

public class OrangeHRM_HomePage {
    public static void verifyLogin(WebDriver driver, String expectedURL) throws Exception{
        String s1 = driver.getCurrentUrl();
        if(s1.contains(expectedURL)){
            System.out.println("Login is successful");
        }else{
            System.out.println("Login is not successful");
        }
        Thread.sleep(8000);
    }
}
