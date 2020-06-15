package cl.marino.service.business;

import cl.marino.service.business.entities.UserEntity;
import cl.marino.service.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class BusinessImpl implements Business {

    @Autowired
    private UserRepository userRepository;

    @Override
    public String createUser(String firstName, String lastName) {
        userRepository.save(new UserEntity(0L, firstName, lastName));
        return "OK";
    }
}
