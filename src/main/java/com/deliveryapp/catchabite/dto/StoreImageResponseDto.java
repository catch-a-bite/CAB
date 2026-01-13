package com.deliveryapp.catchabite.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class StoreImageResponseDto {

    private Long storeImageId;
    private Long storeId;
    private String imageUrl;
}
