package com.deliveryapp.catchabite.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.deliveryapp.catchabite.entity.OrderDelivery;

public interface OrderDeliveryRepository extends JpaRepository<OrderDelivery, Long> {

}
