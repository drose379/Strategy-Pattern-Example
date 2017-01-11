package fly;

import fly.FlyBehavior;

/**
 * Created by dylan on 1/10/17.
 */
public class NoFly implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println( "I cannot fly" );
    }

}
