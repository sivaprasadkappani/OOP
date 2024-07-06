package com.edlumens.java.oop.banking;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListCollectionSortExample {
    public static void main(String[] args) {
        // Create an ArrayList of integers
        ArrayList<SavingsAccount> numbers = new ArrayList<>();

        // Add some elements to the ArrayList
        SavingsAccount sa1 = new SavingsAccount( "1252", 354.6, 8.1 );
        SavingsAccount sa2 = new SavingsAccount( "1232", 134.6, 8.1 );
        SavingsAccount sa3 = new SavingsAccount( "1432", 34.6, 8.1 );
        SavingsAccount sa4 = new SavingsAccount( "1232", 314.6, 8.1 );
        SavingsAccount sa5 = new SavingsAccount( "1142", 634.6, 8.1 );
        numbers.add(sa1);
        numbers.add(sa2);
        numbers.add(sa3);
        numbers.add(sa4);
        numbers.add(sa5);

        // Display the ArrayList before sorting
        System.out.println("ArrayList before sorting: " + numbers);

        // Sort the ArrayList using Collections.sort() method
     //  Collections.sort(numbers);
        numbers.sort(null);

        // Display the ArrayList after sorting
        System.out.println("ArrayList after sorting: " + numbers);
    }
}
