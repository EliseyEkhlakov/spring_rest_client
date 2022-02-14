package org.adorlys.spring.rest;

import org.adorlys.spring.rest.configuration.MyConfig;
import org.adorlys.spring.rest.entity.Employee;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;


public class App 
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);
        Communication communication = context.getBean("communication",
                Communication.class);
//        List<Employee> employees = communication.getAllEmployees();
//        System.out.println(employees);
//        Employee employee = communication.getEmployee(2);
//        System.out.println(employee);
//        Employee newEmployee = new Employee("Pat", "Patson", "HQ", 2000);
//        communication.saveEmployee(newEmployee);

        communication.deleteEmployee(8);
    }
}
