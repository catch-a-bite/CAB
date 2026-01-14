package com.deliveryapp.catchabite.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MenuResponseDto {

    private Long menuId;
    private Long storeId;
    private Long menuCategoryId;

    private String menuName;
    private Integer menuPrice;
    private String menuDescription;
    private Boolean menuIsAvailable;
}
