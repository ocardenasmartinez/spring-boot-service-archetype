package cl.marino.service.business;

import cl.marino.service.context.BusinessContextTest;
import cl.marino.service.context.ControllerContextTest;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(classes = BusinessContextTest.class)
public class BusinessTest {

    @Autowired
    private Business business;

    @Test
    public void businessTest(){
        assertThat(business.createUser()).isNotNull();
    }

}
