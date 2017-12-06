package com.stackroute.wave6_demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-module.xml");
        Employee emp = (Employee) ctx.getBean("employeeBean");
        
        emp.display();
    }
}


