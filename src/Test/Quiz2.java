package Test;

public class Quiz2 {

	public static void main(String[] args) {

		int a = 7;
		
		if (a >= 3 &&  a <=5 ) {
			System.out.println("현재 계절은 봄입니다.");
		}  if ( a >= 6 && a<=8) {
			System.out.println("현재 계절은 여름입니다.");
		} if (a >= 9 && a<= 11 ) {
			System.out.println("현재 계절은 가을입니다.");
		} if (a <=2 || a == 12) {
			System.out.println("현재 계절은 겨울입니다");
		}
	}

}
