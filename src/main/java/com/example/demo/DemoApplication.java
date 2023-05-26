package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);

        //DI를 사용하지 않을때, 다음과 같이 사용


        Owner owner1 = new Owner(getAnimal("dog"));
        Owner owner2 = new Owner(getAnimal("cat"));

        owner1.animalCry(); // 멍멍
        owner2.animalCry(); // 야옹

    }

    private static Map<String, Animal> getStringAnimalMap() {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Map<String, Animal> animals = new HashMap<>();
        animals.put("dog", dog);
        animals.put("cat", cat);
        return animals;
    }

    private static Animal getAnimal(String name) {
        Map<String, Animal> animals = getStringAnimalMap();
        return animals.get(name);
    }


}
