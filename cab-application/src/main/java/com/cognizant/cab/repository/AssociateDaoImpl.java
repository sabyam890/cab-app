package com.cognizant.cab.repository;

import org.springframework.stereotype.Repository;

import com.cognizant.cab.entity.Associate;

@Repository
public class AssociateDaoImpl extends GenericDaoImpl<IIdentityObject<Associate>> implements IAssociateDao{

	@Override
	public Associate findAssociateByAssociateId(String associateId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean validateAssociate(String associateId) {
		// TODO Auto-generated method stub
		return false;
	}

}
