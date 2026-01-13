package com.deliveryapp.catchabite.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MenuOptionResponseDto {

    private Long menuOptionId;
    private Long menuOptionGroupId;
    private String menuOptionName;
    private Integer menuOptionPrice;
}
