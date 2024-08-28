package lab.patterns.gof;

public class SingletonLazyHolder {

    private static class holder {
        private static final SingletonLazyHolder instance = new SingletonLazyHolder();
    }

    private SingletonLazyHolder() {
        super();
    }

    public static SingletonLazyHolder getInstance() {
        return holder.instance;
    }

}