
import lab.patterns.gof.SingletonEager;
import lab.patterns.gof.SingletonLazy;
import lab.patterns.gof.SingletonLazyHolder;

public class App {
    public static void main(String[] args) throws Exception {

        SingletonLazy singletonLazy1 = SingletonLazy.getInstance();
        SingletonEager singletonEager1 = SingletonEager.getInstance();
        SingletonLazyHolder singletonLazyHolder1 = SingletonLazyHolder.getInstance();

        SingletonLazy singletonLazy2 = SingletonLazy.getInstance();
        SingletonEager singletonEager2 = SingletonEager.getInstance();
        SingletonLazyHolder singletonLazyHolder2 = SingletonLazyHolder.getInstance();

        System.out.println("singletonLazy1 " + singletonLazy1);
        System.out.println("singletonLazy2 " + singletonLazy2);

        System.out.println("singletonEager1 " + singletonEager1);
        System.out.println("singletonEager2 " + singletonEager2);

        System.out.println("singletonLazyHolder1 " + singletonLazyHolder1);
        System.out.println("singletonLazyHolder2 " + singletonLazyHolder2);
    }
}
