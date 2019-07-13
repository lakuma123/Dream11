package com.honeywell.devicemanagement;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AdminAnalyticsController {


	// inject via application.properties
	@Value("${welcome.message:test}")
	private String message = "Hello World";

	@RequestMapping("/")
	public String welcome(Map<String, Object> model) {
		model.put("message", this.message);
		return "welcome";
	}
	
	
	@RequestMapping("/information")
	public String devicesInformation(Map<String, Object> model) {
		List<String> l1 = new ArrayList<>();
		l1.add("test1");
		l1.add("test2");
		
		model.put("message", l1);
		return "information";
	}



}
