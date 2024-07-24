package com.xmlparsers;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

public class JAXBTest {
    public static void main(String[] args) {
        try {
            File file = new File("/home/osiuser/Downloads/OSI Training/Nagarjuna Class Tutorials/Assignments/xmlparsers/src/main/java/com/xmlparsers/xmlfiles/department.xml");
            JAXBContext jaxbContext = JAXBContext.newInstance(Department.class);

            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            Department department = (Department) jaxbUnmarshaller.unmarshal(file);
            System.out.println(department);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
