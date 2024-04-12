package C03;

import java.util.Scanner;

public class C03_확인문제11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
				
		System.out.print("아이디:");
		String name=sc.nextLine();
		
		System.out.print("비번:");
		int password=Integer.parseInt(sc.nextLine());
		
		if(name.equals("java")) {
			if(password==12345) {
				System.out.println("로그인 성공");
			}else {
				System.out.println("비번 틀림");
			}
		}else {
			System.out.println("아이디가 존재하지 않습니다.");
		}
	}

}
