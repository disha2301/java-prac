package com.gevernova.objectmodeling.companycomposition;


public class CompanyComposition {
    public static void main(String[] args){
        Company company = new Company("JPMC");
        Department finDept = new Department("Finance");
        finDept.addEmp("Disha");
        finDept.addEmp("Ahad");

        Department techDept = new Department("Tech");
        techDept.addEmp("Sakshi");

        company.addDept(finDept);
        company.addDept(techDept);

        company.showCompanyStructure();

        company.deleteCompany();
    }
}