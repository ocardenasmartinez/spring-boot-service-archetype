package cl.marino.service.context;

import cl.marino.service.business.Business;
import cl.marino.service.business.BusinessImpl;
import cl.marino.service.hystrix.UserHystrix;
import cl.marino.service.hystrix.UserHystrixImpl;
import org.springframework.cloud.openfeign.FeignClientsConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(FeignClientsConfiguration.class)
public class ConfigurationContext {

    @Bean
    public Business getBusiness(){
        return new BusinessImpl();
    }

    @Bean
    public UserHystrix getUserHystrix() {
        return new UserHystrixImpl();
    }

}
