package lab7.prob4;

public class Main {

	public static void main(String[] args) {
		Duck[] ducks = {
				new RedheadDuck(),
				new RubberDuck(),
				new MallardDuck(),
				new DecoyDuck(),

		};
		
		for(Duck d: ducks) {
			System.out.println(d.getClass().getSimpleName() + ":");
			d.display();
			d.fly();
			d.quack();
			d.swim();
		}
	}

}
