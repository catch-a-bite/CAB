package com.deliveryapp.catchabite.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class StoreImageCreateRequestDto {

    /**
     * 업로드 후 저장된 접근 URL/경로
     */
    @NotBlank
    private String imageUrl;
}
