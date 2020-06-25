package cl.marino.service.hystrix.mocks;

import cl.marino.service.hystrix.UserHystrix;
import cl.marino.service.hystrix.dto.UserDTO;

import java.util.List;

public class UserHystrixMock implements UserHystrix {

    @Override
    public List<UserDTO> getUsers() {
        return null;
    }

    @Override
    public List<UserDTO> reliable() {
        return null;
    }
}
