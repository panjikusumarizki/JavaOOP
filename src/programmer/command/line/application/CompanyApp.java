package programmer.command.line.application;

import programmer.command.line.data.Company;

public class CompanyApp {
    public static void main(String[] args) {

        Company company = new Company();
        company.setName("Command LABS");

        Company.Employee employee = company.new Employee();
        employee.setName("Panji");

        System.out.println(employee.getName());
        System.out.println(employee.getCompany());
    }
}
