package com.gk.productmanagement.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CreateOrderRequestDTO {

    private String paymentType;
    private String paymentStatus;
    private Long userId;
    private Long productId;
}
