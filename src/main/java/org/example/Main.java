package org.example;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Porshe","911",1986);
        Car car2 = new Car("Ferrari","512", 1992);
        Car car3 = new Car("","",0);

        System.out.println(car1);
        System.out.println(car2);
        System.out.println();
        //this will only copy the memory address - car 2 is the same object as car 1
        car2 = car1;
        //this is the correct way
        car3.copy(car1);

        System.out.println(car1);
        System.out.println(car2);
        System.out.println();
        System.out.println(car1.getMake());
        System.out.println(car1.getModel());
        System.out.println(car1.getYear());
        System.out.println();
        System.out.println(car2.getMake());
        System.out.println(car2.getModel());
        System.out.println(car2.getYear());
        System.out.println();
        System.out.println(car3.getMake());
        System.out.println(car3.getModel());
        System.out.println(car3.getYear());

        car2.setYear(2000); //we only change car2 year, but since car2 and car1 have the same addres we will change both
        car3.setYear(2010);
        System.out.println("___that's why we don't use car2 = car1___________");
        System.out.println("car 1 year " + car1.getYear() + " but we changed only car 1 year!");
        System.out.println("car 2 year " + car2.getYear());
        System.out.println("car 3 year " + car3.getYear() + " - here it works fine");

        //here we can copy the arguments of one car at the time of instantiating the new car object - by using
        //copy contructor in Car class

        Car car4 = new Car(car3);

        System.out.println(car4.getMake());
        System.out.println(car4.getModel());
        System.out.println(car4.getYear());

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
        System.out.println(car4);


    }
}