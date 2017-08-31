package com.isolutions4u.retailbanking.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "BRANCH_MSTR")
public class Branch {


    @Id
    @Column(name = "BRANCH_NO")
    private String branchNo;

    @Column(name = "NAME")
    @NotNull(message = "Branch Name is required")
    @Size(min = 4, message = "Minimum Length is Four Character")
    private String name;

    public Branch() {
    }

    public Branch(String name) {
        this.name = name;
    }


    public String getBranchNo() {
        return branchNo;
    }

    public void setBranchNo(String branchNo) {
        this.branchNo = branchNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "Branch{" +
                "branchNo='" + branchNo + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}