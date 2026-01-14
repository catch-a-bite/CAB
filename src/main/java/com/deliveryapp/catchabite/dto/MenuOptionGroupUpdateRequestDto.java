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
public class MenuOptionGroupUpdateRequestDto {

    @NotBlank
    @Size(max = 100)
    private String menuOptionGroupName;

    @NotNull
    private Boolean required;
}
