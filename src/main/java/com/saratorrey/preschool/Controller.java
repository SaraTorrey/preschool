package com.saratorrey.preschool;

import com.saratorrey.preschool.domain.Preschool;
import com.saratorrey.preschool.domain.PreschoolRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@org.springframework.stereotype.Controller
public class Controller {

    @Autowired
    PreschoolRepo preschoolRepo;

    @GetMapping( value = "/" )
    public String landing() {
        return "landing";
    }

    @GetMapping( value = "/preschoolList" )
    public String preschoolList( Model model) {

        model.addAttribute( "preschools", preschoolRepo.findAll() );
        return "preschoolList";
    }

    @GetMapping(value = "/addPreschool" )
    public String addPreschool () {
        return "addPreschool";
    }

    @PostMapping("/addPreschool")
    public String post( @ModelAttribute Preschool preschool, BindingResult errors, Model model) {

        preschoolRepo.save( preschool );
        return "redirect:preschoolList";
    }
}