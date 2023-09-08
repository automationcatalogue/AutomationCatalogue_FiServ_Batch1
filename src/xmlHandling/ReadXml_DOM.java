package xmlHandling;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.FileInputStream;

public class ReadXml_DOM {
    public static void main(String[] args) throws Exception{
        FileInputStream fis = new FileInputStream("C:\\AutomationCatalogue\\Projects\\AutomationCatalogue_FirServ_Batch1\\Files\\Students.xml");
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document doc = builder.parse(fis);

        Element e = doc.getDocumentElement();
        String rootName = e.getNodeName();
        System.out.println("RootName of the element is :"+rootName);

        NodeList nList = doc.getElementsByTagName("student");
        for(int i=0;i<nList.getLength();i++){

            Node nNode = nList.item(i);
            String nodeName = nNode.getNodeName();
            System.out.println(nodeName);

            if(nNode.getNodeType() == Node.ELEMENT_NODE){
                Element element = (Element)nNode;
                String name = element.getElementsByTagName("name").item(0).getTextContent();
                System.out.println(name);

                String email = element.getElementsByTagName("email").item(0).getTextContent();
                System.out.println(email);

                String mobile = element.getElementsByTagName("mobile").item(0).getTextContent();
                System.out.println(mobile);

                String address = element.getElementsByTagName("address").item(0).getTextContent();
                System.out.println(address);
            }
        }
    }
}
