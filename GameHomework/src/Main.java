import Validation.UserValidationManager;
import business.CampaignManager;
import business.GameManager;
import business.GamerManager;
import business.SalesManager;
import entities.Campaign;
import entities.Game;
import entities.Gamer;

public class Main {

	public static void main(String[] args) {
		GamerManager gamerManager =new GamerManager(new UserValidationManager());
		
		Gamer gamer=new Gamer(1,"Bünyamin","Türkkan",2002,1111111111) ;
				
		gamerManager.add(gamer); 
		
		
		Game game1=new Game(1,"Left Dead",25);
		
				
		GameManager gameManager=new GameManager();
		gameManager.add(game1);
		
		Campaign campaign1=new Campaign(1,"Hallowen",40);
		
		CampaignManager campaignManager=new CampaignManager(); 
		campaignManager.discount(campaign1, game1);
		
		SalesManager salesManager = new SalesManager();
		salesManager.buyGame(gamer, game1); 
		
		
		
		
	} 

}