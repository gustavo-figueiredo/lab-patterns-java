import lab.patterns.gof.singleton.SingletonEager;
import lab.patterns.gof.singleton.SingletonLazy;
import lab.patterns.gof.singleton.SingletonLazyHolder;
import lab.patterns.gof.strategy.AttackBehavior;
import lab.patterns.gof.strategy.Behavior;
import lab.patterns.gof.strategy.DefenseBehavior;
import lab.patterns.gof.strategy.NormalBehavior;
import lab.patterns.gof.strategy.Robot;

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



        Behavior normal = new NormalBehavior();
        Behavior defense = new DefenseBehavior();
        Behavior attack = new AttackBehavior();

        Robot robot = new Robot();

        robot.setBehavior(normal);
        robot.move();
        robot.move();
        robot.setBehavior(defense);
        robot.move();
        robot.setBehavior(attack);
        robot.move();
        robot.move();
        
    }
}
