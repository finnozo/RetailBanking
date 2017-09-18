package com.isolutions4u.retailbanking.service;

import com.isolutions4u.retailbanking.model.Branch;
import com.isolutions4u.retailbanking.repository.BranchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service("branchService")
public class BranchServiceImpl implements BranchService {

    @Qualifier("branchRepository")
    @Autowired
    private BranchRepository branchRepository;


    @Override
    public List<Branch> findBranchByName(String name) {
        List<Branch> branches = new ArrayList<>();
        branchRepository.findByName(name).forEach(branches::add);
        return branches;
    }

    @Override
    public Branch findBranchByBranchNo(String branchNo) {
        return branchRepository.findByBranchNo(branchNo);
    }

    @Override
    public String saveBranch(Branch branch) {

        String branchNo = branchRepository.count() + 10000 + "";

        branch.setBranchNo(branchNo);
        branchRepository.saveAndFlush(branch);

        return "Save Successfully";

    }

    @Override
    public List<Branch> findAllBranches() {
        List<Branch> branches = new ArrayList<>();
        branchRepository.findAll().forEach(branches::add);
        return branches;
    }

    @Override
    public String updateBranch(Branch branch, String branchNo) {

        branchRepository.saveAndFlush(branch);

        return "Updated Successfully";
    }

    @Override
    public Branch findBranch(String branchNo) {

        return branchRepository.findOne(branchNo);
    }

    @Override
    public String deleteBranch(String branchNo) {
        branchRepository.delete(branchNo);
        return "Deleted Successfully";
    }


}
