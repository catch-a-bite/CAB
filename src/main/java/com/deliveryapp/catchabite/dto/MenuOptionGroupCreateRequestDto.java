package com.deliveryapp.catchabite.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MenuOptionGroupCreateRequestDto {

    @NotBlank
    @Size(max = 100)
    private String menuOptionGroupName;

    /**
     * true=필수옵션, false=선택옵션
     */
    @NotNull
    private Boolean required;
}
