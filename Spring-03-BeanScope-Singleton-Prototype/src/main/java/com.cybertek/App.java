package com.cybertek;

import com.cybertek.interfaces.Course;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        //create container

        ApplicationContext  container = new ClassPathXmlApplicationContext("config.xml");

        //call from there

         Course course1 =  container.getBean("java",Course.class);

        Course course2 =  container.getBean("java",Course.class);

        System.out.println("pointing to the same onject : "+ (course2==course1));
        //pointing to the same onject : true


        System.out.println("Memory location for the course1: "+ (course1));

        System.out.println("Memory location for the course2 : "+ (course2));


//        Memory location for the course1: com.cybertek.services.Java@5442a311
//        Memory location for the course2 : com.cybertek.services.Java@5442a311


    }
}
