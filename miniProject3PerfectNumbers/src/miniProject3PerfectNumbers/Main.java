package miniProject3PerfectNumbers;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 28 
		// 1 + 2 + 4 + 7 + 14 = 28
		// 28 is perfect number.
		
		
		

		int number = 28;
		int total = 0;
		//boolean isTam = false; 
		
		for (int i=1; i < number; i++) {
		
			if (number%i == 0) {
				total = total + i;
				
			}
		
		
		}
		if (total == number) {
			System.out.println("Bu m?kemmel sayidir.");
			
		}else {
			System.out.println("Bu m?kemmel sayi de?ildir.");
			
		}
		
		
		
		
		
		
	}

}
