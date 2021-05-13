package eTicaretSistemiSim�lasyon.dataAccess.abstracts;

import eTicaretSistemiSim�lasyon.entities.abstracts.Entity;

public interface MemberDao {
	boolean add(Entity member);
	void update(Entity member);
	void delete(Entity member);
}
