package com.fd.webservices.webservicesframework.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fd.webservices.webservicesframework.entities.DBCollection;
import com.fd.webservices.webservicesframework.services.DBCollectionService;

@RestController
public class MyController {
	
	@Autowired
	private DBCollectionService dbCollectionService;

	@GetMapping("/home")
	public String home() {
		
		return "this is home page";
	}
	
	//Get all collection data details from DB
	
	@GetMapping("/dbcollection")
	public List<DBCollection> getDBCollection(){
		
		return this.dbCollectionService.getDBCollection();
		
		
	}
	
	
	@GetMapping("/dbcollection/{dbcollectionID}")
	public DBCollection getDBSingleset(@PathVariable String dbcollectionID) {
		return this.dbCollectionService.getDBSingleCollection(Integer.parseInt(dbcollectionID));
		
	}
	
	@PostMapping(path="dbcollection", consumes="application/json")
	public DBCollection addDBcollection(@RequestBody DBCollection dbCollection) {
		
		
		return this.dbCollectionService.addDBcollection(dbCollection);
	}
	
	
	@PutMapping(path="/dbcollection/{dbcollectionID}", consumes="application/json")
	public DBCollection updateDBcollection(@RequestBody DBCollection dbcollection,@PathVariable String dbcollectionID) {
		
		
		this.dbCollectionService.updateDBcollection(dbcollection, Integer.parseInt(dbcollectionID));
		return dbcollection;
	}
	
	
	@DeleteMapping(path="/dbcollection/{dbcollectionID}")
	public void deleteDBcollection(@PathVariable String dbcollectionID) {
		
		
		this.dbCollectionService.deleteDBcollection(Integer.parseInt(dbcollectionID));
		//return dbcollection;
	}
	
	
}
