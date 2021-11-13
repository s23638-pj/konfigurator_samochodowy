package com.example.konfigurator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class KonfiguratorApplication {

	@Autowired
	public static void main(String[] args) {
		SpringApplication.run(KonfiguratorApplication.class, args);
/*
		Car tesla = new Car();
		tesla.setMark("Tesla");
		tesla.setModel("Model S");
		tesla.setColour("White");
		tesla.setRange(200);
		tesla.setFourWheelRange(true);
		tesla.setWheels(4);



		System.out.println(tesla);*/
	}

}
