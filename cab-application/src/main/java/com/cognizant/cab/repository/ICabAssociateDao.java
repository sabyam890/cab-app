package com.cognizant.cab.repository;

import java.util.List;

import com.cognizant.cab.entity.CabAssociate;

public interface ICabAssociateDao extends IDataAccessObject<IIdentityObject<CabAssociate>>{

	public List<CabAssociate> getCabAssociateAssoc(String CabNumber, String currentDate,String cabTime);
	
	public int getCabCapacity(String currentDate,String cabTime);
}
