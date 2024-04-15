package ch05.C05_3;

public class 연습문제2 {
	public static void main(String[] args) {
		LoginResult result=LoginResult.FAIL_PASSWORD;
		
		switch(result) {
		case SUCCESS:
			break;
		case FAIL_ID:
			break;
		case FAIL_PASSWORD:
			System.out.println("시벚 꽃발");
			break;
		}
	}
}
