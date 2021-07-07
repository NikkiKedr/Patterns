package pattern.AbstractFactory.landTransport;

import pattern.AbstractFactory.transportInterfaces.Car;

public class Niva implements Car {
    @Override
    public void drive() {
        System.out.println("Drive speed 60 km/h");
    }

    @Override
    public void stop() {
        System.out.println("Stopped at 6 sec");
    }
}
