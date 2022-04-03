package com.fd.webservices.webservicesframework.dao;

import org.springframework.data.repository.CrudRepository;

import com.fd.webservices.webservicesframework.entities.DBCollection;

public interface CourseRepository extends CrudRepository<DBCollection, Integer>{
	
	public DBCollection findById(int dbcollectionID);

}
