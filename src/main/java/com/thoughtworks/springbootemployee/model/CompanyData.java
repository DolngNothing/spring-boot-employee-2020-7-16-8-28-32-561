package com.thoughtworks.springbootemployee.model;

import java.util.ArrayList;
import java.util.List;

public class CompanyData {
    private final List<Company> companies = new ArrayList<>();

    public CompanyData() {
        this.companies.add(new Company(1, "ali"));
        this.companies.add(new Company(2, "tx"));
        this.companies.add(new Company(3, "hw"));
        this.companies.add(new Company(4, "zj"));
        this.companies.add(new Company(5, "oocl"));
        this.companies.add(new Company(6, "yy"));
        this.companies.add(new Company(7, "meituan"));
        EmployeeData employeeData = new EmployeeData();
        this.companies.get(0).setEmployees(employeeData.getEmployees().subList(0, 3));
        this.companies.get(1).setEmployees(employeeData.getEmployees().subList(3, 6));
    }

    public List<Company> getCompanies() {
        return companies;
    }

}
