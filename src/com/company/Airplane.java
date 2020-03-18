package com.company;

public class Airplane {
    private  String brand;
    private int number_of_seats;


    public Airplane(String brand, int number_of_seats) {
        this.brand = brand;
        this.number_of_seats = number_of_seats;
    }
    public String getBrand()
    {
        return brand;
    }
    public int getNumber_of_seats()
    {
        return number_of_seats;
    }
    public void setNumber_of_seats(int number_of_seats)
    {
        this.number_of_seats = number_of_seats;
    }
}

