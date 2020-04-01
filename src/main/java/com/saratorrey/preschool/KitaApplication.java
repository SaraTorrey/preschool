package com.saratorrey.preschool;

import com.saratorrey.preschool.domain.Kita;
import com.saratorrey.preschool.example.PreschoolRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class KitaApplication {

	@Autowired PreschoolRepository preschoolRepository;

	public static void main(String[] args) {
		SpringApplication.run( KitaApplication.class, args);
	}


	@PostConstruct
	private void createPreschoolData () {

		Kita altonaKita = new Kita();
		altonaKita.setUrl( "https://www.google.com/maps/place/Altona,+Hamburg/@53.5844709,9.7844749,12z/data=!3m1!4b1!4m5!3m4!1s0x47b1841964fa213b:0x91d37d582ec50b0d!8m2!3d53.57916!4d9.8745558" );
		altonaKita.setName( "Altona" );
		altonaKita.setImage( "https://images.unsplash.com/photo-1453342664588-b702c83fc822?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1640&q=80" );
		altonaKita.setShortDescription( "Great school with a nice playground" );
		altonaKita.setComment( "Great school with a nice playground" );
		preschoolRepository.save( altonaKita );
		System.out.println( altonaKita.toString() );

		Kita ottensenKita = new Kita();
		ottensenKita.setUrl( "https://www.google.com/maps/place/Ottensen,+Hamburg/@53.5529728,9.9135567,15z/data=!3m1!4b1!4m5!3m4!1s0x47b1859b1ede80fb:0x5263df27bd98a70!8m2!3d53.5541562!4d9.9221342" );
		ottensenKita.setName( "Ottensen" );
		ottensenKita.setImage( "https://images.unsplash.com/photo-1564429238817-393bd4286b2d?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1567&q=80" );
		ottensenKita.setShortDescription( "Great Kita with a nice team of teachers" );
		ottensenKita.setComment( "Great Kita with a nice team of teachers" );
		preschoolRepository.save( ottensenKita );
		System.out.println( ottensenKita.toString() );
	}

}
