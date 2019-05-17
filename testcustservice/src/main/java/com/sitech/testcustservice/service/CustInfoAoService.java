package com.sitech.testcustservice.service;

import com.sitech.ijcf.message6.dt.in.InDTO;
import com.sitech.testcustservice.domain.Fruit;
import com.sitech.testcustservice.domain.Fruits;
import com.sitech.testcustservice.dto.FruitsDto;
import com.sitech.testcustservice.dto.VegetablesDto;
import com.sitech.testcustservice.inter.ICustInfoAo;
import com.sitech.testcustservice.mapper.FruitMapper;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

/**
 * @author wangth_oup
 * @date 2019-05-16 15:58
 **/
@Service("custInfoAoServiceSvc")
public class CustInfoAoService implements ICustInfoAo {

    @Resource
    private FruitMapper fruitMapper;

    /**
     * demo1
     * 实体类使用@JSONField注解  应该使用fastjson
     * url:http://localhost:8888/rs/com_sitech_testcustservice_inter_ICustInfoAoSvc_testDtoBind"（传统jcf服务访问）
     * 入参：
     * {
		 "ROOT" : {
		 	"BODY" : {
			 "FRUITS" : [{
			 "APPLE" : "one"
			 }]
		 },
	 	"HEADER" : {}
		 }
	 }
	 * 出参：
	 * {
          "ROOT": {
            "BODY": {
              "DETAIL_MSG": "OK",
              "OUT_DATA": {
                "fruits": "orange"
              },
              "PROMPT_MSG": "",
              "REQUEST_ID": "20190516165708000_5452_36",
              "RETURN_CODE": "0",
              "RETURN_MSG": "OK",
              "RUN_IP": "172.29.4.48",
              "USER_MSG": "OK"
            },
            "HEADER": {}
          }
        }
	 * 坑：@RequestParam注解用于GET请求    @RequestBody注解用于POST请求   @PathVariable注解用于后台动态获取参数
     */
    public Map testDtoBind(@RequestBody InDTO<FruitsDto> fruitsDtoInDTO){
        System.out.println("We have those Fruits"+fruitsDtoInDTO.getBody().getFruitsList().toString()+"!");
        Map map = new HashMap();
        map.put("fruits","orange");
        return map;
    }

    /**
     * demo2
     * 实体类使用@JsonProperty注解
     * url:http://localhost:8888/testDtoBindWithJackjson  (springmvc原生访问方式)
     * 入参：
     {
         "ROOT" : {
             "BODY" : {
                 "VEGETABLES" : [{
                     "TOMATO" : {
                        "goodTomato" : 1
                     },
                 "POTATOES" : "two"
                 }]
             },
         "HEADER" : {}
         }
     }
     * 出参：
     {
         "ROOT": {
             "HEADER": {},
             "BODY": {
                 "RUN_IP": "172.29.4.48",
                 "REQUEST_ID": "20190516173452198_19028_33",
                 "RETURN_CODE": "0",
                 "RETURN_MSG": "OK",
                 "USER_MSG": "OK",
                 "DETAIL_MSG": "OK",
                 "OUT_DATA": {
                    "Vegetables": "白菜"
                 },
                 "PROMPT_MSG": ""
             }
         }
     }
     * 校验注解@Valid 不通过输出@NotNull中的message
     */
    @RequestMapping(value = "testDtoBindWithJackjson", method = POST)
    public Map testDtoBindWithJackjson(@RequestBody @Valid InDTO<VegetablesDto> vegetablesDtoInDTO){
        System.out.println("We have those vegetables :"+vegetablesDtoInDTO.getBody().getVegetablesList().toString()+"!");

        Map map = new HashMap();
        map.put("Vegetables","白菜");
        return map;
    }


    /**
     * demo3
     * 入库操作，依赖mybatis
     * url：http://localhost:8888/qryFruit?id=1  （springmvc原生访问方式）
     * 出参：
     {
     "ROOT": {
         "BODY": {
             "RUN_IP": "172.29.4.48",
             "REQUEST_ID": "20190516193025071_4456_33",
             "RETURN_CODE": "0",
             "RETURN_MSG": "OK",
             "USER_MSG": "OK",
             "DETAIL_MSG": "OK",
             "OUT_DATA": {
                 "id": 1,
                 "apple": "红富士",
                 "banana": "黄金1号",
                 "pear": "库尔勒香梨"
             },
             "PROMPT_MSG": ""
         }
         }
     }
     *
     */
    @Override
    @RequestMapping(value = "qryFruit", method = POST)
    public Fruit qryFruit(int id) {
        List<Fruit> fruitList = fruitMapper.select(id);
        return fruitList.get(0);
    }


}
