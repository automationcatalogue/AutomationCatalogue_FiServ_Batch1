package apiTestCases;

import io.restassured.path.json.JsonPath;
import org.testng.Assert;
import payloads.Courses;

public class TC04_ComplexJson_Evaluation {
    public static void main(String[] args) {
        JsonPath jsonPath = new JsonPath(Courses.getPayLoadForCourses());

        //Print No of courses returned by API
        int numberOfCourses = jsonPath.getInt("courses.size();");
        System.out.println("Number of Courses returned are :"+numberOfCourses);

        //Print Purchase Amount
        int purchaseAmount = jsonPath.getInt("dashboard.purchaseAmount");
        System.out.println("Purchase Amount is :"+purchaseAmount);

        //Print Title of the first course
        String firstTitle = jsonPath.getString("courses.title[1]");
        System.out.println("First Title is :"+firstTitle);

        //Print All course titles and their respective Prices
        for(int i=0;i<numberOfCourses;i++){
            String title = jsonPath.getString("courses["+i+"].title");
            int price = jsonPath.getInt("courses["+i+"].price");
            System.out.println("Course title is :"+title+"\t"+" and its price is :"+price);
        }

        //print no of copies sold by RPA Course
        for(int i=0;i<numberOfCourses;i++){
            String title = jsonPath.getString("courses["+i+"].title");
            if(title.equalsIgnoreCase("RPA")){
                int copies = jsonPath.getInt("courses["+i+"].copies");
                System.out.println("Course title is :"+title+"\t"+" and its copies is :"+copies);
                break;
            }
        }

        //Verify if Sum of all Course prices matches with Purchase Amount
        int sum=0;
        for(int i=0;i<numberOfCourses;i++){
            int price = jsonPath.getInt("courses["+i+"].price");
            int copies = jsonPath.getInt("courses["+i+"].copies");
            sum=sum+(price*copies);
        }
        System.out.println("Total Sum of all Courses is :"+sum);
        Assert.assertEquals(purchaseAmount, sum,"Purchase Amount is not matching with sum value");
        System.out.println("Purchase Amount is matching with sum value");
    }
}
