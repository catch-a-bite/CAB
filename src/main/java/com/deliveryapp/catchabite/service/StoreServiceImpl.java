package com.deliveryapp.catchabite.service;

import com.deliveryapp.catchabite.dto.*;
import com.deliveryapp.catchabite.entity.Store;
import com.deliveryapp.catchabite.domain.enumtype.StoreOpenStatus;
import com.deliveryapp.catchabite.repository.StoreRepository;

import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
@Transactional
public class StoreServiceImpl implements StoreService {

	private final StoreRepository storeRepository;

	@Override
	public Long createStore(StoreCreateRequestDto dto) {

		Store store = Store.builder()
				.storeOwnerName(dto.getStoreOwnerName())
				.storeName(dto.getStoreName())
				.storeAddress(dto.getStoreAddress())
				.storeCategory(dto.getStoreCategory())
				.storePhone(dto.getStorePhone())
				.storeMinOrder(dto.getStoreMinOrder())
				.storeMaxDist(dto.getStoreMaxDist())
				.storeDeliveryFee(dto.getStoreDeliveryFee())
				.storeOpenTime(dto.getStoreOpenTime())
				.storeCloseTime(dto.getStoreCloseTime())
				.storeIntro(dto.getStoreIntro())
				.storeOpenStatus(StoreOpenStatus.CLOSE)
				.storeRating(0.0)
				.storeTotalOrder(0)
				.storeRecentOrder(0)
				.build();

		storeRepository.save(store);
		return store.getStoreId();
	}

	@Override
	@Transactional(readOnly = true)
	public StoreInfoResponseDto getStore(Long storeId) {

		Store store = storeRepository.findById(storeId)
				.orElseThrow(() -> new IllegalArgumentException("store not found"));

		return toResponseDto(store);
	}

	@Override
	@Transactional(readOnly = true)
	public List<StoreInfoResponseDto> getStoreList() {

		return storeRepository.findAll()
				.stream()
				.map(this::toResponseDto)
				.collect(Collectors.toList());
	}

	@Override
	public void updateStore(Long storeId, StoreUpdateRequestDto dto) {

		Store store = storeRepository.findById(storeId)
				.orElseThrow(() -> new IllegalArgumentException("store not found"));

		store.update(dto);
	}

	@Override
	public void changeStoreStatus(Long storeId, StoreStatusChangeRequestDto dto) {

		Store store = storeRepository.findById(storeId)
				.orElseThrow(() -> new IllegalArgumentException("store not found"));

		store.changeStatus(dto.getStoreOpenStatus());
	}

	private StoreInfoResponseDto toResponseDto(Store store) {

		return StoreInfoResponseDto.builder()
				.storeId(store.getStoreId())
				.storeOwnerName(store.getStoreOwnerName())
				.storeName(store.getStoreName())
				.storeAddress(store.getStoreAddress())
				.storeCategory(store.getStoreCategory())
				.storePhone(store.getStorePhone())
				.storeMinOrder(store.getStoreMinOrder())
				.storeDeliveryFee(store.getStoreDeliveryFee())
				.storeOpenTime(store.getStoreOpenTime())
				.storeCloseTime(store.getStoreCloseTime())
				.storeRating(store.getStoreRating())
				.storeTotalOrder(store.getStoreTotalOrder())
				.storeOpenStatus(store.getStoreOpenStatus())
				.storeIntro(store.getStoreIntro())
				.build();
	}
}
