package com.gk.productmanagement.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.sql.Timestamp;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CreateProductResponseDTO {
    private Long productId;
    private String category;
    private String name;
    private Long price;
    private boolean isOfferApplicable;
    private Integer offerPercentage;
    private String features;

    private Long createdBy;
    private Long modifiedBy;
    private Timestamp createdOn;
    private Timestamp updatedOn;

}
