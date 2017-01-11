package ducks;

import fly.FlyBehavior;
import quack.QuackBehavior;

public abstract class Duck {

    protected FlyBehavior _flyBehavior;
    protected QuackBehavior _quackBehavior;

    public void performQuack() {
        _quackBehavior.quack();
    }

    public void performFly() {
        _flyBehavior.fly();
    }

    public void setQuackBehavior( QuackBehavior qb ) {
        _quackBehavior = qb;
    }
    public void setFlyBehavior( FlyBehavior fb ) {
        _flyBehavior = fb;
    }

}
