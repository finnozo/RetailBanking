package com.isolutions4u.retailbanking.service;

import com.isolutions4u.retailbanking.dao.BranchDAO;
import com.isolutions4u.retailbanking.model.Branch;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BranchServiceImpl implements BranchService {

    @Autowired
    private BranchDAO branchDAO;


    @Override
    public Branch findByBranchNo(String branchNo) {
        return branchDAO.findByBranchNo(branchNo);
    }

    @Override
    public Branch findByName(String name) {
        return branchDAO.findByName(name);
    }

    @Override
    public void saveBranch(Branch branch) {

        branchDAO.saveBranch(branch);

    }

    @Override
    public void updateBranch(Branch branch) {
        branchDAO.updateBranch(branch);
    }

    @Override
    public void deleteUserByBranchNo(String branchNo) {

        branchDAO.deleteUserByBranchNo(branchNo);
    }

    @Override
    public void deleteAllBranches() {

        branchDAO.deleteAllBranches();

    }

    @Override
    public List<Branch> findAllBranches() {
        return branchDAO.findAllBranches();
    }

    @Override
    public boolean isBranchExist(Branch branch) {
        return branchDAO.isBranchExist(branch);
    }
}
