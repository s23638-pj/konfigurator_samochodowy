package com.example.konfigurator;

import org.springframework.stereotype.Service;

@Service
public class CarService {


    private final CarRepository carRepository;

    public CarService(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    private static int kola;
    static void print_car(Car car) {
        System.out.print(car);
    }

    public Car carFind (String model,String kolor){

        Car car = new Car("Tesla", 2,  "bialy",5);
        return carRepository.save(car);
    }
}

