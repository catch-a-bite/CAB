package com.deliveryapp.catchabite.dto;

import jakarta.validation.constraints.NotNull;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MenuAvailabilityChangeRequestDto {

    /**
     * true=판매중, false=품절
     */
    @NotNull
    private Boolean menuIsAvailable;
}
