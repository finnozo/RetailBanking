package com.isolutions4u.retailbanking.service;

import com.isolutions4u.retailbanking.model.Branch;
import org.springframework.stereotype.Service;

import java.util.List;

public interface BranchService {

    void saveBranch(Branch branch);

    List<Branch> getAllBranches();
}
