package ppractice;

public class PracticeClass {
	int age;
	String name;
	boolean isMarried;
	int baby;
	
	void setName(String name) {
		this.name = name;
	}
	void setAge(int age) {
		this.age = age;
	}
	void setIsMarried(boolean isMarried) {
		this.isMarried = isMarried;
	}
	void setBaby(int baby) {
		this.baby = baby;
	}
	void print() {
		System.out.println("나이는"+ age +"입니다.");
		System.out.println("이름은"+ name +"입니다.");
		System.out.println("결혼은"+ isMarried +"입니다.");
		System.out.println("자녀는"+ baby +"입니다.");
	}

}
