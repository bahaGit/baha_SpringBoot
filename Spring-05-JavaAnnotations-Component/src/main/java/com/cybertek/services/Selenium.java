package com.cybertek.services;

import com.cybertek.interfaces.Course;

public class Selenium implements Course
{

    @Override
    public void getTeachinghours() {
        System.out.println("Weekly teaching hours : 15");
    }
}
