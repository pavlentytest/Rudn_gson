package ru.samsung.itschool.mdev;


import com.google.gson.Gson;

import java.math.BigDecimal;
import java.util.List;

public class Main {

    static class Staff {
        public String name;
        public int age;
        public String position;
        public BigDecimal salary;
        public List<String> skills;
    }

    public static void main(String[] args) {

        String answer = "{\"name\":\"Anton\",\"age\":15,\"position\":\"Junior\",\"salary\":100,\"skills\":[\"java\",\"xml\",\"python\",\"Android\"]}";


        // Библиотека Gson - для того чтобы сериализ. объект и десериализовать.

       Gson g = new Gson();
       Staff alex = g.fromJson(answer,Staff.class);


        System.out.println(alex.skills.size());

        Staff ivan = new Staff();
        ivan.age = 20;
        ivan.name = "Ivan";
        System.out.println(g.toJson(ivan));

    }
}