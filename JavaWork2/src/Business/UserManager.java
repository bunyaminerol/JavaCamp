package Business;

import Properties.User;

public class UserManager extends PersonManager {
	
	public void beStudent(User user) {
		System.out.println("Say�n " + user.firstName + " bey, ��renci olarak veritaban�na kaydedildiniz.");
	}

	

}
