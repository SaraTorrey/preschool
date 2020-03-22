package com.saratorrey.preschool;

import com.saratorrey.preschool.domain.Preschool;
import com.saratorrey.preschool.example.PreschoolRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class PreschoolApplication {

	@Autowired PreschoolRepository preschoolRepository;

	public static void main(String[] args) {
		SpringApplication.run(PreschoolApplication.class, args);
	}


	@PostConstruct
	private void createPreschoolData () {

		Preschool preschool1 = new Preschool();
		preschool1.setImage( "" );
		preschool1.setName( "Altona" );
		preschool1.setUrl( "" );
		preschoolRepository.save( preschool1 );

		Preschool preschool2 = new Preschool();
		preschool2.setImage( "Ottensen" );
		preschool2.setName( "" );
		preschool2.setUrl( "" );
		preschoolRepository.save( preschool2 );

		Preschool preschool3 = new Preschool();
		preschool3.setImage( "" );
		preschool3.setName( "Sankt Pedro" );
		preschool3.setUrl( "" );
		preschoolRepository.save( preschool3 );
	}

}
