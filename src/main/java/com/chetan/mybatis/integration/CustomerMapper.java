package com.chetan.mybatis.integration;

import com.chetan.mybatis.business.Customer;
import com.chetan.mybatis.business.CustomerHolding;
import com.chetan.mybatis.business.Fund;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface CustomerMapper {
    List<Customer> getAllCustomers();
    List<Fund> getAllFunds();
    List<CustomerHolding> getAllCustomerHoldings();

}
