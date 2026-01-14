package com.deliveryapp.catchabite.dto;

import com.deliveryapp.catchabite.domain.enumtype.StoreOpenStatus;
import lombok.*;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class StoreInfoResponseDto {

	private Long storeId;

	private String storeOwnerName;
	private String storeName;
	private String storeAddress;
	private String storeCategory;
	private String storePhone;

	private Integer storeMinOrder;
	private Integer storeDeliveryFee;
	private Integer storeOpenTime;
	private Integer storeCloseTime;

	private Double storeRating;
	private Integer storeTotalOrder;

	private StoreOpenStatus storeOpenStatus;
	private String storeIntro;
}
