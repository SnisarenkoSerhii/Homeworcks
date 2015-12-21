/**
 * Created by Sergey on 14.12.2015.
 */


import java.io.File;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;

public class DomParser {
    public static void main(String[] args)  {
        domParser();
    }

    private static void domParser() {
        try {
            File inputFile = new File("D:\\file.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(inputFile);
            doc.getDocumentElement().normalize();
            System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
            NodeList nList = doc.getElementsByTagName("children");
            NodeList nList2 = doc.getElementsByTagName("iceCreams");
            System.out.println("----------------------------");
            for (int temp = 0; temp < nList.getLength(); temp++) {
                Node nNode = nList.item(temp);
                System.out.println("\nCurrent Element :"
                        + nNode.getNodeName());
                if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                    Element eElement = (Element) nNode;
                    System.out.println("childName : "
                            + eElement.getAttribute("childName"));
                    System.out.println("preferredColor : "
                            + eElement
                            .getElementsByTagName("preferredColor")
                            .item(0)
                            .getTextContent());
                    System.out.println("preferredName : "
                            + eElement
                            .getElementsByTagName("preferredName")
                            .item(0)
                            .getTextContent());
                    System.out.println("preferredShape : "
                            + eElement
                            .getElementsByTagName("preferredShape")
                            .item(0)
                            .getTextContent());
                    System.out.println("preferredSize : "
                            + eElement
                            .getElementsByTagName("preferredSize")
                            .item(0)
                            .getTextContent());
                    System.out.println("preferredTaste : "
                            + eElement
                            .getElementsByTagName("preferredTaste")
                            .item(0)
                            .getTextContent());
                    System.out.println("preferredWeight : "
                            + eElement
                            .getElementsByTagName("preferredWeight")
                            .item(0)
                            .getTextContent());
                }
            }
            for (int temp = 0; temp < nList2.getLength(); temp++) {
                Node nNode = nList2.item(temp);
                System.out.println("\nCurrent Element :"
                        + nNode.getNodeName());
                if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                    Element eElement = (Element) nNode;
                    System.out.println("name : "
                            + eElement.getAttribute("name"));
                    System.out.println("color : "
                            + eElement
                            .getElementsByTagName("color")
                            .item(0)
                            .getTextContent());
                    System.out.println("shape : "
                            + eElement
                            .getElementsByTagName("shape")
                            .item(0)
                            .getTextContent());
                    System.out.println("size : "
                            + eElement
                            .getElementsByTagName("size")
                            .item(0)
                            .getTextContent());
                    System.out.println("taste : "
                            + eElement
                            .getElementsByTagName("taste")
                            .item(0)
                            .getTextContent());
                    System.out.println("weight : "
                            + eElement
                            .getElementsByTagName("weight")
                            .item(0)
                            .getTextContent());
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
