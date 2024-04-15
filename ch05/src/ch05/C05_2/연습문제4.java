package ch05.C05_2;

public class 연습문제4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int max=0;
		int[] array= {1,5,3,8,2};
		
		for(int item: array) {
			if(max<item) max=item;
		}
		
		System.out.println("max:"+max);
	}

}
