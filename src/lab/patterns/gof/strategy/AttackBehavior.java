package lab.patterns.gof.strategy;

public class AttackBehavior implements Behavior {

    @Override
    public void move() {
        System.out.println("Attack moving...");
    }
    
}
