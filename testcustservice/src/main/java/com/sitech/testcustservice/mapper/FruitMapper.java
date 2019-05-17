package com.sitech.testcustservice.mapper;

import com.sitech.testcustservice.domain.Fruit;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface FruitMapper {

    //不加@Param("id")  报错：There is no getter for property named 'id' in 'class java.lang.Integer
    List<Fruit> select(@Param("id") int id);

}
