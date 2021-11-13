package com.example.konfigurator;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class Car {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private String mark;
    private String model;
    private String colour;
    private int range;
    private boolean fourWheelDrive;
    int wheels;

    public Car(){

    };
/*
    public Car(){
        private Long id;
        this.mark = mark;
        this.model = model;
        this.colour = colour;
        this.range = range;
        this.fourWheelDrive = fourWheelDrive;
        this.wheels = wheels;

    }
  */


    public Car(String tesla, int i, String bialy, int i1) {
    }


    public String getMark() {
            return mark;
        }
        public String getModel() {
            return model;
        }

        public String getColour() {
            return colour;
        }
        public int getRange() {
            return range;
        }
        public boolean getFourWheelDrive() {
            return fourWheelDrive;
        }
        public int getWheels() {
            return wheels;
        }



        public void setMark(String newMark) {
            this.mark = newMark;
        }

        public void setModel(String newModel) {
            this.model = newModel;
        }

        public void setColour(String newColour) {
            this.colour = newColour;
        }

        public void setRange(int newRange) {
            this.range = newRange;
        }

        public void setFourWheelRange(boolean newFourWheelDrive) {
            this.fourWheelDrive = newFourWheelDrive;
        }
        public void setWheels(int newWheels) {
            this.wheels = newWheels;
        }

        @Override
        public String toString() {
            return "Car{" +
                    "marka='" + mark + '\'' +
                    "model='" + model + '\'' +
                    ", colour=" + colour +
                    ", range='" + range + '\'' +
                    ", fourWheelDrive=" + fourWheelDrive +
                    ", wheels=" + wheels +
                    '}';
    }

}
