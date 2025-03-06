package Test;

import java.util.ArrayList;

public class Quiz7 {

	public static void main(String[] args) {
		
		ArrayList<Animal> list = new ArrayList<Animal>();
		list.add(new Human());
		list.add(new Tiger());

	}

}
class Animal{
	public void sleep() {
		
	}
	public void move() {
		
	}
}

class Human extends Animal{
	public void sleep() {
		System.out.println(" 밤에는  잠을 잡니다.");
	}
	public void move() {
		System.out.println("사람이 두 발로 걸어다닙니다.");
	}
	public void read() {
		System.out.println("사람이 책을 읽습니다.");
	}
}
class Tiger extends Animal{
	public void sleep() {
		System.out.println("밤에는 잡을 잡니다");
		
	}
	public void move() {
		System.out.println("호랑이가 네 발로 뜁니다");
		
	}
	public void hunt() {
		System.out.println(" 호랑이가 사냥을 합니다");
	}
}