package com.objectmodeling;

public class CompositionExample {

	public static void main(String[] args) {

        Company company = new Company("Tech Solutions");

        Department dev = new Department("Development");
        dev.addEmployee("Amit");
        dev.addEmployee("Neha");

        Department hr = new Department("HR");
        hr.addEmployee("Suman");

        company.addDepartment(dev);
        company.addDepartment(hr);

        company.showCompanyDetails();

    }
}
