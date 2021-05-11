package com.falabella.apicrudficheroTablaHistorica;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


//@ComponentScan(basePackages = {"com.falabella.apicrudficheroTablaHistorica.model","com.falabella.apicrudficheroTablaHistorica.dao","com.falabella.apicrudficheroTablaHistorica.service"})
//@EntityScan(basePackages = {"com.falabella.apicrudficheroTablaHistorica.model"})
//@EnableJpaRepositories(basePackages = {"com.falabella.apicrudficheroTablaHistorica.dao"})
@ComponentScan(basePackages = {"model","dao","service"})
@EntityScan(basePackages = {"model"})
@EnableJpaRepositories(basePackages = {"dao"})

@SpringBootApplication
public class FicheroTablaHistoricaApplication {

	public static void main(String[] args) {
		SpringApplication.run(FicheroTablaHistoricaApplication.class, args);
	}

}
