package cl.marino.service.context;

import cl.marino.service.business.Business;
import cl.marino.service.business.BusinessImpl;
import cl.marino.service.dao.UserService;
import cl.marino.service.dao.UserServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigurationContext {

    @Bean
    public Business getBusiness(){
        return new BusinessImpl();
    }

    @Bean
    public UserService getUserService() {
        return new UserServiceImpl();
    }

}
