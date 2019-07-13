package com.honeywell.devicemanagement.service;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.honeywell.devicemanagement.entity.Device;
import com.honeywell.devicemanagement.entity.User;
import com.honeywell.devicemanagement.repository.DeviceRepository;
import com.honeywell.devicemanagement.repository.UserRepository;

@Service
public class DeviceServiceImpl implements DeviceService {

	@Autowired
	DeviceRepository deviceRepository;
	
	@Autowired
	UserRepository userRepository;
	
	@Transactional
   public Device deviceRegistartion(Device device) {
		Optional<User> user=userRepository.findById(new Long(device.getOwner().getId()));
	    device.setOwner(user.get());
		device.setCreatedBy(user.get());
		device.setUpdatedBy(user.get());
		device.setUpdateDate(new java.util.Date(System.currentTimeMillis()));
		device.setCreatedDate(new java.util.Date(System.currentTimeMillis()));
		deviceRepository.save(device);
	   return null;
	}

}
