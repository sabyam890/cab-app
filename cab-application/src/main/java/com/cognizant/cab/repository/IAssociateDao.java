package com.cognizant.cab.repository;

import com.cognizant.cab.entity.Associate;

public interface IAssociateDao extends IDataAccessObject<IIdentityObject<Associate>>{
	
	public Associate findAssociateByAssociateId(String associateId);
	
	public boolean validateAssociate(String associateId);
}
