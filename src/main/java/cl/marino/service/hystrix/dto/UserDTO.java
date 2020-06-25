package cl.marino.service.hystrix.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class UserDTO {

    private String firstName;
    private String lastName;
}
