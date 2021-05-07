package Validation;

import entities.Gamer;

public class UserValidationManager implements UserValidationService{

	@Override
	public boolean validate(Gamer gamer) {
		if(gamer.getBirthDay()==2002 && gamer.getFirstName()=="Bünyamin" &&
				gamer.getLastName()=="Türkkan"&&gamer.getIdentityNumber()==1111111111)
		{
			return true;
		}
		else {
			return false;
		}
		
	}

}
