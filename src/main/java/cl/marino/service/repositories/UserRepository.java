package cl.marino.service.repositories;

import cl.marino.service.business.entities.UserEntity;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository  extends CrudRepository<UserEntity, Long> {
}
