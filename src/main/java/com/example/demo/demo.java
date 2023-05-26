package com.example.demo;

import org.springframework.stereotype.Component;

interface Animal {
    String cry();
}

@Component
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


class Owner {
    private Animal animal;

    public Owner(Animal animal) {
        this.animal = animal;
    }

    public boolean animalCry() {
        System.out.println(animal.cry());
        return false;
    }
}



