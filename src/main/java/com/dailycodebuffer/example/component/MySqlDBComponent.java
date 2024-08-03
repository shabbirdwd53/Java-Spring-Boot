package com.dailycodebuffer.example.component;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("prod")
public class MySqlDBComponent implements DBComponent{
    @Override
    public void performDbOperation() {
        System.out.println("Performing MySQL DB Operation");
    }
}
