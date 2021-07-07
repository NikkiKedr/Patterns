package pattern.FactoryMethod;

public class Start {
    public static void main(String[] args) {
        CarFactory carFactory = new CarFactory();
        Car porsche = carFactory.getCar(RoadType.CITY);  // Create porsche
        Car geep = carFactory.getCar(RoadType.OFF_ROAD); // Create geep
        Car newGeep = carFactory.getCar(RoadType.GRASS_COVER); // Create newGeep
    }
}
