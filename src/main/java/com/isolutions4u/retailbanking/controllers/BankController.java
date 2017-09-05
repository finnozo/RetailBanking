package com.isolutions4u.retailbanking.controllers;


import com.isolutions4u.retailbanking.model.Branch;
import com.isolutions4u.retailbanking.service.BranchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
public class BankController {

    @Autowired
    private BranchService branchService;

    @GetMapping("/")
    public String showFormForAdd(Model model) {

        Branch branch = new Branch();

        model.addAttribute("branch", branch);

        return "index1";

    }

    @GetMapping("/t")
    public String list() {
        return "index";

    }

    @PostMapping("/")
    public String saveCustomer(@Valid @ModelAttribute("branch") Branch branch, BindingResult bindingResult, Model model) {

        // save the customer using service

        if (bindingResult.hasErrors()) {
            return "index1";
        } else {


            branchService.saveBranch(branch);
            branch.setName("");
            model.addAttribute("branch", branch);


            return "index1";
        }
    }


    @InitBinder
    public void initBinder(WebDataBinder webDataBinder){

        StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
        webDataBinder.registerCustomEditor(String.class,stringTrimmerEditor);
    }



}
