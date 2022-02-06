package com.example.bd2.model.dictionary.repository;

import com.example.bd2.model.dictionary.entity.CustonerRequestDict;
import com.example.bd2.model.dictionary.entity.EmployeeDict;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustonerRequestDictRepository extends JpaRepository<CustonerRequestDict, Long> {

}