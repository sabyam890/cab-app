package com.cognizant.cab.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.cognizant.cab.common.MessageStatus;
import com.cognizant.cab.common.StringUtils;
import com.cognizant.cab.dto.CabDto;
import com.cognizant.cab.entity.Cab;
import com.cognizant.cab.exception.ApplicationException;
import com.cognizant.cab.repository.IAssociateDao;
import com.cognizant.cab.repository.ICabAssociateDao;
import com.cognizant.cab.repository.ICabDao;
import com.cognizant.cab.repository.IIdentityObject;
import com.cognizant.cab.request.AssociateRequest;
import com.cognizant.cab.request.CabBookRequest;
import com.cognizant.cab.request.CabRequest;
import com.cognizant.cab.request.CabSearchRequest;
import com.cognizant.cab.response.AssociateResponse;
import com.cognizant.cab.response.CabBookResponse;
import com.cognizant.cab.response.CabResponse;
import com.cognizant.cab.response.CabSearchResponse;

@Service
public class CabService implements ICabService {

	@Autowired
	private ICabDao cabDao;

	@Autowired
	private IAssociateDao associateDao;

	@Autowired
	private ICabAssociateDao cabAssociateDao;

	@Override
	@Transactional(propagation = Propagation.REQUIRED)
	public AssociateResponse loginAssociate(AssociateRequest associateRequest) throws ApplicationException {
		final String associateId = associateRequest.getAssociateDto().getAssociateId();
		if (StringUtils.isBlank(associateId)) {
			throw new ApplicationException("Associate Id Can't be Balnk or Null");
		}
		final boolean validAssociate = associateDao.validateAssociate(associateId);
		final AssociateResponse associateResponse = new AssociateResponse();
		if (validAssociate) {
			associateResponse.setMessage("Welcome, You are Valid User");
			associateResponse.setMessageStatus(MessageStatus.Success.getStatus());
		} else {
			associateResponse.setMessage("Sorry, You are Not Valid User");
			associateResponse.setMessageStatus(MessageStatus.Failur.getStatus());
		}
		return associateResponse;
	}

	@SuppressWarnings("unchecked")
	@Override
	@Transactional(propagation = Propagation.REQUIRED)
	public CabResponse addCab(CabRequest cabRequest) throws ApplicationException {
		final CabDto cabDto = cabRequest.getCabDto();
		if (cabDto == null) {
			throw new ApplicationException("Invalid Cab Request");
		}
		// transfer the cabdto to cab
		final Cab cab = new Cab();
		cabDao.save((IIdentityObject<Cab>) cab);
		final CabResponse cabResponse=new CabResponse();
		cabResponse.setMessageStatus(MessageStatus.Success.getStatus());
		cabResponse.setMessage("Cab Data Inserted Successfully");
		return cabResponse;
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED)
	public CabResponse manageCab(CabRequest cabRequest) throws ApplicationException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED)
	public AssociateResponse addAssociate(AssociateRequest associateRequest) throws ApplicationException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED)
	public AssociateResponse manageAssociate(AssociateRequest associateRequest) throws ApplicationException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED)
	public CabBookResponse bookCab(CabBookRequest bookRequest) throws ApplicationException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED)
	public CabBookResponse manageBookCab(CabBookRequest bookRequest) throws ApplicationException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED)
	public CabBookResponse retrieveBookCabDetails(CabBookRequest bookRequest) throws ApplicationException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED)
	public CabSearchResponse retrieveCabCapacity(CabSearchRequest searchRequest) throws ApplicationException {
		// TODO Auto-generated method stub
		return null;
	}
}
