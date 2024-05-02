package org.example.Card;

import java.util.List;

public class Shop {
    public List<Product> Productlist;
    public Product product;
    public Product shopping(String userInputType, String userInputColor, int size,ProductSpecification productSpecification) {
        for (Product product : Productlist) {
            if (product.productType.equals(userInputType) && product.productSpecification.colour.equals(userInputColor) && product.productSpecification.size==size ) {
                productSpecification.Price = product.productSpecification.Price;
            }
            return product;
        }
        return null;
    }

}










