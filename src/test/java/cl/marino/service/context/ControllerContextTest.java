package cl.marino.service.context;

import cl.marino.service.business.Business;
import cl.marino.service.business.mocks.BusinessMock;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;

@TestConfiguration
public class ControllerContextTest {

    @Bean
    public Business getBusiness(){
        return new BusinessMock();
    }

}
