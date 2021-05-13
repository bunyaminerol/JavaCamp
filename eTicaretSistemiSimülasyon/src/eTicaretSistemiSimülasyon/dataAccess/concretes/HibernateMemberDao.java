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
			System.out.println("Kullanýcý adý 2 karakterden fazla olmalý!");
			return false;
		}
		else if(!validationManager.validatePassword(member.getPassword())) {
			System.out.println("Kullanýcý þifresi en az 6 karakterden oluþmalý!");
			return false;
		}
		else if(!validationManager.validateSurname(member.getSurname())) {
			System.out.println("Kullanýcý soyadý 2 karakterden fazla olmalý!");
			return false;
		}
		else if(!validationManager.validateMailAddress(member.getMailAddress())) {
			System.out.println("Geçersiz mail adresi!");
			return false;
		}
		else if(validationManager.validateIsClicked(!member.isClicked())) {
			System.out.println("Kullanýcý e-posta doðrulama linkine týklamadý!");
			return false;
		}
		else {
			
			System.out.println("Veri tabanýna eklendi : "+member.getName());
			return true;
		}
		
	}
	
	@Override
	public void update(Entity member) {
		
		System.out.println("Veri tabanýnda güncellendi : "+member.getName());
	}
	
	@Override
	public void delete(Entity member) {
		
		System.out.println("Veri tabanýndan silindi : "+member.getName());
	}

}
