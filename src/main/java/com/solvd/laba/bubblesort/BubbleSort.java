package com.solvd.laba.bubblesort;

public class BubbleSort {
    public static void main(String[] args) {

        //Checking if the command line input parameters are specified or not
        if (args.length == 0) {
            System.out.println("Please enter the elements to be sorted");
        } else {
            int num = args.length, temp = 0;
            int arr[] = new int[num];

            //Getting the input elements through commandline arguments

            for (int i = 0; i < num; i++) {
                arr[i] = Integer.parseInt(args[i]);
            }

            //Displaying the unsorted elements
            System.out.println("Before Sorting:");
            System.out.println("--------------");
            for (int i = 0; i < num; i++) {
                System.out.print("  " + arr[i]);
            }

            long startTime = System.nanoTime();

            //Sorting elements using Bubble sort algorithm
            for (int i = 0; i < num; i++) {
                for (int j = i + 1; j < num; j++) {
                    if (arr[i] > arr[j]) {
                        temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }

            //Calculating the execution time of Bubble sort
            long endTime = System.nanoTime();
            long executionTime = endTime - startTime;

            //Displaying the sorted elements
            System.out.println("\nAfter Sorting:");
            System.out.println("--------------");
            for (int i = 0; i < num; i++) {
                System.out.print("  " + arr[i]);
            }

            //Displaying the execution time taken for Bubble Sort
            System.out.println("\nExecution Time of Bubble sort: " + executionTime + "ns");
        }
    }
}

