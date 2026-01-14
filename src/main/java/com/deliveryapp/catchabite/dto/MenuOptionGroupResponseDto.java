package com.deliveryapp.catchabite.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MenuOptionGroupResponseDto {

    private Long menuOptionGroupId;
    private Long menuId;
    private String menuOptionGroupName;
    private Boolean required;
}
