package com.mouritech.swaggerspringbootexample.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mouritech.swaggerspringbootexample.entity.Seller;

@Repository
public interface SellerRepository extends JpaRepository<Seller, Long> {

}
