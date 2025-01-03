package day0103;

public class Array2Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			//다차원 배열
			//2차원 배열 : 구성요소 ->1차원배열 : 1차원배열의 집합
			//배열 이름[인덱스번호] : 0~
		//구성요소인 1차원 배열에 접근하는 변수
		int [] [] arr = new int[2][3]; //지역변수이자 참조변수
		int [] [] arr213=new int [] [] {{1,4,5},{2,4,5,}};//[][]안에 숫자넣으면 안됨 최초 할당시에만 사용가능함
		int [] [] [] arr1; //3차원
		int [] [] [] [] arr2; //4차원
		
		int [] ar2 []; //이거 2차원임 
		//모르겠다 이건 ㅋㅋ

		System.out.println(arr213.length);
		//arr213[0]={1,4,5}
		//arr213[1]={2,4,5}
		for (int i =0; i < arr213[0].length; i++) {
			System.out.print(arr213[0][i]+ " ");
		}
		System.out.println();
		
		for (int i = 0; i < arr213[1].length; i++) {
			System.out.print(arr213[1][i]+ "");
		}
		System.out.println();
	}
	

}
