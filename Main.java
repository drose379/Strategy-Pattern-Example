import ducks.Duck;
import ducks.MallardDuck;
import ducks.RubberDuck;
import fly.NoFly;

/**
 * Created by dylan on 1/10/17.
 */
public class Main {

    public static void main( String[] args ) {
        Duck duck = new MallardDuck();
        duck.performFly();
        duck.performQuack();
        duck.setFlyBehavior( new NoFly() );
        duck.performFly();
    }

}
