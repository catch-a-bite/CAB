package com.deliveryapp.catchabite.dto;

import lombok.*;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class StoreCreateRequestDto {

	private String storeOwnerName;
	private String storeName;
	private String storeAddress;
	private String storeCategory;
	private String storePhone;

	private Integer storeMinOrder;
	private Integer storeMaxDist;
	private Integer storeDeliveryFee;

	private Integer storeOpenTime;
	private Integer storeCloseTime;

	private String storeIntro;
}
