package com.saratorrey.preschool;

import com.saratorrey.preschool.domain.Kita;
import com.saratorrey.preschool.domain.Comment;
import com.saratorrey.preschool.example.CommentRepo;
import com.saratorrey.preschool.example.KitaRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@org.springframework.stereotype.Controller
public class Controller {

    @Autowired
    KitaRepo kitaRepo;

    @Autowired
    CommentRepo commentRepo;

    @GetMapping( value = "/" )
    public String landing() {

        return "landing";
    }

    @GetMapping( value = "/kitaList" )
    public String kitaList( Model model ) {

        model.addAttribute( "kitas", kitaRepo.findAll() );
        return "kitaList";
    }

    // Displaying add kita page, id does not exist yet.
    @GetMapping( value = "/addKita" )
    public String addKita() {

        return "addKita";
    }

    // Adding kita, id does not exist yet, but it will after save.
    @PostMapping( "/addKita" )
    public String addKita( @ModelAttribute Kita kita, BindingResult errors, Model model ) {

        kitaRepo.save( kita );
        return "redirect:kitaList";
    }

    // Display add comment page.
    @GetMapping( value = "kita/{id}/comments/new" )
    public String comments( @PathVariable Long id, Model model ) {

        model.addAttribute( "kita", kitaRepo.findById( id ).get() );

        return "comments/new";
    }

    @PostMapping( "kita/comments/new" )
    public String addComment( @RequestParam( "comment" ) String comment,
                              @RequestParam( "kitaId" ) Long kitaId) {

        Kita kita = kitaRepo.findById( kitaId ).get();

        Comment kitaComment = new Comment();
        kitaComment.setComment( comment );

        kita.getComments().add( kitaComment );
        kitaRepo.save( kita );

        return "redirect:/kitaList";
    }

    @GetMapping( value = "kita/{id}/comments/edit" )
    public String startEditComments( @PathVariable Long id, Model model ) {

        model.addAttribute( "kita", kitaRepo.findById( id ).get() );

        return "comments/edit";
    }

    @PostMapping( "kita/comments/edit" )
    public String saveEditComment( @RequestParam( "comment" ) String commentText,
                                   @RequestParam( "kitaId" ) Long kitaId,
                                   @RequestParam( "commentName" ) String commentName,
                                   Model model ) {

        Kita kita = kitaRepo.findById( kitaId ).get();

        Comment comment = new Comment();
        comment.setComment( commentText );
        comment.setName( commentName );

        kita.getComments().add( comment );
        kitaRepo.save( kita );

        return "redirect:/kitaList";
    }

    @GetMapping( "kita/{kitaId}/comments/{commentId}/delete" )
    public String deleteComment( @PathVariable Long kitaId, @PathVariable Long commentId ) {

        Kita kita = kitaRepo.findById( kitaId ).get();
        Comment comment = commentRepo.findById( commentId ).get();

        kita.getComments().remove( comment );

        return "redirect:/kitaList";
    }
}