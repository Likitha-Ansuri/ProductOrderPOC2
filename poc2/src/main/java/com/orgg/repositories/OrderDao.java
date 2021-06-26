package com.orgg.repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import com.orgg.models.Orders;

public interface OrderDao extends JpaRepository<Orders, Integer> {

}
