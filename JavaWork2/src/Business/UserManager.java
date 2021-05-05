package Business;

import Properties.User;

public class UserManager extends PersonManager {
	
	public void beStudent(User user) {
		System.out.println("Sayın " + user.firstName + " bey, öğrenci olarak veritabanına kaydedildiniz.");
	}

	

}
