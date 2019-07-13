package com.honeywell.devicemanagement;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.honeywell.devicemanagement.entity.Device;
import com.honeywell.devicemanagement.repository.DeviceRepository;

@Controller
public class AdminAnalyticsController {

	@Autowired
	DeviceRepository deviceRepository;

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
		List<Device> activeDevices =deviceRepository.findByActive(true);
		
		
		model.put("message", activeDevices);
		return "information";
	}



}
