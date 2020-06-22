package cl.marino.service.business;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class BusinessTest {

    @Autowired
    private Business business;

    @Test
    public void businessTest(){
        assertThat(business.createUser()).isNotNull();
        assertThat(business.getAllUsers()).isNotNull();
    }

}
