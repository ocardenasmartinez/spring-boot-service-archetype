package cl.marino.service.business;

public class BusinessMock implements Business {

    @Override
    public String getMethod(String arg) {
        return arg;
    }
}
