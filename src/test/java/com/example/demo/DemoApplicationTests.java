package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SpringBootTest
class DemoApplicationTests {

    private Owner owner;
    private final List<Animal> animalList;

    @Autowired
    public DemoApplicationTests(List<Animal> animal){
        this.animalList = animal;
    }

    @Test
    public void beanTest(){
        System.out.println("Bean으로 등록된 동물들의 소리를 들어보겠습니다.");
        for (Animal animal : animalList) {
            System.out.println("Crying => " + animal.cry());
            System.out.println(getOwner(animal.getClass().getSimpleName()));
            owner = getOwner(animal.getClass().getSimpleName());
        }
        owner.animalCry();
        owner = getOwner("Cat");
        owner.animalCry();
    }

    public Owner getOwner(String name) {
        Map<String, Animal> animals = null;
        animals = getStringAnimalMap(animalList);
        Owner owner1 = new Owner(animals.get(name));
        return owner1;
    }

    public static Map<String, Animal> getStringAnimalMap(List<Animal> animalList) {
        Map<String, Animal> animals = new HashMap<>();
        for (Animal animal : animalList) {
//            System.out.println("Crying => " + animal.toString() + animal.getClass().getSimpleName());
            animals.put(animal.getClass().getSimpleName(), animal);
        }
        return animals;
    }

    @Test
    public void testPay(){
        Payment cashPerf = new CashPerf();
        Store store = new Store(cashPerf);
        store.buySomething(100);
    }

}
