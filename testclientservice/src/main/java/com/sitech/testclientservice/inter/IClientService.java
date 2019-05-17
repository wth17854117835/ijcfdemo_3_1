package com.sitech.testclientservice.inter;

import com.sitech.ijcf.telecom.message.dt.InDTO;
import com.sitech.testclientservice.Dto.ClientBeanDto;

public interface IClientService {

    public String testClient(InDTO<ClientBeanDto> clientBeanDtoInDTO);

}
