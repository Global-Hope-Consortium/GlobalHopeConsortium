package com.globalhopeconsortium.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Electronics {

    @Id
    private Long id;
    private String productName;
    private String condition;

    // Getters and setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }
}