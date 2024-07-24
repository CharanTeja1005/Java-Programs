package com.xmlparsers;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

public class CreateXMLUsingJAXB {
    public static void main(String[] args) {
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(Department.class);
    
            Department department = new Department();
            Employee employee1 = new Employee("NS3556", "Charan Teja", 22);
            employee1.setAddress(new Address("Secunderabad", "Telangana", "India"));
            Employee employee2 = new Employee("NS3547", "Surya Teja", 22);
            employee2.setAddress(new Address("Bangkok", "Singapore", "India"));

            department.addEmployee(employee1);
            department.addEmployee(employee2);

            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            jaxbMarshaller.marshal(department, new File("/home/osiuser/Downloads/OSI Training/Nagarjuna Class Tutorials/Assignments/xmlparsers/src/main/java/com/xmlparsers/xmlfiles/department.xml"));

            System.out.println("File written successfully!");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
