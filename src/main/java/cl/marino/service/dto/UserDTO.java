package cl.marino.service.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import net.bytebuddy.asm.Advice;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class UserDTO {

    private String firstName;
    private String lastName;

}
