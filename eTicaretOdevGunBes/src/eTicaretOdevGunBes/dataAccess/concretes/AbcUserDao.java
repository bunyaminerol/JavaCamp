package eTicaretOdevGunBes.dataAccess.concretes;

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
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
