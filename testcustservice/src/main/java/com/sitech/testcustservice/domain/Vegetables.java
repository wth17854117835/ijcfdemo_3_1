package com.sitech.testcustservice.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.NotNull;

/**
 * @author wangth_oup
 * @date 2019-05-16 17:12
 **/
public class Vegetables {
    @JsonProperty("TOMATO")
    private Tomato tomatoes;

    @NotNull(message = "土豆不能少！")
    @JsonProperty("POTATOES")
    private String potato;

    public Tomato getTomatoes() {
        return tomatoes;
    }

    public void setTomatoes(Tomato tomatoes) {
        this.tomatoes = tomatoes;
    }

    public String getPotato() {
        return potato;
    }

    public void setPotato(String potato) {
        this.potato = potato;
    }

    @Override
    public String toString() {
        return "Vegetables{" +
                "tomatoes=" + tomatoes +
                ", potato='" + potato + '\'' +
                '}';
    }
}
