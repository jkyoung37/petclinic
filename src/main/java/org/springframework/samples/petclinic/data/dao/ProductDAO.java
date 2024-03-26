package org.springframework.samples.petclinic.data.dao;

import org.springframework.samples.petclinic.data.entity.ProductEntity;

public interface ProductDAO {

    ProductEntity saveProduct(ProductEntity productEntity);

    ProductEntity getProduct(String productId);
}
