package com.conferencemanagementsystem.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.conferencemanagementsystem.model.Company;
import com.conferencemanagementsystem.repository.CompanyRepository;
import com.conferencemanagementsystem.service.CompanyService;

@Service
public class CompanyImpl implements CompanyService {

    @Autowired
    private CompanyRepository companyRepository;

    @Override
    public Company saveCompany(Company company) {
        return companyRepository.save(company);
    }

    @Override
    public List<Company> getAllCompanies() {
        return companyRepository.findAll();
    }

    @Override
    public Company getCompanyById(Long id) {
        return companyRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteCompany(Long id) {
        companyRepository.deleteById(id);
    }
    
    @Override
    public Company updateCompany(Company company, Long id) {
        Company existingCompany = getCompanyById(id);
        if (existingCompany!= null) {
            existingCompany.setName(company.getName());
            existingCompany.setPhone(company.getPhone());
            existingCompany.setAddress(company.getAddress());
            return companyRepository.save(existingCompany);
        } else {
            return null;
        }
    }
}
