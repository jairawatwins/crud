package com.example.demo.DTO;

import javax.persistence.Id;

public class RegisteredDTO {
    @Id
    private int EmployeeID;
    private String EmployeeFirstName;
    private String employeelastName;
    private int MobileNumber;
    private String Branch;

    public RegisteredDTO() {
    }

    public RegisteredDTO(int employeeID, String employeeFirstName, String employeelastName, int mobileNumber, String branch) {
        EmployeeID = employeeID;
        EmployeeFirstName = employeeFirstName;
        this.employeelastName = employeelastName;
        MobileNumber = mobileNumber;
        Branch = branch;
    }

    public int getEmployeeID() {
        return EmployeeID;
    }

    public void setEmployeeID(int employeeID) {
        EmployeeID = employeeID;
    }

    public String getEmployeeFirstName() {
        return EmployeeFirstName;
    }

    public void setEmployeeFirstName(String employeeFirstName) {
        EmployeeFirstName = employeeFirstName;
    }

    public String getEmployeelastName() {
        return employeelastName;
    }

    public void setEmployeelastName(String employeelastName) {
        this.employeelastName = employeelastName;
    }

    public int getMobileNumber() {
        return MobileNumber;
    }

    public void setMobileNumber(int mobileNumber) {
        MobileNumber = mobileNumber;
    }

    public String getBranch() {
        return Branch;
    }

    public void setBranch(String branch) {
        Branch = branch;
    }

    @Override
    public String toString() {
        return "RegisteredDTO{" +
                "EmployeeID=" + EmployeeID +
                ", EmployeeFirstName='" + EmployeeFirstName + '\'' +
                ", employeelastName='" + employeelastName + '\'' +
                ", MobileNumber=" + MobileNumber +
                ", Branch='" + Branch + '\'' +
                '}';
    }
}
