package com.deliveryapp.catchabite.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MenuOptionUpdateRequestDto {

    @NotBlank
    @Size(max = 100)
    private String menuOptionName;

    @NotNull
    @Min(0)
    private Integer menuOptionPrice;
}
