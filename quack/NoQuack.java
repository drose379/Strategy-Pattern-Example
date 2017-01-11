package quack;

import quack.QuackBehavior;

/**
 * Created by dylan on 1/10/17.
 */
public class NoQuack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println( "I cannot quack" );
    }

}
