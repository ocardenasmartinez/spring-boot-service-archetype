package cl.marino.service.context;

import cl.marino.service.hystrix.UserHystrix;
import cl.marino.service.hystrix.mocks.UserHystrixMock;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;

@TestConfiguration
public class BusinessContextTest {

    @Bean
    public UserHystrix getUserHystrix() {
        return new UserHystrixMock();
    }

}
