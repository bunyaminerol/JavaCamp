package eTicaretSistemiSim�lasyon.dataAccess.concretes;

import eTicaretSistemiSim�lasyon.business.abstracts.ValidationService;
import eTicaretSistemiSim�lasyon.dataAccess.abstracts.MemberDao;
import eTicaretSistemiSim�lasyon.entities.abstracts.Entity;

public class HibernateMemberDao implements MemberDao{
	
	ValidationService validationManager;
	
	public HibernateMemberDao(ValidationService validationManager) {
		super();
		this.validationManager = validationManager;
	}
	
	@Override
	public boolean add(Entity member) {
		
		if(!validationManager.validateName(member.getName())) {
			System.out.println("Kullan�c� ad� 2 karakterden fazla olmal�!");
			return false;
		}
		else if(!validationManager.validatePassword(member.getPassword())) {
			System.out.println("Kullan�c� �ifresi en az 6 karakterden olu�mal�!");
			return false;
		}
		else if(!validationManager.validateSurname(member.getSurname())) {
			System.out.println("Kullan�c� soyad� 2 karakterden fazla olmal�!");
			return false;
		}
		else if(!validationManager.validateMailAddress(member.getMailAddress())) {
			System.out.println("Ge�ersiz mail adresi!");
			return false;
		}
		else if(validationManager.validateIsClicked(!member.isClicked())) {
			System.out.println("Kullan�c� e-posta do�rulama linkine t�klamad�!");
			return false;
		}
		else {
			
			System.out.println("Veri taban�na eklendi : "+member.getName());
			return true;
		}
		
	}
	
	@Override
	public void update(Entity member) {
		
		System.out.println("Veri taban�nda g�ncellendi : "+member.getName());
	}
	
	@Override
	public void delete(Entity member) {
		
		System.out.println("Veri taban�ndan silindi : "+member.getName());
	}

}
