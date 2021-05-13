package eTicaretSistemiSimülasyon.dataAccess.abstracts;

import eTicaretSistemiSimülasyon.entities.abstracts.Entity;

public interface MemberDao {
	boolean add(Entity member);
	void update(Entity member);
	void delete(Entity member);
}
