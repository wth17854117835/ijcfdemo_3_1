package com.sitech.testcustservice.inter;

import com.sitech.ijcf.message6.dt.in.InDTO;
import com.sitech.testcustservice.domain.Fruit;
import com.sitech.testcustservice.dto.FruitsDto;
import com.sitech.testcustservice.dto.VegetablesDto;

import java.util.Map;

public interface ICustInfoAo {

    //使用fastjson的注解@JSONField
    public Map testDtoBind(InDTO<FruitsDto> fruitsDtoInDTO);

    //使用jackjson的注解@JsonProperty
    public Map testDtoBindWithJackjson(InDTO<VegetablesDto> vegetablesDtoInDTO);

    //查询fruit
    public Fruit qryFruit(int id);
}
