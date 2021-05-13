package eTicaretSistemiSimülasyon.business.abstracts;

public interface MemberService {
	void login(String password,String mailAddress);
	void changePassword(String password);
	void changeMailAddress(String mailAddress);
}
