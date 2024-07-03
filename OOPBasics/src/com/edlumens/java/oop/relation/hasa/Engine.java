package com.edlumens.java.oop.relation.hasa;

//Engine.java
public class Engine {
 private String type;
 private int horsepower;

 public Engine(String type, int horsepower) {
     this.type = type;
     this.horsepower = horsepower;
 }

 public void start() {
     System.out.println("Engine started...");
 }

 public void stop() {
     System.out.println("Engine stopped...");
 }

 // Getters and setters (omitted for brevity)
}
