package day0103;

public class ArrayTest02 {

	public static void main(String[] args) {
		// 실수형 변수 여러개....배열
		
		double arr[] = new double[5]; //자료형 이름 [] = new 자료형[갯수] new쓰는순간 힙에 할당하겟다는뜻
		double ar2[], ar3; // ar2는 배열 ar3는 배열아님
		double[] ar4,ar5; //이건 둘다 배열임 arr[0] 이건그냥 heap에 저장되있는 값을 가져오라는 뜻임
		arr[0] = 1.0;
		
		System.out.println("arr[0]=" + arr[0]); //이거 설정안하면 디폴트값으로 저장됨 heap특징
		System.out.println("arr[1]=" + arr[1]);
		
		int i;
		
		for(i=0;i<5;i++) {
			System.out.println("arr["+i+ "]="+arr[i]);
		}
	}

} 
