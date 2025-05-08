package com.example.demo.config;

import org.springframework.boot.actuate.info.Info;
import org.springframework.boot.actuate.info.InfoContributor;
import org.springframework.stereotype.Component;

/** #ASSIGNMENT: Section #10 - Health Check & Metrisc #*/
@Component
public class CustomInfoContributor implements InfoContributor {
    @Override
    public void contribute(Info.Builder builder) {
        builder.withDetail("custom-info", "This is a custom info contribution");
    }
}
