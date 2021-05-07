package business;

import Validation.UserValidationService;
import abstracts.GamerService;
import entities.Gamer;

public class GamerManager implements GamerService{

	private UserValidationService userValidationService;

	public GamerManager(UserValidationService userValidationService) {
		super();
		this.userValidationService = userValidationService;
	}
	@Override										
	public void add(Gamer gamer) {
		if(userValidationService.validate(gamer))
		{
			System.out.println("Oyuncu Eklendi: "+gamer.getFirstName());
		}
		else
		{
			System.out.println("Hatalý giriþ yapýldý.");  
		}
		
	}

	@Override
	public void update(Gamer gamer) {
		System.out.println("Oyuncu Güncellendi: "+gamer.getFirstName());
		
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println("Oyuncu silindi:"+ gamer.getFirstName());
		
	}

}
