package com.cybertek.services;

import com.cybertek.interfaces.Course;
import lombok.Data;


public class Java implements Course {




    @Override
    public void getTeachingHours() {
        System.out.println("Weekly teaching hours : 20 ");
    }
}
