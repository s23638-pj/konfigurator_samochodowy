package com.example.konfigurator;

public class Car {
    private String mark;
    private String model;
    private String colour;
    private int range;
    private boolean fourWheelDrive;
    int wheels;

    private void spare(){
        wheels += 1;
        if (wheels > 5){
            System.out.println("Too much");
        }
    }
/*
    public Car(){
        this.mark = mark;
        this.model = model;
        this.colour = colour;
        this.range = range;
        this.fourWheelDrive = fourWheelDrive;
        this.wheels = wheels;

    }

*/
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
        public int wheels() {
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

}
