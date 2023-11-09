package apiTestCases;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import org.testng.Assert;
import payloads.Library;

public class TC02_EndToEndLibrary {

    public static void main(String[] args) {
        RestAssured.baseURI = "http://216.10.245.166";

        String response = addBook("Sagar","FiServ", "88526");
        System.out.println("Add Book Request is successful");
        String id = getJSONValue(response,"ID");

        response = retrieveBook(id,200);
        validateJSONResponse(response,"[0].author","Sagar");

        response=deleteBook(id,200);
        validateJSONResponse(response,"msg","book is successfully deleted");

        response = retrieveBook(id,404);
        validateJSONResponse(response,"msg","The book by requested bookid / author name does not exists!");
    }

    //Add Book
    public static String addBook(String authorName, String isbn, String aisle){
        System.out.println("************** POST METHOD *****************");
        String response = RestAssured.given().log().all()
                .header("Content-Type","application/json")
                .body(Library.getPayloadForAddBook(authorName, isbn, aisle))
                .when().post("Library/Addbook.php")
                .then().log().all().assertThat().statusCode(200).extract().response().asString();
        return response;
    }

    //Retrieve Book
    public static String retrieveBook(String book_id, int expectedStatusCode){
        System.out.println("************* GET METHOD *********************");
        String response=RestAssured.given().log().all().queryParam("ID",book_id)
                .header("Content-Type","application/json")
                .when().get("/Library/GetBook.php")
                .then().log().all().assertThat().statusCode(expectedStatusCode).extract().response().asString();
        return response;
    }

    //Get the data from Json Path class
    public static String getJSONValue(String response, String actualPath){
        System.out.println("************** READING JSON DATA *****************");
        JsonPath js = new JsonPath(response);
        String actualValue=js.getString(actualPath);
        System.out.println("Returned value is :"+actualValue);
        return actualValue;
    }

    //Validate response using JSON Path class
    public static void validateJSONResponse(String response, String actualPath, String expectedValue){
        System.out.println("*************** VALIDATING JSON RESPONSE **************");
        JsonPath js = new JsonPath(response);
        String actualValue=js.getString(actualPath);
        Assert.assertEquals(actualValue,expectedValue,actualValue+" is not matching with the "+expectedValue);
        System.out.println("Assertion is successful and validated the JSON Response");
    }

    //Delete Book
    public static String deleteBook(String book_id, int expectedStatusCode){
        System.out.println("************** DELETE METHOD *********************");
        String response=RestAssured.given().log().all()
                .header("Content-Type","application/json")
                .body(Library.getPayloadForDeleteBook(book_id))
                .when().delete("Library/DeleteBook.php")
                .then().log().all().assertThat().statusCode(expectedStatusCode).extract().response().asString();
        return response;
    }
}
