package com.deliveryapp.catchabite.service;

import com.deliveryapp.catchabite.dto.*;

import java.util.List;

public interface StoreService {

	Long createStore(StoreCreateRequestDto dto);

	StoreInfoResponseDto getStore(Long storeId);

	List<StoreInfoResponseDto> getStoreList();

	void updateStore(Long storeId, StoreUpdateRequestDto dto);

	void changeStoreStatus(Long storeId, StoreStatusChangeRequestDto dto);
}
