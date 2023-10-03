package filHandling;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;

public class Demo {
    public static void main(String[] args) throws IOException {
        File f = new File("C:\\AutomationCatalogue\\Projects\\AutomationCatalogue_FirServ_Batch1\\Files");
        f.createNewFile();
        boolean b1 = f.canExecute();
        System.out.println("File Executable "+b1);

        boolean b2 = f.canRead();
        System.out.println("File Readable "+b2);

        boolean b3 = f.canWrite();
        System.out.println("File Writable "+b3);

        boolean b4 = f.isAbsolute();
        System.out.println(b4);

  }
}
