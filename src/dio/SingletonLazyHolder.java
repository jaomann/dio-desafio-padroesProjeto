package dio;

public class SingletonLazyHolder{
    private static class Holder{
        private static SingletonLazyHolder instance = new SingletonLazyHolder();
    } 
    private SingletonLazyHolder() {
        super();
    }

    public static SingletonLazyHolder getInstancia(){

        return Holder.instance;
    }
}