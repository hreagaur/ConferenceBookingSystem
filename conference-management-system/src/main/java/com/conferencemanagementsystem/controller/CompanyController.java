package com.conferencemanagementsystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.conferencemanagementsystem.model.Company;
import com.conferencemanagementsystem.service.CompanyService;

@RestController
	@RequestMapping("/api/company")
	public class CompanyController {

	    @Autowired
	    private CompanyService companyService;

	    @PostMapping("/create")
	    public Company saveCompany(@RequestBody Company company) {
	        return companyService.saveCompany(company);
	    }

	    @GetMapping("/getall")
	    public List<Company> getAllCompanies() {
	        return companyService.getAllCompanies();
	    }

	    @GetMapping("/{id}")
	    public Company getCompanyById(@PathVariable Long id) {
	        return companyService.getCompanyById(id);
	    }

	    @DeleteMapping("/{id}")
	    public void deleteCompany(@PathVariable Long id) {
	        companyService.deleteCompany(id);
	    }
	    
	    @PutMapping("/{id}")
	    public Company updateCompany(@PathVariable Long id, @RequestBody Company company) {
	        return companyService.updateCompany(company, id);
	    }
	}


