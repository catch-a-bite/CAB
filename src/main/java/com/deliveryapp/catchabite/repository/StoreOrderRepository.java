package com.deliveryapp.catchabite.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.deliveryapp.catchabite.entity.StoreOrder;
public interface StoreOrderRepository extends JpaRepository<StoreOrder,Long> {    
}
