package com.fd.webservices.webservicesframework.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.fd.webservices.webservicesframework.dao.CourseRepository;
import com.fd.webservices.webservicesframework.entities.DBCollection;

@Service
public class DBCollectionServiceImpl implements DBCollectionService {
	
	@Autowired
	private CourseRepository courseRepository;
	
	//List<DBCollection> list;
	
	
	
	public DBCollectionServiceImpl() {
		
		/*
		 * list = new ArrayList<>(); list.add(new DBCollection(145, "DevOps Courses",
		 * "This is demo course for DevOps")); list.add(new DBCollection(125,
		 * "Java Course", "This is demo course for Java")); list.add(new
		 * DBCollection(457, "C-Sharp Course", "This is demo course for C-Sharp"));
		 * list.add(new DBCollection(761, "Dot Net Course",
		 * "This is demo course for Dot Net")); list.add(new DBCollection(256,
		 * "Angular Course", "This is demo course for Angular")); list.add(new
		 * DBCollection(897, "C++ Course", "This is demo course for C++")); list.add(new
		 * DBCollection(945, "Python Course", "This is demo course for Python"));
		 */
		
		
		
	}
	

	@Override
	public List<DBCollection> getDBCollection() {
		// TODO Auto-generated method stub
		//return list;
		List<DBCollection> list =(List<DBCollection>)this.courseRepository.findAll();
		
		return list;
	}


	@Override
	public DBCollection getDBSingleCollection(int dbcollectionID) {
		
		DBCollection dbc = null;
		
		//for(DBCollection dbCollection: list) {
			//if(dbCollection.getId() == dbcollectionID) {
				//dbc = dbCollection;
		try {
				dbc = this.courseRepository.findById(dbcollectionID);
				//break;
			} catch(Exception e) {
				e.printStackTrace();
			}
			
		
		
		return dbc;
	}


	@Override
	public DBCollection addDBcollection(DBCollection dbCollection) {
		
		
		
		//list.add(dbCollection);
		
		   DBCollection result = courseRepository.save(dbCollection);
		
		//return dbCollection;
		   return result;
	}


	@Override
	public DBCollection updateDBcollection(DBCollection dbCollection, int dbcollectionID) {
		
		/*
		 * list = list.stream().map(b->{ if(b.getId() == dbcollectionID) {
		 * b.setTitle(dbCollection.getTitle());
		 * b.setDescription(dbCollection.getDescription()); }
		 * 
		 * return b; }).collect(Collectors.toList());
		 */
		dbCollection.setId(dbcollectionID);		
		courseRepository.save(dbCollection);
		
		return dbCollection;
		
	}


	@Override
	public void deleteDBcollection(int dbcollectionID) {
		/*
		 * list = list.stream().filter(b->{ if(b.getId() != dbcollectionID) { return
		 * true; }else { return false; } }).collect(Collectors.toList());
		 */
	
		courseRepository.deleteById(dbcollectionID);
		
	}




	


}

