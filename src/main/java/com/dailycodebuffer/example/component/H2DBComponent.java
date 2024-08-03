package com.dailycodebuffer.example.component;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Primary
@Profile("qa")
public class H2DBComponent implements DBComponent{
    @Override
    public void performDbOperation() {
        System.out.println("Performing H2 DB Operation");
    }
}
