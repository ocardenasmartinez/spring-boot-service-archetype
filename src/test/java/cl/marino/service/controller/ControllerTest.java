package cl.marino.service.controller;

import cl.marino.service.business.Business;
import cl.marino.service.context.ConfigurationContextTest;
import cl.marino.service.controllers.UserController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(classes = ConfigurationContextTest.class)
public class ControllerTest {

    @Autowired
    private UserController controller;

    @Test
    public void controllerTest() throws Exception {
        assertThat(controller.getMethod("test")).isNotNull();
    }

}
