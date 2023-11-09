package payloads;

public class Library {
    public static String getPayloadForAddBook(String authorName, String isbn, String aisle){
        String payload = "{\n" +
                "    \"name\": \"Rest Assured Automation by Shreya\",\n" +
                "    \"isbn\": \""+isbn+"\",\n" +
                "    \"aisle\": \""+aisle+"\",\n" +
                "    \"author\": \""+authorName+"\"\n" +
                "}";
        return payload;
    }

    public static String getPayloadForDeleteBook(String id){
        String payload = "{\n" +
                "    \"ID\": \""+id+"\"\n" +
                "}";
        return payload;
    }
}
