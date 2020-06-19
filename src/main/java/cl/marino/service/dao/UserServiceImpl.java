package cl.marino.service.dao;

import cl.marino.service.dao.dto.UserDTO;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

public class UserServiceImpl implements UserService{

    @Value("${service-mock}")
    private String serviceMock;

    @Override
    public List<UserDTO> getUsers() {
        return Arrays.asList(new RestTemplate().getForEntity(serviceMock, UserDTO[].class).getBody());
    }
}
