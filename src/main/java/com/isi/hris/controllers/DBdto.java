package com.isi.hris.controllers;

import com.fasterxml.jackson.annotation.JsonAlias;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class DBdto {

	@JsonAlias("host")
	private String host;
	@JsonAlias("username")
	private String username;
	@JsonAlias("password")
	private String password;

	@JsonAlias("dbTemplate")
	private String dbTemplate;

	@JsonAlias("dumpFileDestination")
	private String dumpFileDestination;
	@JsonAlias("newDatabaseName")
	private String newDatabaseName;
	@JsonAlias("characterSet")
	private String characterSet;

}