package eTicaretOdevGunBes.core.concretes;

import eTicaretOdevGunBes.Google.GoogleLogInManager;
import eTicaretOdevGunBes.core.abstracts.LogInService;

public class GoogleLoginManagerAdapter implements LogInService {

	@Override
	public void login(String email, String password) {
		GoogleLogInManager googleLoginManager = new GoogleLogInManager();
		googleLoginManager.logInToGoogle(email, password);
		
	}

}