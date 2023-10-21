package dio;

public class EagerSingleton{
    private static EagerSingleton instance = new EagerSingleton();
    
    
    private EagerSingleton() {
        super();
    }

    public static EagerSingleton getInstancia(){

        return instance;
    }
}