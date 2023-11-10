package apiTestCases;

import io.restassured.RestAssured;
import pojos.LibraryBook;

public class TC06_Serialization_AddBookLibrary {
    public static void main(String[] args) {
        LibraryBook ob = new LibraryBook();
        ob.setName("AutomationCataloue for API Testing by Sagar");
        ob.setIsbn("FiServ");
        ob.setAisle("4234729");
        ob.setAuthor("Shreya");

        RestAssured.baseURI="http://216.10.245.166";

        String response = RestAssured.given().log().all().header("Content-Type","application/json")
                .queryParam("Location","Hyderabad")
                .body(ob)
                .when().post("Library/Addbook.php")
                .then().log().all().assertThat().statusCode(200).extract().response().asString();
        System.out.println(response);
    }
}
