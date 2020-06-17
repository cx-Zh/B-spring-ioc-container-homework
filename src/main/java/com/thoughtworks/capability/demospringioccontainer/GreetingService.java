package com.thoughtworks.capability.demospringioccontainer;

import org.springframework.stereotype.Service;

@Service
public class GreetingService {
    public GreetingService(){
        System.out.println("GreetingService instantiating");
    }
    String sayHi() {
//        new GreetingService();
        return "hello world";
    }
}
