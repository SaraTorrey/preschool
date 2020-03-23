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

		Preschool altonaPreschool = new Preschool();
		altonaPreschool.setUrl( "https://www.google.com/maps/place/Altona,+Hamburg/@53.5844709,9.7844749,12z/data=!3m1!4b1!4m5!3m4!1s0x47b1841964fa213b:0x91d37d582ec50b0d!8m2!3d53.57916!4d9.8745558" );
		altonaPreschool.setName( "Altona" );
		altonaPreschool.setImage( "https://images.unsplash.com/photo-1578349035260-9f3d4042f1f7?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1951&q=80" );
		preschoolRepository.save( altonaPreschool );
		System.out.println( altonaPreschool.toString() );

		Preschool ottensenPreschool = new Preschool();
		ottensenPreschool.setImage( "Ottensen" );
		ottensenPreschool.setName( "" );
		ottensenPreschool.setUrl( "" );
		preschoolRepository.save( ottensenPreschool );

	}

}
