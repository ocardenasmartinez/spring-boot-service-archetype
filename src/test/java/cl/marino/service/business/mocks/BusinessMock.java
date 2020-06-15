package cl.marino.service.business.mocks;

import cl.marino.service.business.Business;

public class BusinessMock implements Business {

    @Override
    public String createUser(String firstName, String lastName) {
        return "OK";
    }
}
