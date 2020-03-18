package com.company;

public class Main {

    public static void main(String[] args) {
        Airplane A_test = new Airplane("Boeing", 400);
        Engine E_test = new Engine(870, 2016);

        String b = A_test.getBrand();
        int n = A_test.getNumber_of_seats();
        System.out.println("The brand is "+b+" and the number of seats is "+n);


        int oldNS = A_test.getNumber_of_seats();
        System.out.println("Old n of seats is " + oldNS);
        A_test.setNumber_of_seats(500);
        int newNS = A_test.getNumber_of_seats();
        System.out.println("New n of seats is " + newNS);


        double p = E_test.getPower();
        int pr = E_test.getProduction_year();
        System.out.println("The power is "+p+" and the production year is "+pr);

        boolean bo = E_test.isEco();
        if (bo==true)
        System.out.println("Eco-friendly");
        else System.out.println("NOT Eco-friendly");
    }
}
