public class Car extends Vehicle {

    String name;
    int wheels = 4;
    int doors = 4;

    Car(){}
    Car(String name){
        this.name = name;
    }
    Car(String make,String model,int year){
        this.make = make;
        this.model = model;
        this.year = year;

    }
    String make = "Chevrolet";
    String model = "Corvette";
    int year = 2020;
    String color = "blue";
    double prize = 50000.0;

    void drive(){
        System.out.println("you drive a car");
    }

    void brake(){
        System.out.println("you stopped the car");
    }

    public String toString(){
        //String myString = make+"\n"+model+"\n"+color+"\n"+year+"\n";
        //return myString;
        return make+"\n"+model+"\n"+color+"\n"+year+"\n";
    }

    public void go(){
        System.out.println("The car beginning moving");
    }
}
