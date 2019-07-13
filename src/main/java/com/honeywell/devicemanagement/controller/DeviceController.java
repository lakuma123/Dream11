package com.honeywell.devicemanagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.honeywell.devicemanagement.service.DeviceService;

@Controller
public class DeviceController {

	@Autowired
	DeviceService deviceService;
}
