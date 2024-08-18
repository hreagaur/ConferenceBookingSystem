package com.conferencemanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.conferencemanagementsystem.model.Company;

public interface CompanyRepository extends JpaRepository<Company, Long> {

}
