package com.cybertek.services;

import com.cybertek.interfaces.Course;
import lombok.Data;

@Data
public class Java implements Course {



    private OfficeHours officeHours;

 /*   public void setOfficeHours(OfficeHours officeHours) {
        this.officeHours = officeHours;
    }

    #    ---> we can use annototation instead
    */

    @Override
    public void getTeachingHours() {
        System.out.println("Weekly teaching hours : "+(20 + officeHours.getExtraHours()));
    }
}
