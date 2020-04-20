package com.company;

public class Main {

    public static void main(String[] args) {

        Tree tree = new Tree();
        Plant plant = new Plant();

        Plant plant2 = tree;

        tree.grow();
        plant2.grow();
        plant.grow();
    }
}
