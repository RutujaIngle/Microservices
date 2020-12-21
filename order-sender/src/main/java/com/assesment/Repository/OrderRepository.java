package com.assesment.Repository;

import org.springframework.data.repository.CrudRepository;

import com.assesment.model.Order;



public interface OrderRepository extends CrudRepository<Order, Integer> {

}
