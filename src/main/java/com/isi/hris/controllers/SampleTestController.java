package com.isi.hris.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

	class TestDTO {
		private Long idno;
		private String name;

		public TestDTO() {
			super();
			// TODO Auto-generated constructor stub
		}

		public TestDTO(Long idno, String name) {
			super();
			this.idno = idno;
			this.name = name;
		}

		public Long getIdno() {
			return idno;
		}

		public void setIdno(Long idno) {
			this.idno = idno;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

	}

}
