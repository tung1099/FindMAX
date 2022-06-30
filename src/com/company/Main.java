package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        int[] arr = {1,3,2,5,77,3,55};
//        int max = arr[0];
//        for (int i = 0; i < arr.length; i++) {
//            if (max < arr[i])
//                max = arr[i];
//        }
//        System.out.println(max);

        Scanner scanner = new Scanner(System.in);
        int num;
        System.out.println("Enter a size: ");
        num = scanner.nextInt();
        int newArr[] = new int[num];
        for (int i = 0; i < num; i++) {
            System.out.println("Enter element " + (i+1) + ": " );
            newArr[i] = scanner.nextInt();
        }
        System.out.println("Property list: ");
        for (int i = 0; i < newArr.length; i++) {
            System.out.println(newArr[i] + " ");
        }
        int max1 = newArr[0];
        int index = 1;
        for (int i = 0; i < newArr.length; i++) {
            if (newArr[i] > max1){
                max1 = newArr[i];
                index = i + 1;
            }
        }
        System.out.println("The largest property value in the list is " + max1 + " ,at position " + index);
    }
}
