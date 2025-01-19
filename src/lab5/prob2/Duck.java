package lab5.prob2;

public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehaviour quackBehavior;

    public void setFlyBehavior(FlyBehavior fb) {
        this.flyBehavior = fb;
    }

    public void setQuackBehavior(QuackBehaviour qb) {
        this.quackBehavior = qb;
    }

    public void fly() {
        flyBehavior.fly();
    }

    public void quack() {
        quackBehavior.quack();
    }

    public void swim() {
        System.out.println("swimming");
    }

    public abstract void display();
}
