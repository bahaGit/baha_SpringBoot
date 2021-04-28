package com.services;


import com.interfaces.Course;
import org.springframework.stereotype.Component;

@Component
public class JavaApi implements Course {


    @Override
    public void getTeachinghours() {
        System.out.println("Api class hours : 33");
    }
}
