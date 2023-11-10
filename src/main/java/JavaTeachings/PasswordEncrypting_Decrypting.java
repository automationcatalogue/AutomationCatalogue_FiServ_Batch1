package JavaTeachings;

import java.util.Base64;

public class PasswordEncrypting_Decrypting {
    public static void main(String[] args) {
        String password = "Admin@123";
        byte b[]= password.getBytes();
        String encodedPassword = Base64.getEncoder().encodeToString(b);
        System.out.println(encodedPassword);
    }
}
