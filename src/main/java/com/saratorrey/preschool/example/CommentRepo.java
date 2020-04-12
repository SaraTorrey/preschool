package com.saratorrey.preschool.example;

import com.saratorrey.preschool.domain.Comment;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentRepo extends PagingAndSortingRepository<Comment, Long> {

}