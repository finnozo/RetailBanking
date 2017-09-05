package com.isolutions4u.retailbanking.controllers;


import com.isolutions4u.retailbanking.model.Branch;
import com.isolutions4u.retailbanking.service.BranchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class BankControllerRestService {

    @Autowired
    private BranchService branchService;


    @GetMapping("/branches")
    public List<Branch> getAllBranch(){

        return branchService.getAllBranches();



    }
}
