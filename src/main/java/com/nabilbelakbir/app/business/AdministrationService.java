package com.nabilbelakbir.app.business;

import java.util.List;

import com.nabilbelakbir.app.domain.Country;



public interface AdministrationService {
	void createCountry(String name, String prefixe);
	void deleteCountry(long countryId);
	void updateCountry(long countryId,String name, String prefixe);
	List<Country> getAllCountrys();
	Country getCountry(long countryId);
	
	
}
