package fly;

import fly.FlyBehavior;

/**
 * Created by dylan on 1/10/17.
 */
public class WingsFly implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println( "Flying with wings" );
    }

}
