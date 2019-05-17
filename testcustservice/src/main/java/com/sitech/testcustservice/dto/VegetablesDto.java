package com.sitech.testcustservice.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.sitech.testcustservice.domain.Vegetables;

import java.util.List;

/**
 * @author wangth_oup
 * @date 2019-05-16 17:02
 **/
public class VegetablesDto {

    @JsonProperty("VEGETABLES")
    private List<Vegetables> vegetablesList;

    public List<Vegetables> getVegetablesList() {
        return vegetablesList;
    }

    public void setVegetablesList(List<Vegetables> vegetablesList) {
        this.vegetablesList = vegetablesList;
    }

    @Override
    public String toString() {
        return "VegetablesDto{" +
                "vegetablesList=" + vegetablesList +
                '}';
    }
}
