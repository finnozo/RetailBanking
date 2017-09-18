package com.isolutions4u.retailbanking.service;

import com.isolutions4u.retailbanking.model.Branch;

import java.util.List;

public interface BranchService {
    List<Branch> findBranchByName(String name);

    Branch findBranchByBranchNo(String branchNo);

    String saveBranch(Branch branch);

    List<Branch> findAllBranches();

    String updateBranch(Branch branch, String branchNo);

    Branch findBranch(String branchNo);

    String deleteBranch(String branchNo);

}
