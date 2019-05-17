package com.sitech.testcustservice.dto;

import com.alibaba.fastjson.annotation.JSONField;
import com.sitech.testcustservice.domain.Fruits;

import java.util.List;

/**
 * @author wangth_oup
 * @date 2019-05-16 15:56
 **/
public class FruitsDto {

    @JSONField(name = "FRUITS")
    private List<Fruits> fruitsList;

    public List<Fruits> getFruitsList() {
        return fruitsList;
    }

    public void setFruitsList(List<Fruits> fruitsList) {
        this.fruitsList = fruitsList;
    }

    @Override
    public String toString() {
        return "FruitsDto{" +
                "fruitsList=" + fruitsList +
                '}';
    }
}
