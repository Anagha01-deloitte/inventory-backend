package com.advancedJava.coreFeatures.entities;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "employee")
public class employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "EMPLOYEE_ID")
    private long employeeId;

    @Column
    private String employeeName;

    @Column
    private String employeeAddress;

    @Column
    private gender employeeGender;

    @Column
    private role employeeRole;

    @Column
    private Timestamp employeeDOJ;

    public long getEmployeeId() {
        return employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public String getEmployeeAddress() {
        return employeeAddress;
    }

    public gender isEmployeeGender() {
        return employeeGender;
    }

    public role getEmployeeRole() {
        return employeeRole;
    }

    public Timestamp getEmployeeDOJ() {
        return employeeDOJ;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public void setEmployeeAddress(String employeeAddress) {
        this.employeeAddress = employeeAddress;
    }

    public void setEmployeeGender(gender employeeGender) {
        this.employeeGender = employeeGender;
    }

    public void setEmployeeRole(role employeeRole) {
        this.employeeRole = employeeRole;
    }

    public void setEmployeeDOJ(Timestamp employeeDOJ) {
        this.employeeDOJ = employeeDOJ;
    }
}
