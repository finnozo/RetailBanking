package com.isolutions4u.retailbanking.controllers;

import com.isolutions4u.retailbanking.model.Branch;
import com.isolutions4u.retailbanking.service.BranchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class BankRestController {

    @Autowired
    private BranchService branchService;

    @GetMapping("/branches")
    public List<Branch> findAllBranches() {

        return branchService.findAllBranches();

    }

    @GetMapping("/branches/{branchNo}/")
    public Branch findBranch(@PathVariable String branchNo) {

        return branchService.findBranch(branchNo);

    }

    @PostMapping("/branches")
    public String saveBranch(@RequestBody Branch branch) {
        branchService.saveBranch(branch);
        return "Save Successfully";
    }

    @PutMapping("/branches/{branchNo}/")
    public String updateBranch(@RequestBody Branch branch, @PathVariable String branchNo) {
        branchService.updateBranch(branch, branchNo);
        return "Successfully Updated";
    }

    @DeleteMapping("/branches/{branchNo}/")
    public String deleteBranch(@PathVariable String branchNo) {
        branchService.deleteBranch(branchNo);
        return "Deleted Successfully";
    }

    @GetMapping("/branches/byName/{name}/")
    public List<Branch> findBranchByName(@PathVariable String name) {
        return branchService.findBranchByName(name);
    }


}
