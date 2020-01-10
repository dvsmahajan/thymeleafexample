package com.dvsMahajan.springbootThymeleaf.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexCntroller {

	@GetMapping("/getData")
	public ResponseEntity<String> getData(){
		String st= "HI DVS HOW ARE YOU?????";
		return new ResponseEntity<>(st,HttpStatus.OK);
	}
}
