package com.example.graceeorders.Repos;

import com.example.graceeorders.Models.Order;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepos extends CrudRepository<Order, Long>
{

}
