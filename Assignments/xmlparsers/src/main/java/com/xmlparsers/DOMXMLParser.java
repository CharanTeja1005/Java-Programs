package com.xmlparsers;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class DOMXMLParser {
    public static void main(String[] args) {
        try {
            DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
            Document document = documentBuilder.newDocument();
            Element root = document.createElement("department");
            root.setAttribute("name", "SE-Arch");
            document.appendChild(root);

            Element employee1 = document.createElement("employee");
            employee1.setAttribute("employeeId", "NS3556");

            Element name1 = document.createElement("name");
            name1.appendChild(document.createTextNode("Charan"));
            employee1.appendChild(name1);

            Element age1 = document.createElement("age");
            age1.appendChild(document.createTextNode("22"));
            employee1.appendChild(age1);

            root.appendChild(employee1);
            
            Element employee2 = document.createElement("employee");
            employee2.setAttribute("employeeId", "NS3556");

            Element name2 = document.createElement("name");
            name2.appendChild(document.createTextNode("Charan"));
            employee2.appendChild(name2);

            Element age2 = document.createElement("age");
            age2.appendChild(document.createTextNode("22"));
            employee2.appendChild(age2);

            root.appendChild(employee2);

            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(document);
            StreamResult result = new StreamResult(new File("/home/osiuser/Downloads/OSI Training/Nagarjuna Class Tutorials/Assignments/xmlparsers/src/main/java/com/xmlparsers/xmlfiles/DOM deparment.xml"));
            transformer.transform(source, result);

            System.out.println("DOM XML has been created!");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
