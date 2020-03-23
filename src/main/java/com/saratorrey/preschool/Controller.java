package com.saratorrey.preschool;

import com.saratorrey.preschool.domain.PreschoolRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

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


}