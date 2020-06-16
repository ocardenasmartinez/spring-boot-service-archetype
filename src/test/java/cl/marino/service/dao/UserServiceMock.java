package cl.marino.service.dao;

import cl.marino.service.dto.UserDTO;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.util.List;

public class UserServiceMock implements UserService{

    public static final String JSON = "[{\"firstName\":\"Juan\",\"lastName\":\"Perez\"},{\"firstName\":\"Elva\",\"lastName\":\"Lazo\"},{\"firstName\":\"Soila\",\"lastName\":\"Loca\"}]";

    @Override
    public List<UserDTO> getUsers() {
        return  new Gson().fromJson(JSON, new TypeToken<List<UserDTO>>(){}.getType());
    }
}
