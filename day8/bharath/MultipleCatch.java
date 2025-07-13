package com.day8.bharath;

public class MultipleCatch {
    public static void main(String[] args) {
        try {
           // int a = 5 / 0;
            int[] arr = new int[2];
            arr[5] = 100;
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Error: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("General Error: " + e.getMessage());
        }
    }
}
