package com.fd.webservices.webservicesframework.services;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.fd.webservices.webservicesframework.entities.DBCollection;

public interface DBCollectionService{

	public List<DBCollection> getDBCollection();
	
	public DBCollection getDBSingleCollection(int dbcollectionID);
	
	public DBCollection addDBcollection(DBCollection dbCollection);
	
	public DBCollection updateDBcollection(DBCollection dbCollection,int dbcollectionID);
	
	public void deleteDBcollection(int dbcollectionID);
}
