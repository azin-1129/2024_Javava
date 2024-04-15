package ch05.C05_2;

public class 연습문제5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] array= {
				{95,86},
				{83,92,96},
				{78,83,93,87,88}
		};
		
		int sum=0;
		double avg=0.0;
		
		int arrLength=0;
		
		for(int[] arr: array) {
			arrLength+=arr.length;
			for(int item: arr) {
				sum+=item;
			}
		}
		
		avg=(double)sum/arrLength;
		
		System.out.println("sum:"+sum+", avg:"+avg);
	}

}
