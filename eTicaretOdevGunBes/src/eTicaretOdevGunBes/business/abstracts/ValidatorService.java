package eTicaretOdevGunBes.business.abstracts;

import java.util.List;

public interface ValidatorService {

	 boolean validatePassword(String password);
	 boolean validateEMail(String eMail);
	 boolean validateNameLenght(String firstName, String lastName);
	 boolean isUsedEMail(List<String> eMailList, String searchedEMail);
}
