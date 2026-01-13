package com.deliveryapp.catchabite.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MenuCategoryResponseDto {

    private Long menuCategoryId;
    private Long storeId;
    private String menuCategoryName;
}
