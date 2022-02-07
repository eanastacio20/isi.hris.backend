package com.isi.hris.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/isi-hris")
public class SampleTestController {
	

	@GetMapping("/test")
	public String testMapping() {
		return "Test";
	}

}
