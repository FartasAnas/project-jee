package com.project.randomordergenerator.entities;

import com.project.randomordergenerator.model.Product;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductItem {
    private Long id;
    private double quantity;
    private double price;
    private long productID;

    private String productName;
    private Bill bill;
    private Product product;

    public double getAmount()
    {
        double some=0;
        return quantity*price;
    }
}
