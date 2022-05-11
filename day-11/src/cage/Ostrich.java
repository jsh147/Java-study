package cage;

public class Ostrich extends Animal implements Birds{

	public Ostrich(String name, String gender, int age) {
		super(name, gender, age);
	}

	@Override
	public void makeSomeNoise() {
		
	}

	@Override
	public void move() {
		
	}
	public void fly() {
		System.out.println("날려고 허우적 거린다");
	}
}
