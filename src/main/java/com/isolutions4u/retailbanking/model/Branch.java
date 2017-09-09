package com.isolutions4u.retailbanking.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
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
    @Pattern(regexp = "^[A-Za-z\b]+$", message = "Use letters only please")
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
