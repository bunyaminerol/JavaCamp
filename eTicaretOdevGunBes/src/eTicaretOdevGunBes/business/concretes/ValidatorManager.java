package eTicaretOdevGunBes.business.concretes;
import java.util.List;
import java.util.regex.*;

import eTicaretOdevGunBes.business.abstracts.ValidatorService;

public class ValidatorManager implements ValidatorService {
	public boolean validatePassword(String password) {
		if (password.length() < 6) {
			return false;
		} else {
			return true;
		}
	}

	public boolean validateEMail(String eMail) {
		String regex = "^(.+)@(.+)$";

		Pattern pattern = Pattern.compile(regex);

		Matcher matcher = pattern.matcher(eMail);
		if(matcher.matches()) {
			return true;
		}else {
			return false;
		}
	}
	
	public boolean validateNameLenght(String firstName, String lastName) {
		if(firstName.length()<2 || lastName.length()<2) {
			return false;
		}else {
			return true;
		}
	}
	
	public boolean isUsedEMail(List<String> eMailList, String searchedEMail) {
		boolean isUsed=false;
		for (String eMail : eMailList) {
			if(searchedEMail==eMail) {
				isUsed=true;
			}			
		}
		return isUsed;
	}
}
