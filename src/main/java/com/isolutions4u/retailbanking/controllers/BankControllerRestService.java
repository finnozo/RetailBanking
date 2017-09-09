package com.isolutions4u.retailbanking.controllers;


import com.isolutions4u.retailbanking.model.Branch;
import com.isolutions4u.retailbanking.service.BranchService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class BankControllerRestService {

    public static final Logger logger = LoggerFactory.getLogger(BankControllerRestService.class);

    @Autowired
    private BranchService branchService;


    @GetMapping("/branches")
    public ResponseEntity<List<Branch>> findAllBranches() {
        List<Branch> branches = branchService.findAllBranches();
        //branches.clear();
        if (branches.isEmpty()) {
            return new ResponseEntity(HttpStatus.NO_CONTENT);
            // You many decide to return HttpStatus.NOT_FOUND
        }
        return new ResponseEntity<List<Branch>>(branches, HttpStatus.OK);


    }
}
