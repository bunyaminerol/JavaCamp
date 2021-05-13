package eTicaretSistemiSimülasyon.business.abstracts;

public interface ValidationService {
	boolean validateName(String name);
	boolean validateSurname(String surname);
	boolean validateMailAddress(String mailAddress);
	boolean validatePassword(String password);
	boolean validateIsClicked(boolean isClicked);
}
