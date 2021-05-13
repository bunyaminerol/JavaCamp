package eTicaretSistemiSim�lasyon.core;

import eTicaretSistemiSim�lasyon.GoogleAccount.GoogleAccountManager;
import eTicaretSistemiSim�lasyon.business.concretes.MemberManager;
import eTicaretSistemiSim�lasyon.dataAccess.abstracts.MemberDao;
import eTicaretSistemiSim�lasyon.entities.abstracts.Entity;

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
			System.out.println("Sistemde kay�tl� b�yle bir google hesab� yok!");
		}
		
		
	}

}
