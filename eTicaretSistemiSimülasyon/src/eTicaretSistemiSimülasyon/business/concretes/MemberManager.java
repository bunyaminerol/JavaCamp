package eTicaretSistemiSimülasyon.business.concretes;

import eTicaretSistemiSimülasyon.business.abstracts.MemberService;
import eTicaretSistemiSimülasyon.dataAccess.abstracts.MemberDao;
import eTicaretSistemiSimülasyon.entities.abstracts.Entity;

public class MemberManager implements MemberService {

	protected Entity member;
	protected MemberDao hibernateMemberDao;
	
	public MemberManager(Entity member, MemberDao hibernateMemberDao) {
		super();
		this.member = member;
		this.hibernateMemberDao = hibernateMemberDao;
	}
	
	@Override
	public void login(String mailAddress,String password) {
		// TODO Auto-generated method stub
	if(hibernateMemberDao.add(member)) {
		if(password.equals(member.getPassword()) && mailAddress.equals(member.getMailAddress())) {
			System.out.println("Kullanýcý baþarýlý bir þekilde login oldu.");
		}
		else if(!password.equals(member.getPassword()) && !mailAddress.equals(member.getMailAddress())) {
			System.out.println("Login iþlemi sýrasýnda mail adresi ve þifre yanlýþ girildi!");
		}
		else if(!password.equals(member.getPassword())){
			System.out.println("Login iþlemi sýrasýnda þifre yanlýþ girildi!");
		}
		else if(!mailAddress.equals(member.getMailAddress())){
			System.out.println("Login iþlemi sýrasýnda mail adresi yanlýþ girildi!");
		}
	}
	else {
		System.out.println("Sistemde kayýtlý böyle bir kullanýcý yok!");
	}
	
	}
	
	
	@Override
	public void changePassword(String password) {
		if(password.equals(member.getPassword())) {
			hibernateMemberDao.update(member);
		}
		
	}
	
	
	@Override
	public void changeMailAddress(String mailAddress) {
		if(mailAddress.equals(member.getMailAddress())) {
			hibernateMemberDao.update(member);
		}
		
	}
	

}


