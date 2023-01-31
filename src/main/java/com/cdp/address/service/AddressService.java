package com.cdp.address.service;

import com.cdp.address.models.GetAddressDetailsResponse;

public interface AddressService {

	GetAddressDetailsResponse getAddressDetails(int empId);

}
