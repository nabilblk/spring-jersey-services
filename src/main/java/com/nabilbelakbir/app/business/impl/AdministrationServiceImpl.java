package com.nabilbelakbir.app.business.impl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nabilbelakbir.app.business.AdministrationService;
import com.nabilbelakbir.app.dao.jpa.CountryDaoImpl;
import com.nabilbelakbir.app.domain.Country;





@Repository
@Service
@Transactional
public class AdministrationServiceImpl implements AdministrationService{

	@Autowired 
	private CountryDaoImpl countryDaoImpl;

	public void createCountry(String name, String prefixe) {
			Country country = new Country();
			country.setName(name);
			country.setPrefixe(prefixe);
			countryDaoImpl.persist(country);
	}

	public void deleteCountry(long countryId) {
		Country country = countryDaoImpl.getById(countryId);
		countryDaoImpl.remove(country);
	}

	public List<Country> getAllCountrys() {
		return countryDaoImpl.findAll();
	}

	public Country getCountry(long countryId) {
		return countryDaoImpl.getById(countryId);
	}

	public void updateCountry(long countryId, String name, String prefixe) {
		Country country = countryDaoImpl.getById(countryId);
		country.setName(name);
		country.setPrefixe(prefixe);
		countryDaoImpl.persist(country);
	}
}
