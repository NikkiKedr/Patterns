package pattern.AbstractFactory.airTransport;

import pattern.AbstractFactory.transportInterfaces.Aircraft;

public class TU134 implements Aircraft {
    @Override
    public void flight() {
        System.out.println("TU-134 flight");
    }
}
