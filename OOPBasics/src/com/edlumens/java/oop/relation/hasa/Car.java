package com.edlumens.java.oop.relation.hasa;

//Car.java
public class Car {
 private Wheel[] wheels;
 private Steering steering;
 private Engine engine;

 public Car(Wheel[] wheels, Steering steering, Engine engine) {
     this.wheels = wheels;
     this.steering = steering;
     this.engine = engine;
 }

 public void drive() {
     System.out.println("Car is driving...");
 }

 // Getters and setters (omitted for brevity)

 public static void main(String[] args) {
     // Create instances of Wheel, Steering, and Engine
     Wheel[] carWheels = {
         new Wheel("Ceat", 18.5),
         new Wheel("MRF", 18.5),
         new Wheel("Ceat", 18.5),
         new Wheel("Ceat", 18.5)
     };
     Steering carSteering = new Steering("Power steering");
     Engine carEngine = new Engine("V6", 300);

     // Create a Car instance
     Car myCar = new Car(carWheels, carSteering, carEngine);

     // Demonstrate "has-a" relationship
     myCar.drive();
     myCar.engine.start();
     myCar.steering.steer();
     for (Wheel wheel : myCar.wheels) {
         wheel.rotate();
     }
 }
}
