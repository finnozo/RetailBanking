package com.isolutions4u.retailbanking.service;

import com.isolutions4u.retailbanking.model.Branch;

import java.util.List;

public interface BranchService {


    Branch findByBranchNo(String branchNo);

    Branch findByName(String name);

    void saveBranch(Branch branch);

    void updateBranch(Branch branch);

    void deleteUserByBranchNo(String branchNo);

    void deleteAllBranches();

    List<Branch> findAllBranches();

    boolean isBranchExist(Branch branch);

}
