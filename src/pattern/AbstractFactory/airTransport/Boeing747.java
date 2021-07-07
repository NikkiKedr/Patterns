package pattern.AbstractFactory.airTransport;

import pattern.AbstractFactory.transportInterfaces.Aircraft;

public class Boeing747 implements Aircraft {
    @Override
    public void flight() {
        System.out.println("Boeing-747 flight");
    }
}
