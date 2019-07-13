package com.honeywell.devicemanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.honeywell.devicemanagement.entity.Device;

@Repository
public interface DeviceRepository extends JpaRepository<Device, Long> {

}
