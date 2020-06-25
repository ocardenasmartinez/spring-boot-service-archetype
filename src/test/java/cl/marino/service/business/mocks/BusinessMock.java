package cl.marino.service.business.mocks;

import cl.marino.service.business.Business;
import cl.marino.service.hystrix.dto.UserDTO;

import java.util.List;

public class BusinessMock implements Business {

    @Override
    public int createUser() {
        return 1;
    }

    @Override
    public List<UserDTO> getAllUsers() {
        return null;
    }
}
