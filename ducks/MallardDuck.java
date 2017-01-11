package ducks;

import fly.WingsFly;
import quack.RegularQuack;

/**
 * Created by dylan on 1/10/17.
 */
public class MallardDuck extends Duck {

    public MallardDuck() {
        _flyBehavior = new WingsFly();
        _quackBehavior = new RegularQuack();
    }

}
