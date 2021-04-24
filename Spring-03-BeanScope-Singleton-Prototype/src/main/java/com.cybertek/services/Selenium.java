package com.cybertek.services;

import com.cybertek.interfaces.Course;
import lombok.Data;


@Data

public class Selenium implements Course {

    private  OfficeHours officeHours;



    @Override
    public void getTeachingHours() {
        System.out.println("Weekly teaching hours : 15 ");
        System.out.println("Weekly teaching hours with extra hours in Selenium : "+(15+officeHours.getExtraHours()));


    }
}
