package day0103;

public class ArrayTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//배열이란 동일한 데이터타입의 집합구조, 메모리상에서 순차적으로 할당된다(이게 인덱스)인덱스 0부터시작
		int a,b,c,d; //메서드 안에서 선언된 변수는 지역변수 선언과 즉시 할당 괄호 끝나면 소멸(파라미터 변수도 동일)
		int n1,n2,n3; //백개 200개면 양이 너무많아짐 즉 한꺼번에 만들고 관리할수있는게 필요
		//C언어는 int num[3]; 이렇게만 만들어도 stack할당이라 괜찮지만 자바는 안됨
		//1. 배열변수 선언 = new 메모리공간 할당----------------------
		//자료형[] 배열 이름 = new 자료형[개수];                    -
		//자료형 배열이름 [] = new 자료형[개수];					 -
		int[] arr1 = new int[6]; //int타입 배열 변수 배열이름		 -
		//new 키워드로 heap 메모리 공간에 할당-----------------------
		//배열 변수는 지역변수이자 힙 메모리공간을 참조하는 참조변수 레퍼런스 타입
		//배열은 할당된 메모리공간에 접근하기위한 변수이름을 자동으로 만들어줌
		//배열변수 이름[인덱스번호] 이거 0번부터 시작
		//arr[0] 이게 arr배열의 첫번째 값임
		//배열안에 값이 없어도 default로 할당되는 값이 있음
		//arr은 지역변수(stack할당)이자 참조변수(heap실제값) stack에 할당되지만 실제값은 heap에 있음
		System.out.println("arr[0]="+arr1[0]);
		System.out.println("arr[2]="+arr1[2]);
		System.out.println("arr[5]="+arr1[5]); //마지막
		
		//배열의 길이: 배열변수.length
		System.out.println("배열의 개수"+arr1.length); //배열의 갯수
	
	
	}

}
