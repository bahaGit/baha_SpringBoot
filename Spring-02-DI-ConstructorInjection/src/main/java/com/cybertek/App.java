package com.cybertek;

import com.cybertek.interfaces.Course;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        //create container

        ApplicationContext  container = new ClassPathXmlApplicationContext("config.xml");

        //call from there

         Course course =  container.getBean("java",Course.class);


        //call method with called object
        course.getTeachingHours();



    }
}
