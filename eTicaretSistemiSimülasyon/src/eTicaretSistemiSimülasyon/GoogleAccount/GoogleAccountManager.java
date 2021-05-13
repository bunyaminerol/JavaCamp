package eTicaretSistemiSimülasyon.GoogleAccount;

public class GoogleAccountManager {
	
	private String googleMailAddress = "erol@gmail.com";
	private String googlePassword = "erol1234";
	
	public void login(String mailAddress, String password) 
	{
		if(googleMailAddress != mailAddress) {
			System.out.println("Gmail adresi hatalý.");
		}
		else if(googlePassword != password) 
		{
			System.out.println("Þifre hatalý.");
		}
		else{
			System.out.println("Gmail hesabýyla giriþ baþarýlý.");
		}
	}
 	
}
