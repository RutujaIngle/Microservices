package com.assesment.Repository;

import org.springframework.data.repository.CrudRepository;

import com.assesment.model.ProductOrder;



public interface OrderRepository extends CrudRepository<ProductOrder, Integer> {

}
