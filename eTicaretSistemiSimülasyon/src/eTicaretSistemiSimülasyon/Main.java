package eTicaretSistemiSim�lasyon;

import eTicaretSistemiSim�lasyon.business.abstracts.MemberService;
import eTicaretSistemiSim�lasyon.business.abstracts.ValidationService;
import eTicaretSistemiSim�lasyon.business.concretes.MemberManager;
import eTicaretSistemiSim�lasyon.business.concretes.ValidationManager;
import eTicaretSistemiSim�lasyon.core.GoogleAccountManagerAdapter;
import eTicaretSistemiSim�lasyon.dataAccess.abstracts.MemberDao;
import eTicaretSistemiSim�lasyon.dataAccess.concretes.HibernateMemberDao;
import eTicaretSistemiSim�lasyon.entities.abstracts.Entity;
import eTicaretSistemiSim�lasyon.entities.concretes.Member;

public class Main {

	public static void main(String[] args) {
		
		Entity memberEmre = new Member("B�nyamin Erol","T�rkkan","erol1234","erol1234@gmail.com",true);
		
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