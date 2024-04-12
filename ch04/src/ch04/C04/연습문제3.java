package ch04.C04;

public class 연습문제3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int result;
		int dice1, dice2;
		
		do {
			dice1=(int)(Math.random()*6+1); // Math.random은 0<=x<1;
			dice2=(int)(Math.random()*6+1);
			
			result=(int)(dice1+dice2);
			
			System.out.println("("+dice1+","+dice2+")");
			
		}while(result!=5);
	}

}
