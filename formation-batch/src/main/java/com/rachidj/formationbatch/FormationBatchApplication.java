package com.rachidj.formationbatch;

import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Profile;

@SpringBootApplication
@EnableBatchProcessing
public class FormationBatchApplication {

	public static void main(String[] args) {
		SpringApplication.run(FormationBatchApplication.class, args);
	}

}
