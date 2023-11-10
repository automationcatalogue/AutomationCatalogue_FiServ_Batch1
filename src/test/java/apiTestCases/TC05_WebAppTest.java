package apiTestCases;

import io.restassured.path.json.JsonPath;
import org.testng.Assert;
import payloads.WebAPP;

public class TC05_WebAppTest {
    public static void main(String[] args) {
        JsonPath jsonPath = new JsonPath(WebAPP.getPayLoadForWebApp());

        int numberOfServlets=jsonPath.getInt("web-app.servlet.size()");
        System.out.println("NumberOfServlets are :"+numberOfServlets);

        for(int i=0;i<numberOfServlets;i++){
            String servletName=jsonPath.getString("web-app.servlet["+i+"].servlet-name");
            String servletClass=jsonPath.getString("web-app.servlet["+i+"].servlet-class");
            System.out.println(servletName+"\t"+servletClass);
        }

        String expectedData="/usr/local/tomcat/logs/dataLog.log";
        String actualData="";
        for(int i=0;i<numberOfServlets;i++){
            String servletName=jsonPath.getString("web-app.servlet["+i+"].servlet-name");
            if(servletName.equalsIgnoreCase("cofaxTools")){
                actualData=jsonPath.getString("web-app.servlet["+i+"].init-param.dataLogLocation");
                break;
            }
        }
        Assert.assertEquals(actualData,expectedData,"Data Log Location attributes are not updated correctly");
        System.out.println("**********************************************");
        for(int i=0;i<numberOfServlets;i++){
            String initParam = jsonPath.getString("web-app.servlet["+i+"].init-param");
            if(initParam!=null){
                String servletName = jsonPath.getString("web-app.servlet["+i+"].servlet-name");
                System.out.println(servletName);
            }
        }

    }
}
