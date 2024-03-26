package org.springframework.samples.petclinic.data.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.samples.petclinic.data.dao.ProductDAO;
import org.springframework.samples.petclinic.data.entity.ProductEntity;
import org.springframework.samples.petclinic.data.repository.ProductRepository;
import org.springframework.stereotype.Service;

@Service
public class ProductDAOImpl implements ProductDAO {

    ProductRepository productRepository;

    @Autowired
    public ProductDAOImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public ProductEntity saveProduct(ProductEntity productEntity) {
        this.productRepository.save(productEntity);
        return productEntity;
    }

    @Override
    public ProductEntity getProduct(String productId) {
        ProductEntity productEntity = this.productRepository.getById(productId);
        return productEntity;
    }

}
