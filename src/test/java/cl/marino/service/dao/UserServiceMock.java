package cl.marino.service.dao;

import cl.marino.service.dao.dto.UserDTO;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.util.List;

public class UserServiceMock implements UserService{

    public static final String JSON = "[\n" +
            "   {\n" +
            "      \"firstName\":\"Juan\",\n" +
            "      \"lastName\":\"Perez\"\n" +
            "   },\n" +
            "   {\n" +
            "      \"firstName\":\"Elva\",\n" +
            "      \"lastName\":\"Lazo\"\n" +
            "   },\n" +
            "   {\n" +
            "      \"firstName\":\"Soila\",\n" +
            "      \"lastName\":\"Loca\"\n" +
            "   },\n" +
            "   {\n" +
            "      \"firstName\":\"Octavio\",\n" +
            "      \"lastName\":\"Cardenas\"\n" +
            "   }\n" +
            "]";

    @Override
    public List<UserDTO> getUsers() {
        return  new Gson().fromJson(JSON, new TypeToken<List<UserDTO>>(){}.getType());
    }
}
