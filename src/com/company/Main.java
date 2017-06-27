package com.company;

import io.reactivex.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("hello");
        String[] aa = {"hello", "hello2", "hello3"};
        Observable<String> stringObservable = Observable.fromArray(aa);
        stringObservable.subscribe(System.out::println);
    }
}
