package C02;

import java.util.Scanner;

public class C02_확인문제3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("이름:");
		String name=sc.nextLine();
		
		System.out.print("주민번호 앞 6자리:");
		String num=sc.nextLine();
		
		System.out.print("전화번호:");
		String tel=sc.nextLine();
		
		System.out.println("[입력한 내용]");
		System.out.println(name);
		System.out.println(num);
		System.out.println(tel);
	}
}
