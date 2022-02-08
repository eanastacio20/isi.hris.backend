package com.isi.hris.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;
import lombok.Data;

@RestController
@RequestMapping("/isi-hris")
public class SampleTestController {

	@GetMapping("/test")
	public List<TestDTO> testMapping() {
		List<TestDTO> list = new ArrayList<>();
		list.add(new TestDTO(1L, "Juan Dela Cruz"));
		list.add(new TestDTO(2L, "Juanna Dela Cruz"));
		return list;
	}

	@Data
	@AllArgsConstructor
	class TestDTO {
		
		private Long idno;
		private String name;
		
	}

}
