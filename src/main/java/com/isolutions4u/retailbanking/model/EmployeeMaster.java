package com.isolutions4u.retailbanking.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "EMP_MSTR")
public class EmployeeMaster {

    @Id
    @Column(name = "EMP_NO")
    private String empNo;
    @Column(name = "BRANCH_NO")
    private String branchNo;
    @Column(name = "FNAME")
    private String fName;
    @Column(name ="MNAME")
    private String mName;
    @Column(name ="LNAME")
    private String lName;
    @Column(name ="DEPT")
    private String dept;
    @Column(name ="DESIG")
    private String desig;
    @Column(name ="MNGR_NO")
    private String mngrNo;

    public EmployeeMaster() {
    }

    public EmployeeMaster(String branchNo, String fName, String mName, String lName, String dept, String desig, String mngrNo) {
        this.branchNo = branchNo;
        this.fName = fName;
        this.mName = mName;
        this.lName = lName;
        this.dept = dept;
        this.desig = desig;
        this.mngrNo = mngrNo;
    }

    public String getEmpNo() {
        return empNo;
    }

    public void setEmpNo(String empNo) {
        this.empNo = empNo;
    }

    public String getBranchNo() {
        return branchNo;
    }

    public void setBranchNo(String branchNo) {
        this.branchNo = branchNo;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getDesig() {
        return desig;
    }

    public void setDesig(String desig) {
        this.desig = desig;
    }

    public String getMngrNo() {
        return mngrNo;
    }

    public void setMngrNo(String mngrNo) {
        this.mngrNo = mngrNo;
    }

    @Override
    public String toString() {
        return "EmployeeMaster{" +
                "empNo='" + empNo + '\'' +
                ", branchNo='" + branchNo + '\'' +
                ", fName='" + fName + '\'' +
                ", mName='" + mName + '\'' +
                ", lName='" + lName + '\'' +
                ", dept='" + dept + '\'' +
                ", desig='" + desig + '\'' +
                ", mngrNo='" + mngrNo + '\'' +
                '}';
    }
}
