package pattern.FactoryMethod;

public class Porsche implements Car{
    @Override
    public void drive() {
        System.out.println("Drive speed 150 km/h");
    }

    @Override
    public void stop() {
        System.out.println("Stopped at 7 sec");
    }
}
