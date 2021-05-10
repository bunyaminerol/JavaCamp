package eTicaretOdevGunBes.business.abstracts;

import eTicaretOdevGunBes.entities.concretes.User;

public interface UserService {
	void add(User user);
	void delete(User user);
}
