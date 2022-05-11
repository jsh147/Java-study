package cage;

public abstract class Animal {
	String name;
	String gender;
	int age;
	
	public Animal(String name, String gender, int age) {
		super();
		this.name = name;
		this.gender = gender;
		this.age = age;
	}
	public abstract void makeSomeNoise(); 
	public abstract void move();
}
