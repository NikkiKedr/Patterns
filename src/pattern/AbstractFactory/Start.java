package pattern.AbstractFactory;

import pattern.AbstractFactory.factory.RussianFactory;
import pattern.AbstractFactory.factoryInterfaces.TransportFactory;
import pattern.AbstractFactory.transportInterfaces.Aircraft;

public class Start {
    public static void main(String[] args) {
        TransportFactory russianFactory = new RussianFactory();
        Aircraft aircraft = russianFactory.createAircraft();
        aircraft.flight();
    }
}
