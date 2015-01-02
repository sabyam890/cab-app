package com.cognizant.cab.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.cab.exception.ApplicationException;
import com.cognizant.cab.request.AssociateRequest;
import com.cognizant.cab.request.CabBookRequest;
import com.cognizant.cab.request.CabRequest;
import com.cognizant.cab.request.CabSearchRequest;
import com.cognizant.cab.response.AssociateResponse;
import com.cognizant.cab.response.CabBookResponse;
import com.cognizant.cab.response.CabResponse;
import com.cognizant.cab.response.CabSearchResponse;
import com.cognizant.cab.service.ICabService;

@RestController
@RequestMapping("/system/cognizant")
public class Controller {

	@Autowired
	private ICabService cabService;

	@RequestMapping(value = "/login/associate", method = RequestMethod.POST)
	public AssociateResponse loginAssociate(
			@RequestBody AssociateRequest associateRequest) {
		AssociateResponse associateResponse = null;
		try {
			associateResponse = cabService.loginAssociate(associateRequest);
		} catch (ApplicationException exception) {
		}
		return associateResponse;
	}

	@RequestMapping(value = "/add/cab", method = RequestMethod.POST)
	public CabResponse addCab(@RequestBody CabRequest cabRequest) {
		CabResponse cabResponse = null;
		try {
			cabResponse = cabService.addCab(cabRequest);
		} catch (ApplicationException exception) {
		}
		return cabResponse;
	}

	@RequestMapping(value = "/manage/cab", method = RequestMethod.POST)
	public CabResponse manageCab(@RequestBody CabRequest cabRequest) {
		CabResponse cabResponse = null;
		try {
			cabResponse = cabService.manageCab(cabRequest);
		} catch (ApplicationException exception) {
		}
		return cabResponse;
	}

	@RequestMapping(value = "/add/associate", method = RequestMethod.POST)
	public AssociateResponse addAssociate(
			@RequestBody AssociateRequest associateRequest) {
		AssociateResponse associateResponse = null;
		try {
			associateResponse = cabService.addAssociate(associateRequest);
		} catch (ApplicationException e) {
			e.printStackTrace();
		}
		return associateResponse;
	}

	@RequestMapping(value = "/manage/associate", method = RequestMethod.POST)
	public AssociateResponse manageAssociate(
			@RequestBody AssociateRequest associateRequest) {
		AssociateResponse associateResponse = null;
		try {
			associateResponse = cabService.manageAssociate(associateRequest);
		} catch (ApplicationException exception) {
		}
		return associateResponse;
	}

	@RequestMapping(value = "/book/cab", method = RequestMethod.POST)
	public CabBookResponse bookCab(@RequestBody CabBookRequest bookRequest) {
		CabBookResponse cabBookResponse = null;
		try {
			cabBookResponse = cabService.bookCab(bookRequest);
		} catch (ApplicationException exception) {
		}
		return cabBookResponse;
	}

	@RequestMapping(value = "/manage/book/cab", method = RequestMethod.POST)
	public CabBookResponse manageBookCab(@RequestBody CabBookRequest bookRequest) {
		CabBookResponse cabBookResponse = null;
		try {
			cabBookResponse = cabService.manageBookCab(bookRequest);
		} catch (ApplicationException exception) {
		}
		return cabBookResponse;
	}

	@RequestMapping(value = "/retrieve/book/cab", method = RequestMethod.POST)
	public CabBookResponse retrieveBookCabDetails(
			@RequestBody CabBookRequest bookRequest) {
		CabBookResponse cabBookResponse = null;
		try {
			cabBookResponse = cabService.retrieveBookCabDetails(bookRequest);
		} catch (ApplicationException exception) {
		}
		return cabBookResponse;
	}

	@RequestMapping(value = "/retrieve/cab/capacity", method = RequestMethod.POST)
	public CabSearchResponse retrieveCabCapacity(
			@RequestBody CabSearchRequest searchRequest) {
		CabSearchResponse cabSearchResponse = null;
		try {
			cabSearchResponse = cabService.retrieveCabCapacity(searchRequest);
		} catch (ApplicationException exception) {
		}
		return cabSearchResponse;
	}
}
