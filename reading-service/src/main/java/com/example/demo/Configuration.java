package com.example.demo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("reading-service")
public class Configuration {
private int start;
private int end;
public int getStart() {
	return start;
}
public void setStart(int start) {
	this.start = start;
}
public int getEnd() {
	return end;
}
public void setEnd(int end) {
	this.end = end;
}

}
