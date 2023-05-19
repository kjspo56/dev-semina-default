package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class DemoApplicationTests {

    private final Owner owner;
    private final List<Animal> animalList;

    @Autowired
    public DemoApplicationTests(Owner owner, List<Animal> animalList){
        this.owner = owner;
        this.animalList = animalList;
    }

    @Test
    public void beanTest(){
        System.out.println("Bean으로 등록된 동물들의 소리를 들어보겠습니다.");
        for (Animal animal : animalList) {
            System.out.println("Crying => " + animal.cry());
        }
        owner.animalCry();
    }

}
