package com.honeywell.devicemanagement.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.honeywell.devicemanagement.entity.Device;
import com.honeywell.devicemanagement.entity.DeviceType;

@Repository
public interface DeviceTypeRepository extends JpaRepository<DeviceType, Long> {

//	List<DeviceType> finActive();

}
