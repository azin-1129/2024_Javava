package ch05.C05_2;

import java.util.Scanner;

public class 연습문제6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean run=true;
		int studentNum=0;
		int[] scores=null;
		int max=0;
		int sum=0;
		
		Scanner sc=new Scanner(System.in);
		
		while(run) {
			System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
			System.out.println("1. 학생수|2. 점수입력|3. 점수리스트|4. 분석|5. 종료");
			System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
			System.out.print("선택>");
			
			int selectNo=sc.nextInt();
			
			switch(selectNo) {
			case 1:
				System.out.print("학생 수>");
				studentNum=sc.nextInt();
				
				scores=new int[studentNum];
				
				break;
			case 2:
				sum=0;
				max=0;
				
				for(int i=0;i<scores.length;i++) {
					System.out.print("scores["+i+"]>");
					scores[i]=sc.nextInt();
					sum+=scores[i];
				}
				break;
			case 3:
				for(int i=0;i<scores.length;i++) {
					System.out.println("scores["+i+"]> "+scores[i]);
				}
				break;
			case 4:
				for(int item:scores) {
					if(max<item) max=item;
				}
				System.out.println("최고 점수: "+max);
				
				System.out.println("평균 점수: "+(double)sum/studentNum);
				break;
			case 5:
				System.out.println("프로그램을 종료합니다.");
				run=false;
				break;
			}
		}
	}
}
