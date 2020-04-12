package com.saratorrey.preschool.example;

import com.saratorrey.preschool.domain.Kita;

import org.springframework.data.repository.PagingAndSortingRepository;

public interface KitaRepo extends PagingAndSortingRepository <Kita, Long> {

}
