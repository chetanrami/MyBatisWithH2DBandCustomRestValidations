package com.chetan.mybatis.business;

import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@EqualsAndHashCode
public class Fund {
    int id;
    String fundName;
    int price;

    public Fund(){

    }
    public Fund(int id, String name, int price){
        super();
        this.id = id;
        this.fundName = name;
        this.price = price;
    }
}
