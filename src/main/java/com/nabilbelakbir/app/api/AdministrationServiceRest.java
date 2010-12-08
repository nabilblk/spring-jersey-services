package com.nabilbelakbir.app.api;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


import org.springframework.context.annotation.Scope;

import com.nabilbelakbir.app.business.AdministrationService;
import com.nabilbelakbir.app.business.impl.AdministrationServiceImpl;
import com.nabilbelakbir.app.domain.Country;
import com.sun.jersey.spi.inject.Inject;

@Path("/admin")
@Scope("request")
public class AdministrationServiceRest implements AdministrationService{

	@Inject
	private AdministrationServiceImpl administrationService;

	@POST
	@Path("/country")
	public void createCountry(@FormParam("name") String name,@FormParam("prefixe") String prefixe) {
		administrationService.createCountry(name, prefixe);
	}
	@GET
	@Path("/country")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Country> getAllCountrys() {
		return administrationService.getAllCountrys();
	}
	@GET
	@Path("/country/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Country getCountry(@PathParam("id") long countryId) {
		return administrationService.getCountry(countryId);
	}
	@DELETE
	@Path("/country/{id}")
	public void deleteCountry(long countryId) {
		administrationService.deleteCountry(countryId);
	}
	@PUT
	@Path("/country/{id}")
	public void updateCountry(@PathParam("id") long countryId,@FormParam("name") String name,@FormParam("prefixe") String prefixe) {
	administrationService.updateCountry(countryId, name, prefixe);
	}

}
