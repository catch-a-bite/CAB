package com.deliveryapp.catchabite.dto;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class DelivererActionRequestDTO {

    @NotNull @Positive
    private Long delivererId;
    
}
