package com.example.konfigurator;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cars")
public class CarRestController {

    private final CarService carService;


    public CarRestController(CarService carService, CarRepository carRepository) {
        this.carService = carService;

    }




    @GetMapping
    public ResponseEntity<Car> printHelloWorld() {
        Car body = carService.carFind("Tesla","bialy"); return ResponseEntity.ok(body);
    }



    /*
    @GetMapping
    public ResponseEntity<Car> getCar() {
        return ResponseEntity.ok(CarService.search("Tesla", "3"));
    }*/
}

