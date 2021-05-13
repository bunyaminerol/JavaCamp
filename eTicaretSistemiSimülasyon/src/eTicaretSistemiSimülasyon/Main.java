package eTicaretSistemiSimülasyon;

import eTicaretSistemiSimülasyon.business.abstracts.MemberService;
import eTicaretSistemiSimülasyon.business.abstracts.ValidationService;
import eTicaretSistemiSimülasyon.business.concretes.MemberManager;
import eTicaretSistemiSimülasyon.business.concretes.ValidationManager;
import eTicaretSistemiSimülasyon.core.GoogleAccountManagerAdapter;
import eTicaretSistemiSimülasyon.dataAccess.abstracts.MemberDao;
import eTicaretSistemiSimülasyon.dataAccess.concretes.HibernateMemberDao;
import eTicaretSistemiSimülasyon.entities.abstracts.Entity;
import eTicaretSistemiSimülasyon.entities.concretes.Member;

public class Main {

	public static void main(String[] args) {
		
		Entity memberEmre = new Member("Bünyamin Erol","Türkkan","erol1234","erol1234@gmail.com",true);
		
		ValidationService validationManager = new ValidationManager();
		MemberDao hibernateMemberDao = new HibernateMemberDao(validationManager);
		
		MemberService memberService = new MemberManager(memberEmre,hibernateMemberDao);
		
		memberService.login("erol1234@gmail.com","erol1234");
		
		System.out.println("-------------------------------");
		
		Entity memberEnes = new Member("Erol","Ahmet","erol1234","erol@gmail.com",true);
		MemberService memberServiceGoogle = new GoogleAccountManagerAdapter(memberEnes, hibernateMemberDao);
		memberServiceGoogle.login("erol@gmail.com","erol1234");
		
		
	}

}