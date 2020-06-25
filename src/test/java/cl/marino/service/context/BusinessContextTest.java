package cl.marino.service.context;

import cl.marino.service.hystrix.feign.FeignClientMock;
import cl.marino.service.hystrix.feign.UserFeignClient;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;

@TestConfiguration
public class BusinessContextTest {

    @Bean
    public UserFeignClient getUserFeignClient() {
        return new FeignClientMock();
    }

}
