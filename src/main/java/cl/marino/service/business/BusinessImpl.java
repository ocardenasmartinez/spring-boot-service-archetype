package cl.marino.service.business;

import cl.marino.service.business.entities.UserEntity;
import cl.marino.service.dao.UserService;
import cl.marino.service.dto.UserDTO;
import cl.marino.service.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

import static java.util.Optional.*;

public class BusinessImpl implements Business {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserService userService;

    @Override
    public int createUser() {
        return ofNullable(userService.getUsers()).map(getListIntegerFunction()).orElse(0);
    }

    private Function<List<UserDTO>, Integer> getListIntegerFunction() {
        return users -> {
            final List<UserEntity> count = new ArrayList<>();
            users.forEach(user -> count.add(userRepository.save(new UserEntity(0L, user.getFirstName(), user.getLastName()))));
            return count.size();
        };
    }

    @Override
    public List<UserDTO> getAllUsers() {
        final List<UserDTO> usersOut = new ArrayList<>();
        return ofNullable(userRepository.findAll()).map(users -> getUserDTOS(usersOut, users)).orElse(new ArrayList<>());
    }

    private List<UserDTO> getUserDTOS(List<UserDTO> usersOut, Iterable<UserEntity> users) {
        users.forEach(user -> usersOut.add(new UserDTO(user.getFirstName(), user.getLastName())));
        return usersOut;
    }

}
