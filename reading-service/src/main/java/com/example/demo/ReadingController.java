package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReadingController {
	@Autowired Configuration config;
@GetMapping("/reading")
public Readings getReadings() {
	return new Readings(config.getStart(), config.getEnd());
}
}
