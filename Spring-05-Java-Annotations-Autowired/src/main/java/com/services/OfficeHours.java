package com.services;

import com.interfaces.ExtraHours;
import org.springframework.stereotype.Component;

@Component
public class OfficeHours implements ExtraHours {
    @Override
    public int getHours() {
        return 5;
    }
}
