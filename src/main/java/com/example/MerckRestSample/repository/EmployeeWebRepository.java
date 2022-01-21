package com.example.MerckRestSample.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.MerckRestSample.webmodel.EmployeeWebModel;

@Repository
public interface EmployeeWebRepository extends JpaRepository<EmployeeWebModel, Long>{

}
