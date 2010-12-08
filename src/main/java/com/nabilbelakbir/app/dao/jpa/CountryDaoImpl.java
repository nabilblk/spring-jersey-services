package com.nabilbelakbir.app.dao.jpa;


import org.springframework.stereotype.Repository;

import com.nabilbelakbir.app.dao.CountryDao;
import com.nabilbelakbir.app.domain.Country;
import com.nabilbelakbir.utils.dao.BaseDaoImpl;

/**
 * @author Nabil Belakbir 
 * 
 */
@Repository
public class CountryDaoImpl extends BaseDaoImpl<Country, Long> implements CountryDao {
}
