package com.cognizant.cab.repository;


public interface IDataAccessObject<E extends IIdentityObject<?>> {

	void save(E entity);

	void delete(E entity);

	void flush();

}
