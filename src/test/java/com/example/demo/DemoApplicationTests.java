package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class DemoApplicationTests {

    private final Owner owner;
    private final Animal animal;

    @Autowired
    public DemoApplicationTests(Owner owner, Animal animal){
        this.owner = owner;
        this.animal = animal;
    }

    @Test
    public void beanTest(){
        System.out.println("Bean으로 등록된 동물들의 소리를 들어보겠습니다.");
        //for (Animal animal : animalList) {
        //    System.out.println("Crying => " + animal.cry());
        //}
        owner.animalCry();
    }

    @Test
    public void testPay(){
        Payment cashPerf = new CashPerf();
        Store store = new Store(cashPerf);
        store.buySomething(100);
    }

}
