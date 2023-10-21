package dio;

public class LazySingleton{
    private static LazySingleton instance;
    
    
    private LazySingleton() {
        super();
    }

    public static LazySingleton getInstancia(){
        if (instance == null){
            instance = new LazySingleton();
        }
        return instance;
    }
}