package eTicaretOdevGunBes.business.abstracts;

import eTicaretOdevGunBes.entities.concretes.User;

public interface MailControlService {
	void checkMail(String message, User user);
}
