package com.cognizant.cab.service;

import com.cognizant.cab.exception.ApplicationException;
import com.cognizant.cab.request.AssociateRequest;
import com.cognizant.cab.request.CabBookRequest;
import com.cognizant.cab.request.CabRequest;
import com.cognizant.cab.request.CabSearchRequest;
import com.cognizant.cab.response.AssociateResponse;
import com.cognizant.cab.response.CabBookResponse;
import com.cognizant.cab.response.CabResponse;
import com.cognizant.cab.response.CabSearchResponse;

public interface ICabService {

	public AssociateResponse loginAssociate(AssociateRequest associateRequest)
			throws ApplicationException;

	public CabResponse addCab(CabRequest cabRequest)
			throws ApplicationException;

	public CabResponse manageCab(CabRequest cabRequest)
			throws ApplicationException;

	public AssociateResponse addAssociate(AssociateRequest associateRequest)
			throws ApplicationException;

	public AssociateResponse manageAssociate(AssociateRequest associateRequest)
			throws ApplicationException;

	public CabBookResponse bookCab(CabBookRequest bookRequest)
			throws ApplicationException;

	public CabBookResponse manageBookCab(CabBookRequest bookRequest)
			throws ApplicationException;

	public CabBookResponse retrieveBookCabDetails(CabBookRequest bookRequest)
			throws ApplicationException;

	public CabSearchResponse retrieveCabCapacity(CabSearchRequest searchRequest)
			throws ApplicationException;
}
