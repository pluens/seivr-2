package com.sievr.controller;


import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sievr.model.DiningParams;
import com.sievr.model.api.query.ApiParams;
import com.sievr.model.api.result.Result;
import com.sievr.util.JsonWebServiceClient;

@RequestMapping("/rest")
@RestController
public class SievrRestController {
	
	@Autowired
	JsonWebServiceClient jsonWebServiceClient;
	
	@RequestMapping("/match")
	public ResponseEntity<Result[]> getResults(@RequestBody DiningParams parameters){
		
		try {
			Result[] results = jsonWebServiceClient.getMatchingRestaurants(parameters);
			return new ResponseEntity<Result[]>(results, HttpStatus.OK);
		} catch (IOException e) {
			Result[] empty = {};
			e.printStackTrace();
			return new ResponseEntity<Result[]>(empty, HttpStatus.BAD_REQUEST);
		}
	}
	
	@RequestMapping("/query")
	public ResponseEntity<Result[]> getQuery(@RequestBody ApiParams parameters){
		try {
			Result[] results = jsonWebServiceClient.sendQuery(parameters);
			return new ResponseEntity<Result[]>(results, HttpStatus.OK);
		} catch (IOException e) {
			Result[] empty = {};
			e.printStackTrace();
			return new ResponseEntity<Result[]>(empty, HttpStatus.BAD_REQUEST);
		}
	}
}
