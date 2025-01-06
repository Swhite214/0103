package ppractice;

public class PracticeClass02 {
	long num;
	String id;
	String day;
	String name;
	String pockenumber;
	String address;
	
	void setNum(long num) {
		this.num = num;
	}
	void setId(String id) {
		this.id = id;
	}
	void setDay(String day) {
		this.day = day;
	}
	void setName(String name) {
		this.name = name;
	}
	void setPockenumber(String pockenumber) {
		this.pockenumber = pockenumber;
	}
	void setAddress(String address) {
		this.address = address;
	}
	
	void print() {
		System.out.println("주문번호 : "+ this.num);
		System.out.println("주문자 아이디 : "+ this.id);
		System.out.println("주문날짜 : "+ this.day);
		System.out.println("주문자 이름 : "+ this.name);
		System.out.println("주문 상품 번호 : "+ this.pockenumber);
		System.out.println("배송주소 : "+ this.address);
	}
}
