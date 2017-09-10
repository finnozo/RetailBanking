package com.isolutions4u.retailbanking.service;

import com.isolutions4u.retailbanking.model.Branch;
import com.isolutions4u.retailbanking.repository.BranchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("branchService")
public class BranchServiceImpl implements BranchService {

    @Autowired
    private BranchRepository branchRepository;


    @Override
    public Branch findBranchByName(String name) {
        return branchRepository.findByName(name);
    }

    @Override
    public Branch findBranchByBranchNo(String branchNo) {
        return branchRepository.findByBranchNo(branchNo);
    }

    @Override
    public void saveBranch(Branch branch) {

        String branchNo = branchRepository.count() + 10000 + "";

        branch.setBranchNo(branchNo);
        branchRepository.saveAndFlush(branch);

    }
}
