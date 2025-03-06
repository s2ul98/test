package Test;

public class Quiz3 {
	public static void main(String[] args) {
		int i = 0;
		int sum = 0;
		
		for (int num = 0; num <= 100; num++ ){
			
			sum += num;
			i = num;
			if ( sum >= 300) {
				break;
			}
			
			
		}
		System.out.println("i : " + i);
		System.out.println("sum : " + sum);
		
		
		
	}

}
