package cl.marino.service.hystrix;

import cl.marino.service.hystrix.dto.UserDTO;
import cl.marino.service.hystrix.feign.UserFeignClient;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserHystrixImpl implements UserHystrix {

    @Autowired
    private UserFeignClient userFeignClient;

    @HystrixCommand(fallbackMethod = "reliable")
    public List<UserDTO> getUsers() {
        return userFeignClient.getUsers();
    }

    public List<UserDTO> reliable() {
        return null;
    }

}
