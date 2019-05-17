package com.sitech.testclientservice.Dto;

/**
 * @author wangth_oup
 * @date 2019-05-17 14:15
 **/
public class ClientBeanDto {
    private String ClientA;
    private String ClientB;

    public String getClientA() {
        return ClientA;
    }

    public void setClientA(String clientA) {
        ClientA = clientA;
    }

    public String getClientB() {
        return ClientB;
    }

    public void setClientB(String clientB) {
        ClientB = clientB;
    }

    @Override
    public String toString() {
        return "ClientBeanDto{" +
                "ClientA='" + ClientA + '\'' +
                ", ClientB='" + ClientB + '\'' +
                '}';
    }
}
