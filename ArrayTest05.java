package day0103;
import java.util.Arrays;

public class ArrayTest05 {

	public static void main(String[] args) {
		// 배열기능을 모아놓은 클래스 제공
		int[] arr = {4,3,12,3};//거의 유일하게 {}뒤에 ;찍음
		for(int a : arr) {
			System.out.println(a);
		}
		System.out.println("----");
	
	
		Arrays.sort(arr);
		for(int a : arr) {
			System.out.println(a);
		}
	}
		
}
