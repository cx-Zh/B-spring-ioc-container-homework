package com.thoughtworks.capability.demospringioccontainer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class Foo {
    @Autowired
    private Bar bar;

//    public Foo(@Lazy Bar bar) {
//        this.bar = bar;
//    }

//    public Foo(){}
//    public void setBar(Bar bar){
//        this.bar = bar;
//    }

    @PostConstruct
    public void init(){
        bar.setFoo(this);
    }
}
