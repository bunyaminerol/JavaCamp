package eTicaretSistemiSimülasyon.dataAccess.concretes;

import eTicaretSistemiSimülasyon.business.abstracts.ValidationService;
import eTicaretSistemiSimülasyon.dataAccess.abstracts.MemberDao;
import eTicaretSistemiSimülasyon.entities.abstracts.Entity;

public class HibernateMemberDao implements MemberDao{
	
	ValidationService validationManager;
	
	public HibernateMemberDao(ValidationService validationManager) {
		super();
		this.validationManager = validationManager;
	}
	
	@Override
	public boolean add(Entity member) {
		
		if(!validationManager.validateName(member.getName())) {
			System.out.println("Kullanıcı adı 2 karakterden fazla olmalı!");
			return false;
		}
		else if(!validationManager.validatePassword(member.getPassword())) {
			System.out.println("Kullanıcı şifresi en az 6 karakterden oluşmalı!");
			return false;
		}
		else if(!validationManager.validateSurname(member.getSurname())) {
			System.out.println("Kullanıcı soyadı 2 karakterden fazla olmalı!");
			return false;
		}
		else if(!validationManager.validateMailAddress(member.getMailAddress())) {
			System.out.println("Geçersiz mail adresi!");
			return false;
		}
		else if(validationManager.validateIsClicked(!member.isClicked())) {
			System.out.println("Kullanıcı e-posta doğrulama linkine tıklamadı!");
			return false;
		}
		else {
			
			System.out.println("Veri tabanına eklendi : "+member.getName());
			return true;
		}
		
	}
	
	@Override
	public void update(Entity member) {
		
		System.out.println("Veri tabanında güncellendi : "+member.getName());
	}
	
	@Override
	public void delete(Entity member) {
		
		System.out.println("Veri tabanından silindi : "+member.getName());
	}

}
