package com.epam.classtraining.designpatterns.builder;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class EmployeeTest {
    static Logger logger =  LogManager.getLogger(EmployeeTest.class);
    public static void main(String[] args) {
        com.epam.classtraining.designpatterns.builder.Employee employee = new com.epam.classtraining.designpatterns.builder.Employee.EmployeeBuilder("Sanjana", "Namburu", 21, 7)
                .setPhone("0045-1234556")
                .setAddress("Guntur")
                .setMail("sj@gmail.com").build();
        logger.info(employee.toString());
        com.epam.classtraining.designpatterns.builder.Employee secondEmployee = new com.epam.classtraining.designpatterns.builder.Employee.EmployeeBuilder("Kirty", "Kumari", 21, 10)
                .setPhone("98738383833")
                .setMail("kk@gmail.com").build();
        logger.info(secondEmployee.toString());
        com.epam.classtraining.designpatterns.builder.Employee suresh = new com.epam.classtraining.designpatterns.builder.Employee.EmployeeBuilder("Suresh", "Yarava", 21, 15)
               .build();
        logger.info(suresh.toString());
    }

}
