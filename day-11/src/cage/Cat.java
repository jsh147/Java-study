package cage;

public class Cat extends Animal implements Mammalia{

	public Cat(String name, String gender, int age) {
		super(name, gender, age);
	}
	@Override
	public void makeSomeNoise() {
		System.out.println("야옹");
	}
	@Override
	public void move() {
		System.out.println("사뿐사뿐");
	}
}
