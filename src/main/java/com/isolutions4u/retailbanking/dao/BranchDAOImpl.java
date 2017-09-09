package com.isolutions4u.retailbanking.dao;

import com.isolutions4u.retailbanking.model.Branch;
import com.isolutions4u.retailbanking.repository.BranchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class BranchDAOImpl implements BranchDAO {

    @Autowired
    private BranchRepository branchRepository;


    @Override
    public Branch findByBranchNo(String branchNo) {
        return branchRepository.findOne(branchNo);
    }

    @Override
    public Branch findByName(String name) {
        return branchRepository.findByName(name);
    }

    @Override
    public void saveBranch(Branch branch) {

        String branchNo = branchRepository.count() + 10000 + "";

        branch.setBranchNo(branchNo);

        branchRepository.save(branch);

    }

    @Override
    public void updateBranch(Branch branch) {
        branchRepository.save(branch);
    }

    @Override
    public void deleteUserByBranchNo(String branchNo) {

        branchRepository.delete(branchNo);
    }

    @Override
    public void deleteAllBranches() {

        branchRepository.deleteAll();

    }

    @Override
    public List<Branch> findAllBranches() {
        return branchRepository.findAll();
    }

    @Override
    public boolean isBranchExist(Branch branch) {
        return findByName(branch.getName()) != null;
    }


}
