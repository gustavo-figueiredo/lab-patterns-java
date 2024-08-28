package lab.patterns.gof.strategy;

public class DefenseBehavior implements Behavior {

    @Override
    public void move() {
        System.out.println("Defense moving...");
    }
    
}
