package zoo;

//import cage.Animal;
//import cage.Cat;
//import cage.Dog;
//import cage.Mouse;
import cage.*;

public class Ground {
	public static void main(String[] args) {
		// 포유류 두마리 파충류 하남리 조류 한마리 만들어서
		// 울게하고 움직이게 하고 날게하고	
		// 각 동물들은 필수로 makeSomeNoise(), move()가 있어야함
		// 둥물 클래스들은 전부 cage 패키지에 선언
		Animal[] arAnimal = {
			new Dog("현식이","수컷",7),
			new Cat("땅땅이","암컷",4),
			new Chameleon("카멜","암컷",8),
			new Ostrich("또치", "수컷", 2)
		};
			
		for (int i = 0; i < arAnimal.length; i++) {
			if(arAnimal[i] instanceof Mammalia) {
				arAnimal[i].makeSomeNoise();
			}else if(arAnimal[i] instanceof Ostrich) {
				((Birds)arAnimal[i]).fly();
			}else if(arAnimal[i] instanceof Reptile) {
				arAnimal[i].move();
			}else {
				System.out.println("동물들이 멀뚱멀뚱 쳐다본다");
			}
			
		}
	}
}
