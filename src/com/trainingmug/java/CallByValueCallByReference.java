package com.trainingmug.java;

public class CallByValueCallByReference {

    //call by value

    int add(int x, int y){
        x = 1000;
        y = 2000;
        System.out.println("Inside add method : x = " + x + " y = " + y);
        return x + y;
    }

    Employee updateEmployeeDetails(Employee employee){
        employee.name = "Steve";
        employee.department = "DevOps";
        System.out.println("In updateEmployee Details Method : Name = " + employee.name + " Department = " + employee.department);
        return employee;
    }

    public static void main(String[] args) {
        CallByValueCallByReference cbcr = new CallByValueCallByReference();
        int x = 100;
        int y = 200;
        System.out.println("Before Calling ; x = " + x + " y = " + y);
        System.out.println(cbcr.add(x, y));
        System.out.println("After Calling: x = " + x + " y = " + y);

        Employee employee = new Employee();
        employee.empId = 11111;
        employee.name = "John Doe";
        employee.department = "development";
        employee.basicSalary = 345345.34f;
        employee.ta = 343.34f;
        employee.da = 565.34f;
        employee.hra = 1234.56f;
        employee.gender = 'M';
        employee.joiningYear = 2020;
        employee.isRegular = true;

        System.out.println("Before Calling : Name = " + employee.name + " Department = " + employee.department);

        cbcr.updateEmployeeDetails(employee);

        System.out.println("After Calling : Name = " + employee.name + " Department = " + employee.department);

    }
}
