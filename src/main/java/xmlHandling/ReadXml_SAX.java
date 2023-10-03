package xmlHandling;

import org.xml.sax.Attributes;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.FileInputStream;

public class ReadXml_SAX extends DefaultHandler {
    public static void main(String[] args) throws Exception{
        ReadXml_SAX ob1 = new ReadXml_SAX();

        FileInputStream fis = new FileInputStream("C:\\AutomationCatalogue\\Projects\\AutomationCatalogue_FirServ_Batch1\\Files\\Students.xml");
        SAXParserFactory factory = SAXParserFactory.newInstance();
        SAXParser p = factory.newSAXParser();
        p.parse(fis, ob1);
    }

    public void startDocument(){
        System.out.println("Document is started reading");
    }

    public void startElement(String uri, String localName,String qName, Attributes attributes){
        System.out.println("Node name :"+qName);
    }

    public void characters(char ch[], int start, int length){
        String str = new String(ch, start, length);
        System.out.println(str);
    }

    public void endDocument(){
        System.out.println("Document ends here");
    }

}
