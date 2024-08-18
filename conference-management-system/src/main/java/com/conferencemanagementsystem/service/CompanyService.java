package com.conferencemanagementsystem.service;

import java.util.List;

import com.conferencemanagementsystem.model.Company;

public interface CompanyService {

    Company saveCompany(Company company);

    List<Company> getAllCompanies();

    Company getCompanyById(Long id);

    void deleteCompany(Long id);
    
    Company updateCompany(Company company, Long id);
}


