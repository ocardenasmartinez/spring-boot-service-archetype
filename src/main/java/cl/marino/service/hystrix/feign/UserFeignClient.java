package cl.marino.service.hystrix.feign;

import cl.marino.service.hystrix.dto.UserDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient("SERVICE-DUMMY")
public interface UserFeignClient {

    @RequestMapping(method = RequestMethod.GET, value = "/getusers")
    List<UserDTO> getUsers();

}
