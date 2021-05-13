package eTicaretSistemiSimülasyon.core;

import eTicaretSistemiSimülasyon.GoogleAccount.GoogleAccountManager;
import eTicaretSistemiSimülasyon.business.concretes.MemberManager;
import eTicaretSistemiSimülasyon.dataAccess.abstracts.MemberDao;
import eTicaretSistemiSimülasyon.entities.abstracts.Entity;

public class GoogleAccountManagerAdapter extends MemberManager {
	
	GoogleAccountManager googleAccountManager = new GoogleAccountManager();
	
	public GoogleAccountManagerAdapter(Entity member, MemberDao hibernateMemberDao) {
		super(member, hibernateMemberDao);
		
	}
	
	@Override
	public void login(String mailAddress, String password) {
		// TODO Auto-generated method stub
		
		if(hibernateMemberDao.add(member)) {
			googleAccountManager.login(mailAddress, password);
		}
		else {
			System.out.println("Sistemde kayýtlý böyle bir google hesabý yok!");
		}
		
		
	}

}
