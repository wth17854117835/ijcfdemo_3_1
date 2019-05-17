package com.sitech.testcustservice.domain;

/**
 * @author wangth_oup
 * @date 2019-05-16 15:55
 **/
public class Fruit {

    private Integer id;
    private String apple;
    private String banana;
    private String pear;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

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
        return "Fruit{" +
                "id=" + id +
                ", apple='" + apple + '\'' +
                ", banana='" + banana + '\'' +
                ", pear='" + pear + '\'' +
                '}';
    }
}
