package ch04.C04;

import java.util.Scanner;

public class 연습문제7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean run=true;
		int balance=0;
		int choice=0;
		
		Scanner sc=new Scanner(System.in);
		
		while(run) {
			System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
			System.out.println("1.예금 | 2. 출금 | 3.잔고 | 4.종료");
			System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
			System.out.println("선택> ");
			
			choice=sc.nextInt();
			
			switch(choice) {
			case 1:
				System.out.print("예금액>");
				balance+=sc.nextInt();
				break;
			case 2:
				System.out.print("출금액>");
				balance-=sc.nextInt();
				break;
			case 3:
				System.out.println("잔고>"+balance);
				break;
			case 4:
				run=false;
				break;
			}
		}
		System.out.println("프로그램 종료");
	}

}
