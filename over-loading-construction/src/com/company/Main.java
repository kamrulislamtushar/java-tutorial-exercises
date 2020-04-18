package com.company;

public class Main {

    public static void main(String[] args) {
        int weight = 8;
        float density = 2.3F;
        String name = "Donald";
        long[] feathers = { 1,2,3,4,5,6,7,8,9};
        boolean canFly = true;
        int airspeed = 22;

        Duck[] d = new Duck[7];
        d[0] = new Duck(density, weight);
        d[1] = new Duck(name, feathers);
        d[2] = new Duck(canFly);
        d[3] = new Duck(density, airspeed);
        d[4] = new Duck(false);
        d[5] = new Duck(airspeed, density);
        d[6] = new Duck();
    }
}
