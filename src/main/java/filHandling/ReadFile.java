package filHandling;

import java.io.FileInputStream;

public class ReadFile {
    public static void main(String[] args) throws Exception{
        FileInputStream fis = new FileInputStream("C:\\AutomationCatalogue\\Projects\\AutomationCatalogue_FirServ_Batch1\\Files\\FiServBatch1.txt");
        int n = fis.available();
        byte b[] = new byte[n];
        fis.read(b);
        String s1 = new String(b);
        System.out.println(s1);
        fis.close();
    }
}
