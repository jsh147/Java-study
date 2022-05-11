package cage;

public class Chameleon extends Animal implements Reptile{

	public Chameleon(String name, String gender, int age) {
		super(name, gender, age);
	}
	@Override
	public void makeSomeNoise() {
		System.out.println("캬악");
	}
	@Override
	public void move() {
		System.out.println("유리창에 찹찹 붙어다닌다");
	}
}
