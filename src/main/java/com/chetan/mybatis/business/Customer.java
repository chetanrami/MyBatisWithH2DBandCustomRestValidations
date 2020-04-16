package com.chetan.mybatis.business;

import lombok.*;

@Getter
@EqualsAndHashCode
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customer {
    int id;
    String custName;
    int age;

}
