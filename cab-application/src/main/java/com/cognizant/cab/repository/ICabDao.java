package com.cognizant.cab.repository;

import com.cognizant.cab.entity.Cab;

public interface ICabDao extends IDataAccessObject<IIdentityObject<Cab>>{
	
	public Cab findCabByCabNumber(String cabNumber);
}
