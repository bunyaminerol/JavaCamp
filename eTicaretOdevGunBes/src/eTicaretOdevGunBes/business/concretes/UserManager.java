package eTicaretOdevGunBes.business.concretes;

import eTicaretOdevGunBes.business.abstracts.UserService;
import eTicaretOdevGunBes.dataAccess.abstracts.UserDao;
import eTicaretOdevGunBes.entities.concretes.User;
import java.util.regex.*;

public class UserManager implements UserService {

	private UserDao userDao;
	
	
	public UserManager(UserDao userDao) {
		super();
		this.userDao = userDao;
	}


	@Override
	public void register(User user) {
		System.out.println("kaydedildi " +user.getName());
		}


	@Override
	public void logIn(User user) {
		System.out.println("Giriþ yapan kullanýcý : "+user.getName());
		
	}


	@Override
	public void logout(User user) {
		System.out.println("Çýkýþ yapan kullanýcý : "+user.getName());
	}

	
	
}
