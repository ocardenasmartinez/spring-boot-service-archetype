package cl.marino.service.hystrix;

import cl.marino.service.hystrix.dto.UserDTO;
import cl.marino.service.hystrix.feign.UserFeignClient;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface UserHystrix {

    List<UserDTO> getUsers();

    List<UserDTO> reliable();

}
