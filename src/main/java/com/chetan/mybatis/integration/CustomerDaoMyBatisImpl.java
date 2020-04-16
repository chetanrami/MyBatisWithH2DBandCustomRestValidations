package com.chetan.mybatis.integration;

import com.chetan.mybatis.business.Customer;
import com.chetan.mybatis.business.Fund;
import com.chetan.mybatis.business.CustomerHolding;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("customerDao")
public class CustomerDaoMyBatisImpl {

    @Autowired
    CustomerMapper customerMapper;

    public List<Customer> getAllCustomers(){
        return customerMapper.getAllCustomers();
    }
    public List<Fund> getAllFunds(){
        return customerMapper.getAllFunds();
    }
    public List<CustomerHolding> getAllCustomerHoldings(){
        return customerMapper.getAllCustomerHoldings();
    }
}
