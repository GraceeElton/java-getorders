package com.example.graceeorders.Models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "orders")
public class Order
{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long ordernum;

    private double advanceamount;
    private double ordamount;
    private String orderdescription;

    // cobined column custcode // add in later;

    @ManyToOne()
    @JoinColumn(name = "custcode", nullable = false)
    @JsonIgnoreProperties(value = "orders")
    private Customer customer;

    @ManyToMany()
    @JoinTable(name = "orderspayments",
            joinColumns = @JoinColumn(name = "ordnum"),
            inverseJoinColumns = @JoinColumn(name = "paymentid"))
    @JsonIgnoreProperties(value = "orders")
    private List<Payments> payments = new ArrayList<>();

    public Order()
    {
    }

    public Order( double advanceamount, double ordamount, String orderdescription, Customer customer)
    {
        this.advanceamount = advanceamount;
        this.ordamount = ordamount;
        this.orderdescription = orderdescription;
        this.customer = customer;
    }

    public long getOrdernum()
    {
        return ordernum;
    }

    public void setOrdernum(long ordernum)
    {
        this.ordernum = ordernum;
    }

    public double getAdvanceamount()
    {
        return advanceamount;
    }

    public void setAdvanceamount(double advanceamount)
    {
        this.advanceamount = advanceamount;
    }

    public double getOrdamount()
    {
        return ordamount;
    }

    public void setOrdamount(double ordamount)
    {
        this.ordamount = ordamount;
    }

    public String getOrderdescription()
    {
        return orderdescription;
    }

    public void setOrderdescription(String orderdescription)
    {
        this.orderdescription = orderdescription;
    }

    public Customer getCustomer()
    {
        return customer;
    }

    public void setCustomer(Customer customer)
    {
        this.customer = customer;
    }

    public List<Payments> getPayments()
    {
        return payments;
    }

    public void setPayments(List<Payments> payments)
    {
        this.payments = payments;
    }
}
