package ducks;

import ducks.Duck;
import fly.NoFly;
import quack.SqueakQuack;

/**
 * Created by dylan on 1/10/17.
 */
public class RubberDuck extends Duck {

    public RubberDuck() {
        _flyBehavior = new NoFly();
        _quackBehavior = new SqueakQuack();
    }
}
