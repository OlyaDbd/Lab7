package com.bsu;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the size of array: ");
            int size = scanner.nextInt();
            ArrayList<Integer> array = new ArrayList<Integer>();
            for (int i = 0; i < size; i++) {
                array.add((int) (Math.random()*1000));
            }
            System.out.println("Random array: ");
            for (int num : array) {
                System.out.print(num + " ");
            }
            System.out.println("\nEnter your request:\n" +
                    "1 - sort the array in increasing order\n" +
                    "2 - sort the array in decreasing order\n" +
                    "3 - sort the array in increasing order by number of digits\n" +
                    "4 - sort the array in decreasing order by number of digits");
            int sortType = scanner.nextInt();
            Thread first = new Thread(new Sort(array, sortType));
            first.start();
            first.join();
            System.out.println(array);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
