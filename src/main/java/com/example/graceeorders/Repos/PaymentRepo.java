package com.example.graceeorders.Repos;

import com.example.graceeorders.Models.Payments;
import org.springframework.data.repository.CrudRepository;

public interface PaymentRepo extends CrudRepository<Payments, Long>
{

}
