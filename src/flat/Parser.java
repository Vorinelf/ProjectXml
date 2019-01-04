package flat;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;


public class Parser {
    public void getParser() {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        try {
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document document = builder.parse("device.xml");
            NodeList deviceNodeList = document.getElementsByTagName("object");
            for (int i = 0; i < deviceNodeList.getLength(); i++) {
                Node nodeDevice = deviceNodeList.item(i);
                if (nodeDevice.getNodeType() == Node.ELEMENT_NODE) {
                    Element device = (Element) nodeDevice;
                    String clasName = device.getAttribute("class");
                    NodeList fieldNodeName = device.getChildNodes();
                    for (int j = 0; j > fieldNodeName.getLength(); j++) {
                        Node nodeField = fieldNodeName.item(j);
                        if (nodeField.getNodeType() == Node.ELEMENT_NODE) {
                            Element field = (Element) nodeField;
                            System.out.println(clasName + field.getTagName() + field.getTextContent());

                        }
                    }
                }
            }
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (SAXException sax) {
            sax.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
