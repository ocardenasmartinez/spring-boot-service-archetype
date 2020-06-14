package cl.marino.service.business.mocks;

import cl.marino.service.business.Business;

public class BusinessMock implements Business {

    @Override
    public String getMethod(String arg) {
        return arg;
    }
}
