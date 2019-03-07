package com.example.builder;

public class Main {
    Person person = Person.newBuilder().setChildren(false).setColorOfHair(1).setGrowth(175).setWeight(58).setYob(15).setName("Andrey").build();
    ApiService apiService = ApiService.INST;
}