package cage;

public class Dog extends Animal implements Mammalia{

	public Dog(String name, String gender, int age) {
		super(name, gender, age);
	}
	@Override
	public void makeSomeNoise() {
		System.out.println("멍멍");
	}
	@Override
	public void move() {
		System.out.println("투벅투벅");
	}	
}
