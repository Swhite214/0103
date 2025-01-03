package day0103;

public class ArrayTest04 {

	public static void main(String[] args) {
		String[] names = {"스테이크","비빔국수","빠네","곱창"};
		
		for(int i = 0; i<names.length; i++) {
			System.out.println(names[i]);
		}
		
		names[1] = "망향국수";
		System.out.println(names[1]);
		
		//향상된 for문 다른 쪽에서는 for each 문이라고 부름 아 기억났다 이거
		//for(집합의 요소를 저장할 변수하나 (보통 집합이랑 데이터타입이 맞아야겠지?):집합) {} 즉 들어가는 데이터 수만큼 반복함
		for(String element :names) {
			System.out.println(element);
		}
		
		
	}

}
