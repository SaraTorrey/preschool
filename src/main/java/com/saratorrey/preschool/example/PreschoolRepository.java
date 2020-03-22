package com.saratorrey.preschool.example;

import com.saratorrey.preschool.domain.Preschool;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PreschoolRepository extends PagingAndSortingRepository<Preschool, Long> {

}