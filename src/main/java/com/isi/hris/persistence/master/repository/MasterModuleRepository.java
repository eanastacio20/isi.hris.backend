package com.isi.hris.persistence.master.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.isi.hris.persistence.master.model.MasterModule;

@Repository
public interface MasterModuleRepository extends JpaRepository<MasterModule, Integer> {

}
