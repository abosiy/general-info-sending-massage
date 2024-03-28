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

    public Phone() {

    }

    public String getNumber() {
        return this.number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getWeight() {
        return this.weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String info() {
        return this.name + "; " + this.number + "; ";
    }

    public String receiveCall(String name) {
        return "Calling: " + name + "; ";
    }

    public String receiveCall(String name, String number) {
       return "Name: " + name + "\nNumber: " + number;
    }



    @Override
    public String toString() {
        return "Name: " + this.name + "; Number: " + this.number + "; Model: " + this.model
                + "; Weight: " + this.weight + "; ";
    }

    public void sendMessage(String... numbers) {

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Message sent to number: " + number +
                    "; \nmessage: " + numbers[i]);
        }
    }
}
