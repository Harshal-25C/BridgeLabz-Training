package com.objectmodeling;
import java.util.*;

public class Company {

	String companyName;
    ArrayList<Department> departments = new ArrayList<>();

    Company(String companyName) {
        this.companyName = companyName;
    }

    void addDepartment(Department department) {
        departments.add(department);
    }

    void showCompanyDetails() {
        System.out.println("\nCompany: " + companyName);
        for (Department dept : departments) {
            System.out.println(" Department: " + dept.departmentName);
            for (Employee emp : dept.employees) {
                System.out.println("  Employee: " + emp.employeeName);
            }
        }
    }

}
