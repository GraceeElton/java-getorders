package com.example.graceeorders.Models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "payments")
public class Payments
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long paymentid;

    private String type;

    @ManyToMany(mappedBy = "payments")
    @JsonIgnoreProperties(value = "payments")
    private List<Order> orders = new ArrayList<>();

    public Payments()
    {
    }

    public Payments(String type)
    {
        this.type = type;
    }

    public long getPaymentid()
    {
        return paymentid;
    }

    public void setPaymentid(long paymentid)
    {
        this.paymentid = paymentid;
    }

    public String getType()
    {
        return type;
    }

    public void setType(String type)
    {
        this.type = type;
    }

    public List<Order> getOrders()
    {
        return orders;
    }

    public void setOrders(List<Order> orders)
    {
        this.orders = orders;
    }
}
