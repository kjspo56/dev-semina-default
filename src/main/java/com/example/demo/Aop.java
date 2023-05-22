package com.example.demo;

import org.springframework.util.StopWatch;

interface Payment {
    void pay(int amount);
}

class Store {
    Payment payment;
    public Store(Payment payment){
        this.payment=payment;
    }

    public void buySomething(int amount){
        payment.pay(amount);
    }
}

class Cash implements Payment{
    @Override
    public void pay(int amount) {
        System.out.println(amount + " 현금 결제");
    }
}

class CashPerf implements Payment{
    Payment cash = new Cash();
    //100원보다 많으면 카드로 결제하고 이하면 현금으로 결제
    @Override
    public void pay(int amount){
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        if(amount > 100) {
            System.out.println(amount + " 신용 카드");
        }else {
            cash.pay(amount);
        }
        stopWatch.stop();
        System.out.println(stopWatch.prettyPrint());
    }
}

