package com.deliveryapp.catchabite.dto;

import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class UserStoreOrderRequestDTO {
    @NotNull(message = "App User ID is required")
    private Long appUserId;

    @NotNull(message = "Store ID is required")
    private Long storeId;

    @NotNull(message = "Address ID is required")
    private Long addressId;

    private String storeRequest;   // e.g. "No pickles"
    private String riderRequest;   // e.g. "Leave at door"
    private String paymentMethod;  // e.g. "CARD"
}
