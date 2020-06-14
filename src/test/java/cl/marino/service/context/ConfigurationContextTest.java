package cl.marino.service.context;

import cl.marino.service.business.Business;
import cl.marino.service.business.BusinessMock;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@TestConfiguration
public class ConfigurationContextTest {

    @Bean
    public Business getBusiness(){
        return new BusinessMock();
    }

}
