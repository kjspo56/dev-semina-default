package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.util.List;

interface Animal {
    String cry();
}

@Component
@Primary
class Dog implements Animal {
    @Override
    public String cry() {
        return "멍멍";
    }
}

@Component
class Cat implements Animal {
    @Override
    public String cry() {
        return "야옹";
    }
}

@Component
class Owner {
    private Animal animal;

    public Owner(Animal animal) {
        this.animal = animal;
    }

    public void animalCry() {
        System.out.println(animal.cry());
    }
}



