package com.bosiy;

public class Phone {
    private String number;
    private String model;
    private double weight;
    private String name;

    public Phone(String name, String number, String model, double weight) {
        this.name = name;
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public Phone(String number, String model, double weight) {
        this(number, model);
        this.weight = weight;
    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    Phone() {

    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String info() {
        return this.name + "; " + this.number + "; ";
    }

    public String receiveCall() {
        return "Calling: " + this.name + "; ";
    }

    @Override
    public String toString() {
        return "Name: " + this.name + "; Number: " + this.number + "; Model: " + this.model
                + "; Weight: " + this.weight + "; ";
    }

    public void sendMassage(String... numbers) {

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Message sent to number: " + number +
                    "; \nmassage: " + numbers[i]);
        }
    }
}
