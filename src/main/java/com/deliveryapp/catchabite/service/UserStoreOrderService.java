package com.deliveryapp.catchabite.service;

import com.deliveryapp.catchabite.dto.StoreOrderDTO;
import com.deliveryapp.catchabite.dto.UserStoreOrderRequestDTO;
import com.deliveryapp.catchabite.dto.UserStoreSummaryDTO;
import com.deliveryapp.catchabite.entity.StoreOrder;

import java.util.List;

public interface UserStoreOrderService {

    // Create
    StoreOrderDTO createStoreOrder(UserStoreOrderRequestDTO dto);
    // Read
    StoreOrderDTO getStoreOrder(Long orderId);
    List<StoreOrderDTO> getAllStoreOrdersForId(Long appUserId);
    List<StoreOrderDTO> getAllStoreOrders();
    // Update
    StoreOrderDTO updateStoreOrder(Long orderId, StoreOrderDTO dto);
    // Delete
    boolean deleteStoreOrder(Long orderId);    

    // 자주 방문한 매장 조회
    List<UserStoreSummaryDTO> getFrequentStores(Long userId);
    
    // Review에서 필요한 자료
    StoreOrder getValidatedOrder(Long storeOrderId);
    Long getStoreId(Long storeOrderId);
    Long getAddressId(Long storeOrderId);
}
