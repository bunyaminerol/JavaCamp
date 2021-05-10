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
	public void add(User user) {
		
		String mail = user.getEmail();
		Pattern pattern = Pattern.compile("@");
		Matcher matcher = pattern.matcher(mail);
		
		if (user.getPassword().length()<6) {
			System.out.println("Girdi�iniz parola 6 karakterden azd�r,"
					+ " l�tfen en az 6 karakter giriniz.");
			}else if(user.getName().isEmpty()) {
				System.out.println("L�tfen Ad giriniz.");
			}else if(matcher.find()==false) {
				System.out.println("Ge�erli bir Email giriniz.");
			}else if(user.getLastName().isEmpty()) {
				System.out.println("L�tfen Soyad giriniz.");
			}else if(user.getEmail().isEmpty()) {
				System.out.println("L�tfen Email giriniz.");
			}else if(user.getName().length()<2 || user.getLastName().length()<2) {
				System.out.println("Ad ve Soyad�n�z 2 karakterden az olamaz.");
			}
			else {
				this.userDao.add(user);
			}
		
		
	}

	@Override
	public void delete(User user) {
		// TODO Auto-generated method stub
		
	}
	
	
}
