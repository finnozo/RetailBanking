package com.isolutions4u.retailbanking.model;

import javax.persistence.*;


public class Employee {

    @Column(name="employee_no")
    private String empNo;

    @OneToOne(targetEntity=Employee.class, cascade={CascadeType.DETACH,CascadeType.REFRESH,CascadeType.MERGE,CascadeType.PERSIST})
    @JoinColumn(name="BRANCH_NO",referencedColumnName="BRANCH_NO")
    private String branchNo;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "department")
    private String department;

    @Column(name = "designation")
    private String desingnation;

    @Column(name = "managerNo")
    private String managerNo;


}
