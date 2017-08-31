package com.isolutions4u.retailbanking.service;

import com.isolutions4u.retailbanking.dao.BranchDAO;
import com.isolutions4u.retailbanking.model.Branch;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class BranchServiceImpl implements BranchService {


    @Autowired
    private BranchDAO branchDAO;

    @Override
    @Transactional
    public void saveBranch(Branch branch) {
        // save
        branchDAO.saveBranch(branch);
    }
}
