package com.company;

public class Subscriber {
    private String name;
    private  String email;

    public Subscriber(String name, String email){
        this.name=name;
        this.email=email;
    }

    public void update(Food food){
        System.out.println("======================");
        System.out.println("Hey "+this.name+" "+"Cafe Introduced a New Food");
        System.out.println("Food Name: "+food.getName());
        System.out.println("Food Price: "+food.getPrice());
        System.out.println("Food Description: "+food.getDescription());
        System.out.println("Thank You!");
        System.out.println("======================");
    }



}
