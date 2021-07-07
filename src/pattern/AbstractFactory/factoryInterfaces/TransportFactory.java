package pattern.AbstractFactory.factoryInterfaces;

import pattern.AbstractFactory.transportInterfaces.Aircraft;
import pattern.AbstractFactory.transportInterfaces.Car;

public interface TransportFactory {
    Car createCar();
    Aircraft createAircraft();
}
