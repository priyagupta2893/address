package com.cdp.address.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cdp.address.models.GetAddressDetailsRequest;
import com.cdp.address.models.GetAddressDetailsResponse;
import com.cdp.address.service.AddressService;

@RestController
@RequestMapping("/address")
public class AddressController {
	
	@Autowired
	AddressService service;
	
	@PostMapping(value="/addressDetails", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<GetAddressDetailsResponse> getAddressDetails(@RequestBody GetAddressDetailsRequest request) {
		GetAddressDetailsResponse department = service.getAddressDetails(request.getEmpId());
		return new ResponseEntity<GetAddressDetailsResponse>(department, HttpStatus.OK) ;
	}

}
