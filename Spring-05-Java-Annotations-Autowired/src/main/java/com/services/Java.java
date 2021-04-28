package com.services;


import com.interfaces.Course;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class Java  implements Course {



    @Autowired
    private OfficeHours officeHours;


    //setter injection
 /*   @Autowired
    public void setOfficeHours(OfficeHours officeHours) {
        this.officeHours = officeHours;
    }*/

    // this line is optinal if there is just one constructor
/*  @Autowired
    public Java(OfficeHours officeHours) {
        this.officeHours = officeHours;
    }*/


    @Override
    public void getTeachinghours() {
        System.out.println("Weekly teaching hours : 23 and extra hours : " +officeHours.getHours());
    }
}
