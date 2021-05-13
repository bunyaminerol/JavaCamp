package eTicaretSistemiSim�lasyon.business.concretes;

import eTicaretSistemiSim�lasyon.business.abstracts.MemberService;
import eTicaretSistemiSim�lasyon.dataAccess.abstracts.MemberDao;
import eTicaretSistemiSim�lasyon.entities.abstracts.Entity;

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
			System.out.println("Kullan�c� ba�ar�l� bir �ekilde login oldu.");
		}
		else if(!password.equals(member.getPassword()) && !mailAddress.equals(member.getMailAddress())) {
			System.out.println("Login i�lemi s�ras�nda mail adresi ve �ifre yanl�� girildi!");
		}
		else if(!password.equals(member.getPassword())){
			System.out.println("Login i�lemi s�ras�nda �ifre yanl�� girildi!");
		}
		else if(!mailAddress.equals(member.getMailAddress())){
			System.out.println("Login i�lemi s�ras�nda mail adresi yanl�� girildi!");
		}
	}
	else {
		System.out.println("Sistemde kay�tl� b�yle bir kullan�c� yok!");
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


