package com.saratorrey.preschool;

import com.saratorrey.preschool.domain.Kita;
import com.saratorrey.preschool.domain.KitaRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@org.springframework.stereotype.Controller
public class Controller {

    @Autowired
    KitaRepo kitaRepo;

    @GetMapping( value = "/" )
    public String landing() {
        return "landing";
    }

    @GetMapping( value = "/kitaList" )
    public String kitaList( Model model) {

        model.addAttribute( "kitas", kitaRepo.findAll() );
        return "kitaList";
    }

    @GetMapping(value = "/addKita" )
    public String addKita() {
        return "addKita";
    }

    @PostMapping("/addKita")
    public String post( @ModelAttribute Kita kita, BindingResult errors, Model model) {

        kitaRepo.save( kita );
        return "redirect:kitaList";
    }

    @GetMapping(value = "/kita/{id}/comments/new")
    public String comments( @PathVariable Long id, Model model ) {

        model.addAttribute( "kita", kitaRepo.findById( id ) );


//         Kita kita = kitaRepo.findById( Long.parseLong( id ) ).get();
//        model.addAttribute( "kita", kita );


        return "comments/new";}


        // /kita
        // /kita/{id}/addComment
        // /kita/{id}/comments/add
        // /kita/{id}/comments/edit/{commentid}
}