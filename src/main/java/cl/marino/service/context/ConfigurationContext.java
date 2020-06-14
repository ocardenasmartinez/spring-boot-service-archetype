package cl.marino.service.context;

import cl.marino.service.business.Business;
import cl.marino.service.business.BusinessImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigurationContext {

    @Bean
    public Business getBusiness(){
        return new BusinessImpl();
    }

}
