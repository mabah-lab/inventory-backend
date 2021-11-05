package com.daralab.inventaire;

import com.daralab.inventaire.dao.ManufacturerRepository;
import com.daralab.inventaire.model.Manufacturer;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class InventaireApplication {

	public static void main(String[] args) {
		SpringApplication.run(InventaireApplication.class, args);
	}
	@Bean
	CommandLineRunner run(ManufacturerRepository manufacturerRepository){
		return args -> {
			manufacturerRepository.save(new Manufacturer(null,"LENOVO"));
			manufacturerRepository.save(new Manufacturer(null,"HP"));
			manufacturerRepository.save(new Manufacturer(null,"DELL"));

		};
	}

}
