package com.deliveryapp.catchabite.repository;

import com.deliveryapp.catchabite.entity.Address;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Long> {

    // 사용자 주소 받아오기
    List<Address> findAllByAppUser_AppUserId(Long appUserId);
}


