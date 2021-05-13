package eTicaretOdevGunBes;

import eTicaretOdevGunBes.business.abstracts.UserService;
import eTicaretOdevGunBes.business.concretes.UserManager;
import eTicaretOdevGunBes.business.concretes.ValidatorManager;
import eTicaretOdevGunBes.core.concretes.GoogleLoginManagerAdapter;
import eTicaretOdevGunBes.dataAccess.concretes.AbcUserDao;
import eTicaretOdevGunBes.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		
		
		
		User user1 = new User();
		user1.setName("Erol");
		user1.setLastName("Türkkan");
		user1.setEmail("erol@gmail.com");
		user1.setPassword("123456");
		
		UserService userService = new UserManager(new AbcUserDao(), new GoogleLoginManagerAdapter(), new ValidatorManager()); 
		userService.register(user1);
		userService.logIn(user1);
		
		
	}

}
