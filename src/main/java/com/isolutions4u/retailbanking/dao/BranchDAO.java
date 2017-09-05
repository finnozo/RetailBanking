package com.isolutions4u.retailbanking.dao;

import com.isolutions4u.retailbanking.model.Branch;

import java.util.List;

public interface BranchDAO {

    void saveBranch(Branch branch);

    List<Branch> getAllBranches();
}
