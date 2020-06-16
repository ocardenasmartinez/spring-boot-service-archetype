package cl.marino.service.context;

import cl.marino.service.dao.UserService;
import cl.marino.service.dao.UserServiceMock;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;

@TestConfiguration
public class BusinessContextTest {

    @Bean
    public UserService getUserService() {
        return new UserServiceMock();
    }

}
