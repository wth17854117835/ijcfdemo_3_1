package com.sitech.testcustservice.domain;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * @author wangth_oup
 * @date 2019-05-16 16:12
 **/
public class Fruits {
    @JSONField(name = "APPLES")
    private String apple;
    private String banana;
    private String pear;

    public String getApple() {
        return apple;
    }

    public void setApple(String apple) {
        this.apple = apple;
    }

    public String getBanana() {
        return banana;
    }

    public void setBanana(String banana) {
        this.banana = banana;
    }

    public String getPear() {
        return pear;
    }

    public void setPear(String pear) {
        this.pear = pear;
    }

    @Override
    public String toString() {
        return "Fruits{" +
                "apple='" + apple + '\'' +
                ", banana='" + banana + '\'' +
                ", pear='" + pear + '\'' +
                '}';
    }
}
