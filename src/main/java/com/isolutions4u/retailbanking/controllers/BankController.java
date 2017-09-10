package com.isolutions4u.retailbanking.controllers;


import com.isolutions4u.retailbanking.model.Branch;
import com.isolutions4u.retailbanking.service.BranchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

@Controller
@RequestMapping("/admin")
public class BankController {

    @Autowired
    private BranchService branchService;


    @GetMapping(value = "/branchForm")
    public ModelAndView bankCreateForm() {
        ModelAndView modelAndView = new ModelAndView();
        Branch branch = new Branch();
        modelAndView.addObject("branch", branch);
        modelAndView.setViewName("admin/branch-creation");
        return modelAndView;
    }


    @PostMapping(value = "/branchForm")
    public ModelAndView createNewUser(@Valid Branch branch, BindingResult bindingResult) {
        ModelAndView modelAndView = new ModelAndView();
        Branch branchExists = branchService.findBranchByBranchNo(branch.getBranchNo());
        if (branchExists != null) {
            bindingResult
                    .rejectValue("branchNo", "error.branch",
                            "There is already a Branch registered with the Same Branch");
        }
        if (bindingResult.hasErrors()) {
            modelAndView.setViewName("admin/branch-creation");
        } else {
            branchService.saveBranch(branch);
            modelAndView.addObject("successMessage", "Branch has been created successfully");
            modelAndView.addObject("branch", new Branch());
            modelAndView.setViewName("admin/branch-creation");

        }
        return modelAndView;
    }



}
