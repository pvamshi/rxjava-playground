package com.company;

import io.reactivex.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("hello");
        Flowable.just("Hello world").subscribe(System.out::println);
    }
}
