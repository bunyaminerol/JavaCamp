package eTicaretSistemiSim�lasyon.GoogleAccount;

public class GoogleAccountManager {
	
	private String googleMailAddress = "erol@gmail.com";
	private String googlePassword = "erol1234";
	
	public void login(String mailAddress, String password) 
	{
		if(googleMailAddress != mailAddress) {
			System.out.println("Gmail adresi hatal�.");
		}
		else if(googlePassword != password) 
		{
			System.out.println("�ifre hatal�.");
		}
		else{
			System.out.println("Gmail hesab�yla giri� ba�ar�l�.");
		}
	}
 	
}
