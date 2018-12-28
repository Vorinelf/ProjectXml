package flat;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.beans.XMLEncoder;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestXml {
    public static void main(String[] args) {


        Device device1 = new KitchenDevice("Multicooker", 1, true);
        Device device2 = new KitchenDevice("Kittle", 2, true);
        Device device3 = new KitchenDevice("Microwave", 3, true);
        Device device4 = new BathroomDevice("hairdryer", 3, true, true);
        Device device5 = new BathroomDevice("hairdryer", 5, true, true);
        Device device6 = new BathroomDevice("washing_machine", 7, true, true);
        Device device7 = new LongueRoomDevice("TV", 2, true, true, true, true);
        Device device8 = new LongueRoomDevice("Computer", 4, false, false, true, false);

        try {
            FileOutputStream fos = new FileOutputStream(new File("./device.xml"));
            XMLEncoder encoder = new XMLEncoder(fos);
            encoder.writeObject(device1);
            encoder.writeObject(device2);
            encoder.writeObject(device3);
            encoder.writeObject(device4);
            encoder.writeObject(device5);
            encoder.writeObject(device6);
            encoder.writeObject(device7);
            encoder.writeObject(device8);
            encoder.close();
            fos.close();


        } catch (IOException ex) {
            ex.printStackTrace();
        }



        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        try {
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document document = builder.parse(new File("device.xml"));
            NodeList deviceList =  document.getElementsByTagName("object");
            for (int i=0;i<deviceList.getLength();i++){
                Node d = deviceList.item(i);
                if (d.getNodeType()==Node.ELEMENT_NODE) {
                    Element object = (Element) d;
                    String clasName = object.getAttribute("class");
                    String voidName = object.getAttribute("void");
                    NodeList childList = object.getChildNodes();
                    for (int k=0;k<childList.getLength();k++){
                        Node c = childList.item(k);
                        if (c.getNodeType()==Node.ELEMENT_NODE) {
                            Element child =(Element) c;
                         System.out.println("Class "+ clasName + " " + voidName  );
                        }
                    }

                }
            }
            for (int j=0;j<deviceList.getLength();j++){
                Node v = deviceList.item(j);
                if (v.getNodeType()==Node.ELEMENT_NODE) {
                    Element object = (Element)v;
                    String voidName = object.getAttribute("void");
                    NodeList childListVoid = object.getChildNodes();
                    for (int m=0;m<childListVoid.getLength();m++){
                        Node voidString = childListVoid.item(m);
                        if (voidString.getNodeType()==Node.ELEMENT_NODE) {
                            Element voidElem =(Element) voidString;
                        //    System.out.println("Void "+ voidName + " " + voidElem.getTagName() + " "+ voidElem.getTextContent() );
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
