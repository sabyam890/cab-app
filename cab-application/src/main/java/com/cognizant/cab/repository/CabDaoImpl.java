package com.cognizant.cab.repository;

import org.springframework.stereotype.Repository;

import com.cognizant.cab.entity.Cab;

@Repository
public class CabDaoImpl extends GenericDaoImpl<IIdentityObject<Cab>> implements ICabDao{

	@Override
	public Cab findCabByCabNumber(String cabNumber) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}