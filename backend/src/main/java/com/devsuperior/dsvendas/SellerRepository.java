package com.devsuperior.dsvendas;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dsvendas.entities.Seller;

public interface SellerRepository extends JpaRepository<Seller, Long>{

}

