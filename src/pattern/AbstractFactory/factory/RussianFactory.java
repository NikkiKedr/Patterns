package pattern.AbstractFactory.factory;

import pattern.AbstractFactory.airTransport.TU134;
import pattern.AbstractFactory.factoryInterfaces.TransportFactory;
import pattern.AbstractFactory.transportInterfaces.Aircraft;
import pattern.AbstractFactory.transportInterfaces.Car;
import pattern.AbstractFactory.landTransport.Niva;

public class RussianFactory implements TransportFactory {
    @Override
    public Car createCar() {
       return new Niva();
    }

    @Override
    public Aircraft createAircraft() {
        return new TU134();
    }
}
