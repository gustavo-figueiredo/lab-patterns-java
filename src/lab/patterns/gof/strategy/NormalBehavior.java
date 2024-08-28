package lab.patterns.gof.strategy;

public class NormalBehavior implements Behavior {

    @Override
    public void move() {
        System.out.println("Normal moving...");
    }
    
}
