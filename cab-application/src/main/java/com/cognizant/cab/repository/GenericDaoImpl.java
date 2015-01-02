package com.cognizant.cab.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

@Repository("genericDaoImpl")
public class GenericDaoImpl<E extends IIdentityObject<?>> implements
		IDataAccessObject<E> {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void save(E entity) {
		if (entity.getId() != null) {
			getEntityManager().merge(entity);
		} else {
			getEntityManager().persist(entity);
		}
	}

	@Override
	public void delete(E entity) {
		getEntityManager().remove(entity);
	}

	@Override
	public void flush() {
		getEntityManager().flush();
	}

	protected EntityManager getEntityManager() {
		return entityManager;
	}

	protected void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

}
