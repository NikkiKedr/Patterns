package pattern.singleton;

public class Singletone {
    public static Singletone instance;

    public static Singletone getInstance(){
        if (instance==null){
            instance = new Singletone();
        }
        return instance;
    }

    private Singletone() {}

}
