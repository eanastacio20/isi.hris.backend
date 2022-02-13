package com.isi.hris.persistence.company.repository;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.isi.hris.persistence.company.model.CompanyPayCodeMaster;

@Repository
@Qualifier("companyPayCodeMasterRepository")
public interface CompanyPayCodeMasterRepository extends JpaRepository<CompanyPayCodeMaster, Integer> {

}
