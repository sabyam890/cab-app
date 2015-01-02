package com.cognizant.cab.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.cognizant.cab.entity.CabAssociate;

@Repository
public class CabAssociateImpl extends GenericDaoImpl<IIdentityObject<CabAssociate>>implements ICabAssociateDao{

	@Override
	public List<CabAssociate> getCabAssociateAssoc(String CabNumber, String currentDate,String cabTime) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getCabCapacity(String currentDate, String cabTime) {
		// TODO Auto-generated method stub
		return 0;
	}

	
}
