package org.springframework.samples.petclinic.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.samples.petclinic.data.entity.ProductEntity;

public interface ProductRepository extends JpaRepository<ProductEntity, String> {

}
