package pattern.FactoryMethod;

public class CarFactory {

    public Car getCar(RoadType roadType){
      Car car = null;
      switch (roadType){
          case CITY:
              car = new Porsche();
              break;
          case OFF_ROAD:
              car = new Geep();
              break;
          case GRASS_COVER:
              car = new NewGeep();
              break;
      }
      return car;
    }
}
