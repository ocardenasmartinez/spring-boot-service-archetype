package cl.marino.service.feign;

import cl.marino.service.feign.dto.UserDTO;

import java.util.List;

public class FeignClientMock implements UserFeignClient {

    @Override
    public List<UserDTO> getUsers() {
        return null;
    }

}
