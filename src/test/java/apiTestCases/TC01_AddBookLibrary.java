package apiTestCases;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.hamcrest.Matchers;

public class TC01_AddBookLibrary {
    public static void main(String[] args) {
        RestAssured.baseURI = "http://216.10.245.166";

        Response res = RestAssured.given().log().all().header("Content-Type","application/json")
                .body("{\n" +
                        "    \"name\": \"Rest Assured Automation by Deepanshu\",\n" +
                        "    \"isbn\": \"FiSev\",\n" +
                        "    \"aisle\": \"8866\",\n" +
                        "    \"author\": \"Deepanshu\"\n" +
                        "}")
                .when().post("Library/Addbook.php");

        res.then().log().all().assertThat().statusCode(200)
                .body("Msg", Matchers.equalTo("successfully added"))
                .header("Server","Apache");
        System.out.println("Add Book Request is Successful");

    }
}
