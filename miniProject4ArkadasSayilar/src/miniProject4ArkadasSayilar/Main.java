package miniProject4ArkadasSayilar;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number1 = 220;
		int number2 = 28;
		int total1 = 0;
		int total2 = 0;
		
		for (int i = 1; i < number1; i++) {
			if (number1 % i == 0) {
				total1 = total1 + i;
			}			
		}
		
		for (int i = 1; i < number2; i++) {
			if (number2 % i == 0) {
				total2 = total2 + i;
			}			
		}
		
		if(number1 == total2 && number2==total1) {
			System.out.println("bu iki say� arkada�t�r.");
		}else {
			System.out.println("bu iki say� arkada� de�ildir.");

		}

	}

}
