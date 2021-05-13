package eTicaretOdevGunBes.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import eTicaretOdevGunBes.dataAccess.abstracts.UserDao;
import eTicaretOdevGunBes.entities.concretes.User;

public class AbcUserDao implements UserDao {

	

	@Override
	public void add(User user) {
		System.out.println("Abc ile eklenen kullanýcý : " + user.getName() +" "+ user.getLastName());
		
	}

	@Override
	public void update(User user) {
		System.out.println("Abc ile güncellenen kullanýcý "+ user.getName()+" "+user.getLastName());
	}

	@Override
	public void delete(User user) {
		System.out.println("Abc ile silinen kullanýcý "+ user.getName()+" "+user.getLastName());
		
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<String> getAllEmail() 
	{
		List<String> emailList = new ArrayList<String>();
		emailList.add("suleyman@suleyman.com");
		emailList.add("melis@simsek.com");
		return emailList;	
		
	}
}
