package com.deliveryapp.catchabite.converter;

import com.deliveryapp.catchabite.domain.enumtype.OrderStatus;
import com.deliveryapp.catchabite.dto.StoreOrderDTO;
import com.deliveryapp.catchabite.entity.Address;
import com.deliveryapp.catchabite.entity.AppUser;
import com.deliveryapp.catchabite.entity.Store;
import com.deliveryapp.catchabite.entity.StoreOrder;
import org.springframework.stereotype.Component;

@Component
public class StoreOrderConverter {
        //너가 보여준 코드 기준으로는 이미 타입 변환이 들어가 있어서 컴파일은 될 확률이 높아.
        //그래도 “확실히 통일”하려면 이것도 아래 코드로 교체해.

    public StoreOrderDTO toDto(StoreOrder entity) {
        if (entity == null) return null;

        return StoreOrderDTO.builder()
                .orderId(entity.getOrderId())
                .appUserId(entity.getAppUser().getAppUserId())
                .storeId(entity.getStore() != null ? entity.getStore().getStoreId() : null)
                .addressId(entity.getAddress() != null ? entity.getAddress().getAddressId() : null)
                .orderAddressSnapshot(entity.getOrderAddressSnapshot())
                .orderTotalPrice(entity.getOrderTotalPrice() != null ? Math.toIntExact(entity.getOrderTotalPrice()) : null)
                .orderDeliveryFee(entity.getOrderDeliveryFee() != null ? Math.toIntExact(entity.getOrderDeliveryFee()) : null)
                .orderStatus(entity.getOrderStatus() != null ? entity.getOrderStatus().getValue() : null)
                .orderDate(entity.getOrderDate())
                .build();
    }

    public StoreOrder toEntity(StoreOrderDTO dto, AppUser appUser, Store store, Address address) {
        if (dto == null) return null;

        return StoreOrder.builder()
                .orderId(dto.getOrderId())
                .appUser(appUser)
                .store(store)
                .address(address)
                .orderAddressSnapshot(dto.getOrderAddressSnapshot())
                .orderTotalPrice(dto.getOrderTotalPrice() != null ? dto.getOrderTotalPrice().longValue() : null)
                .orderDeliveryFee(dto.getOrderDeliveryFee() != null ? dto.getOrderDeliveryFee().longValue() : null)
                .orderStatus(dto.getOrderStatus() != null ? OrderStatus.from(dto.getOrderStatus()) : null)
                .orderDate(dto.getOrderDate())
                .build();
    }
}
