package eTicaretOdevGunBes.business.abstracts;

import eTicaretOdevGunBes.entities.concretes.User;

public interface UserService {
	void register(User user);
	void logIn(User user);
	void logout(User user);
}
