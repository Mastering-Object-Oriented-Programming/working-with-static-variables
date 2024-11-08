package com.trainingmug.java;

public class StaticTest {
    public static void main(String[] args) {
        // Static Variable
        System.out.println("Company Name : " + Employee.companyName);

        Employee employee1 = new Employee();
        System.out.println("Company Name : " + employee1.companyName); // Not Recommended
        employee1.companyName = "TrainingMug Pvt Ltd";

        Employee employee2 = new Employee();
        System.out.println("Company Name : " + employee2.companyName); // Not Recommended

        System.out.println("Company Name : " + Employee.companyName);
    }
}
