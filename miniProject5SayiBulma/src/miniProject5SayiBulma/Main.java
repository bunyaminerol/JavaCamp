package miniProject5SayiBulma;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] sayilar = new int[]{
			1,2,5,7,9,0
		};
		int aranacak = 3;
		
		//boolean varMi = false;
		
		for(int sayi : sayilar) {
			if(sayi == aranacak) {
				//varMi = true;
				System.out.println("Sayi mevcuttur.");
				break;
			}else {
				System.out.println("Sayi mevcut deðildir.");
				break;

			}
		}
		
	}

}
