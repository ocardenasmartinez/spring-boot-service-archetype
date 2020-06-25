package cl.marino.service.hystrix.feign;

import cl.marino.service.hystrix.dto.UserDTO;

import java.util.List;

public class FeignClientMock implements UserFeignClient {

    @Override
    public List<UserDTO> getUsers() {
        return null;
    }

}
