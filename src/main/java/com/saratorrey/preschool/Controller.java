package com.saratorrey.preschool;

import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.stereotype.Controller
public class Controller {


    @GetMapping( value = "/" )
    public String landing() {


        return "landing";
    }


}