package com.cybertek.services;

import com.cybertek.interfaces.Course;
import org.springframework.stereotype.Component;

@Component
public class Java  implements Course {

    @Override
    public void getTeachinghours() {
        System.out.println("Weekly teaching hours : 23");






    }
}
