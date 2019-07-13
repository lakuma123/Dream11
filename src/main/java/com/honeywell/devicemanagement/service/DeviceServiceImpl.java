package com.honeywell.devicemanagement.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.honeywell.devicemanagement.entity.Device;
import com.honeywell.devicemanagement.repository.DeviceRepository;

@Service
public class DeviceServiceImpl implements DeviceService {

	@Autowired
	DeviceRepository deviceRepository;
	
	@Transactional
   public Device deviceRegistartion(Device device) {
	
	   deviceRepository.save(device);
	   return null;
	}

}
