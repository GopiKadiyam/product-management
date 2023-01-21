package com.gk.productmanagement.entity;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.MappedSuperclass;
import java.sql.Timestamp;

@MappedSuperclass
public class BasicAuditable<T> {
    private T createdBy;
    private T modifiedBy;
    @CreationTimestamp
    private Timestamp createdOn;
    @UpdateTimestamp
    private Timestamp updatedOn;
}
