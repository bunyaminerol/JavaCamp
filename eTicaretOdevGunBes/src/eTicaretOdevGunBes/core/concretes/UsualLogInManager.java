package eTicaretOdevGunBes.core.concretes;

import eTicaretOdevGunBes.core.abstracts.LogInService;

public class UsualLogInManager implements LogInService {

	@Override
	public void login(String email, String password) {
		System.out.println("Sisteme login olundu:" + email);
	}

}
