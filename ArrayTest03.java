package day0103;

public class ArrayTest03 {
	
	public static void main(String []args) {
		
		String[] strs = new String [3];
		System.out.println(strs[0]); //참조형 변수의 디폴트값은 null string은 참조형임 null: 아직 참조하지않은값
		int[] arr = new int[5]; // int [] arr; 이상태는 아직 변수만 선언했고 메모리 할당안한상태임
		int[] arr13 = null; //null로 초기화 가능 참조형 변수는 null초기화
		
		System.out.println(arr);
		int[] arr2 = new int [] {1,2,3}; //이런식으로 값을 넣을수있음 배열도 할당과 동시 초기화 선언 저[안에 숫자쓰면 대신오류임]
		int[] arr3 = {10,20,30}; //이것도 가능 단 선언과 동시에만 가능 보통 이렇게함
		
		int[] arr4;
		//arr4 = {10,20,30}; 이건불가능
		//arr4 = new int[] {10,20,30}; 이건 가능
		strs[0]="가";
		
	}
}
