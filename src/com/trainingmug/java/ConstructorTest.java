package com.trainingmug.java;

public class ConstructorTest {
    public static void main(String[] args) {
        Employee employee1 = new Employee(111,"John Doe","Development",234233.23F,234.23F,2342.3F,4534.45F,'M',2022,true);
        employee1.companyName = "Microsoft";
        employee1.employeeProfile();
        // employee1.doSomeConfiguration();

        Employee employee2 =new Employee(222,"Steve","Devops",43534.34F,345.34F,343.45F,345.45F,'M',2021,false);
        employee2.companyName = "Amazon";
        employee2.employeeProfile();
        // employee2.doSomeConfiguration();
    }
}
