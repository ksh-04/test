package person;

public class Person {
	//1. 필드
	String	name;
	String	job;
	int		age;
	boolean	gender; //true : female, false : male
	String	blood;
	
	//2. 메소드
	void eatFood() {
		System.out.println("식사를 한다.");
	}
	void goToBed() {
		System.out.println("잠을 잔다");
	}
	void speak() {
		System.out.println("말한다.");
	}
	void walk() {
		System.out.println("걷는다.");
	}

}
