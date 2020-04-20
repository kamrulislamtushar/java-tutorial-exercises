package com.company;

public interface A {
    default void show() {
        System.out.print("Interface  A");
    }
    void call();
}
