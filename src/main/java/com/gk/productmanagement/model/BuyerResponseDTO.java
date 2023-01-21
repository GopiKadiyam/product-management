package com.gk.productmanagement.model;

import java.util.List;

public class BuyerResponseDTO {
    private Long buyer_Id;
    private String name;
    private String gmail;
    private String password;
    private Long phoneNumber;
    private List<OrderDetailsDTO> orderDetailsDTOS;
    private List<CreateProductRequestDTO> productDetailsDTOS;
}
