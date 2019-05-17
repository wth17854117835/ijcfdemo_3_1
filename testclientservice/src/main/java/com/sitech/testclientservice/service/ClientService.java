package com.sitech.testclientservice.service;

import com.sitech.ijcf.telecom.message.dt.InDTO;
import com.sitech.testclientservice.Dto.ClientBeanDto;
import com.sitech.testclientservice.inter.IClientService;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author wangth_oup
 * @date 2019-05-17 14:20
 **/

@Service("clientService")
public class ClientService implements IClientService {

    /**
     * demo1
     * 电信格式的入参：
     * {
         "contractRoot": {
             "tcpCont": {
                 "svcCode": "40400400060001",
                 "appKey": "CRM-Portal",
                 "dstSysId": "MktResCenter ",
                 "transactionId": "1001000101201602021234567890",
                 "reqTime": null,
                 "sign": "xxxxxxxxxxxxx",
                 "version": "1.0"
             },
             "svcCont": {
                 "authenticationInfo": {
                     "sysUserId": "10001",
                     "sysUserPostId": "20001"
                 },
                 "requestObject": {
                     "FRUITS" : [{
                        "clientA":"C"
                     }]
                 }
             }
         }
     }
     *
     * url:1.http://localhost:8889/testClient          SpringMVC原生访问
     *     2.http://localhost:8889/com_sitech_testclientservice_inter_IClientServiceSvc_testClient
     * 电信格式的出参：
     *
     {
         "contractRoot": {
             "svcCont": {
                 "resultCode": "0",
                 "resultMsg": "OK!"
             },
             "tcpCont": {
                 "sign": "79e994d7683bee868c96dadc45b580d5",
                 "rspTime": "20190517144525805",
                 "transactionId": "1001000101201602021234567890"
             }
         }
     }
     */
    @Override
    @RequestMapping("testClient")
    @ResponseBody
    public String testClient(@RequestBody InDTO<ClientBeanDto> clientBeanDtoInDTO) {
        String clientA = clientBeanDtoInDTO.getBody().getClientA();
//        it's client :ClientBeanDto{ClientA='null', ClientB='null'}!
        System.out.println("it's client :"+clientBeanDtoInDTO.getBody().toString()+"!");
        return clientA;
    }
}
