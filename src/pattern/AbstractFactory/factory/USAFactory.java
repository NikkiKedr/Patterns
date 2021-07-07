package pattern.AbstractFactory.factory;

import pattern.AbstractFactory.airTransport.Boeing747;
import pattern.AbstractFactory.factoryInterfaces.TransportFactory;
import pattern.AbstractFactory.transportInterfaces.Aircraft;
import pattern.AbstractFactory.transportInterfaces.Car;
import pattern.AbstractFactory.landTransport.Porsche;


public class USAFactory implements TransportFactory {
    @Override
    public Car createCar() {
        return new Porsche();
    }

    @Override
    public Aircraft createAircraft() {
        return new Boeing747();
    }
}
