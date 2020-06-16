package cl.marino.service.business;

import cl.marino.service.dto.UserDTO;

import java.util.List;

public interface Business {

    int createUser();
    List<UserDTO> getAllUsers();
}
