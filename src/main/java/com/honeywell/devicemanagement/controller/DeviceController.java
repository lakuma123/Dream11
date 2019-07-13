package com.honeywell.devicemanagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.honeywell.devicemanagement.entity.Device;
import com.honeywell.devicemanagement.service.DeviceService;

@Controller
public class DeviceController {

	@Autowired
	DeviceService deviceService;
	
	@RequestMapping(value = "/deviceRegister",method = RequestMethod.POST)
	public String deviceRegister(@ModelAttribute("device")Device device) {
		deviceService.deviceRegistartion(device);
		return "deviceRegistration";
	}
}
