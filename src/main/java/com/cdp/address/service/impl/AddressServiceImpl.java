package com.cdp.address.service.impl;

import org.springframework.stereotype.Service;

import com.cdp.address.models.GetAddressDetailsResponse;
import com.cdp.address.service.AddressService;
@Service
public class AddressServiceImpl implements AddressService{

	@Override
	public GetAddressDetailsResponse getAddressDetails(int empId) {
		switch (empId) {
		case 1:
			return new GetAddressDetailsResponse("Big Street", "Sonepat", "970", "India", "131001");
		case 2:
			return new GetAddressDetailsResponse("Moon Street", "Delhi", "80", "India", "110036");
		case 3:
			return new GetAddressDetailsResponse("Bahnofstrasse", "Zurich", "15", "Switzerland", "2354");
		case 4:
			return new GetAddressDetailsResponse("Friestrasse", "Zurich", "11", "Switzerland", "2050");
		default:
			break;
		}
		return null;
	}

}
