package cl.marino.service.feign;

import cl.marino.service.feign.dto.UserDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;


public interface UserFeignClientBasic {

    List<UserDTO> getUsers();

}
