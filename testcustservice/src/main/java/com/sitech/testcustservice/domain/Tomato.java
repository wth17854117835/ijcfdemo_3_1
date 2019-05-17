package com.sitech.testcustservice.domain;

/**
 * @author wangth_oup
 * @date 2019-05-16 17:15
 **/
public class Tomato {

    private String goodTomato;
    private String badTomato;

    public String getGoodTomato() {
        return goodTomato;
    }

    public void setGoodTomato(String goodTomato) {
        this.goodTomato = goodTomato;
    }

    public String getBadTomato() {
        return badTomato;
    }

    public void setBadTomato(String badTomato) {
        this.badTomato = badTomato;
    }

    @Override
    public String toString() {
        return "Tomato{" +
                "goodTomato='" + goodTomato + '\'' +
                ", badTomato='" + badTomato + '\'' +
                '}';
    }
}
