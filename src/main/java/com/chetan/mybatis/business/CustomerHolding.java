package com.chetan.mybatis.business;

import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@EqualsAndHashCode
public class CustomerHolding {
    int id;
    int customerNo;
    int fundQuantity;
    int fundNo;

    public CustomerHolding(){

    }
    public CustomerHolding(int id, int customerNo, int fundQuantity, int fundNo){
        super();
        this.fundNo = id;
        this.customerNo = customerNo;
        this.fundQuantity = fundQuantity;
        this.fundNo = fundNo;
    }
}