package eTicaretSistemiSimülasyon.business.concretes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import eTicaretSistemiSimülasyon.business.abstracts.ValidationService;

public class ValidationManager implements ValidationService {

	
	@Override
	public boolean validateName(String name) {
		
		if(name.length()<2) {
			return false;
		}else {
			return true;
		}
	}

	@Override
	public boolean validateSurname(String surname) {
		if(surname.length()<2) {
			return false;
		}else {
			return true;
		}
	}

	@Override
	public boolean validateMailAddress(String mailAddress) {
		String emailRegex = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$";
		Pattern emailPath = Pattern.compile(emailRegex,Pattern.CASE_INSENSITIVE);
		Matcher matcher = emailPath.matcher(mailAddress);
		return matcher.find();
	}

	@Override
	public boolean validatePassword(String password) {
		if(password.length()<6) {
			return false;
		}
		else {
			return true;
		}
	}

	@Override
	public boolean validateIsClicked(boolean isClicked) {
		return isClicked;
	}

}
