package com.example.demo.config;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

/** # START: Section #10 - Health Check & Metrisc # */
@Component
public class CustomHealthIndicator implements HealthIndicator {

	@Override
	public Health health() {
//		boolean error = true;
//		if (error) {
//			return Health.down().withDetail("Erorr Key Test", 123).build();
//		}
		return Health.up().build();
	}

}
