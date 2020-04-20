package com.company;

public interface B {
    default void show() {
        System.out.print("Interface B");
    }
}
