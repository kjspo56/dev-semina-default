package com.example.demo;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapTest {

    @Test
    public void createMap(){
        // test data
        List<Animal> animalList = new ArrayList<>();
        animalList.add(new Dog());
        animalList.add(new Cat());


        Map<String, Animal> animals = new HashMap<>();
        for (Animal animal : animalList) {
//            System.out.println("Crying => " + animal.toString() + animal.getClass().getSimpleName());
            animals.put(animal.getClass().getSimpleName(), animal);
        }
        System.out.println(animals);
    }
}
