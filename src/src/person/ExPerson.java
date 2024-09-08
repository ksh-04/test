package person;

public class ExPerson {

	public static void main(String[] args) {
		Person hwang = new Person();
		hwang.name	= "황수연";
		hwang.job	= "컴퓨터 과학 전공 학생";
		hwang.age	= 20;
		hwang.gender	= true;
		hwang.blood = "A";
    test;
		
		System.out.println(hwang.name + "은 " + hwang.job + "이고 " + hwang.age + "살이며, ");
		if (hwang.gender)	System.out.println("여성이면서 ");
		else				System.out.println("남성이면서 ");
		System.out.println("혈액형은 " + hwang.blood + "형입니다.\n");
		
		Person kang = new Person();
		kang.name	= "강선화";
		kang.job	= "컴퓨터공학 전공 학생";
		kang.age	= 21;
		kang.gender	= true;
		kang.blood = "A";
		
		System.out.println(kang.name + "은 " + kang.job + "이고 " + kang.age + "살이며, ");
		if (kang.gender)	System.out.println("여성이면서 ");
		else				System.out.println("남성이면서 ");
		System.out.println("혈액형은 " + kang.blood + "형입니다.\n");
	}

}
