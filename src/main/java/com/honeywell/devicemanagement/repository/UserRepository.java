package com.honeywell.devicemanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.honeywell.devicemanagement.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
