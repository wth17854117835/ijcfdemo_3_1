package com.sitech.testserviceflow.service;

import com.sitech.ijcf.boot.core.service.client.IServiceClient;
import com.sitech.ijcf.telecom.message.dt.InDTO;
import com.sitech.testserviceflow.inter.IFlowService;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

/**
 * @author wangth_oup
 * @date 2019-05-17 15:06
 **/
@Service("flowService")
public class FlowService implements IFlowService {

    @Resource
    private IServiceClient iServiceClient;

    /**
     * 消费服务
     * url:1.http://localhost:8760/com_sitech_testclientservice_inter_IClientServiceSvc_visitClient  不支持
     *     2.http://localhost:8760/visitClient
     */
    @Override
    @RequestMapping("visitClient")
    public String visitClient() {
        System.out.println("============================================");
//        创建clientService的服务入参
        InDTO<Map> mapInDTO = new InDTO<Map>();
        Map<String,Object> map = new HashMap<>();
        map.put("clientA","A");
        mapInDTO.setBody(map);
        //eureka服务提供者的服务地址
        String resorce = "http://CLIENTSERVICE/testClient";
        String rtnStr = iServiceClient.callService(resorce, mapInDTO, String.class);
        return rtnStr;
    }
}
