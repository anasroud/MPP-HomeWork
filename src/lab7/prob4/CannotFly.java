package lab7.prob4;

public abstract interface CannotFly extends FlyBehavior {

	@Override
	public default void fly() {
		System.out.println("can't fly");
	}
}
