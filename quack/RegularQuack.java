package quack;

import quack.QuackBehavior;

/**
 * Created by dylan on 1/10/17.
 */
public class RegularQuack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println( "Quack quack" );
    }

}
