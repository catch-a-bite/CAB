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
public class MenuCreateRequestDto {

    @NotNull
    private Long menuCategoryId;

    @NotBlank
    @Size(max = 100)
    private String menuName;

    @NotNull
    @Min(0)
    private Integer menuPrice;

    @Size(max = 2000)
    private String menuDescription;

    /**
     * 판매 가능 여부 (true=판매중, false=품절/비활성)
     * 기본값은 컨트롤러/서비스에서 true로 세팅 추천
     */
    private Boolean menuIsAvailable;
}
