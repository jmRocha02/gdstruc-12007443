package com.miguelrocha;

import java.util.Random;

public class Main {

    public static void main(String[] args)
    {
        int[] numbers = new int[10];
        putRandomIntArr(numbers);

        System.out.println("Before Sorting: ");
        printArrayInt(numbers);

        //DescendingSelectionSort(numbers);
        descendingSelectionSort(numbers);
        System.out.println("Descending Sorting: ");
        printArrayInt(numbers);

        //bubbleSort(numbers);
        selectionSort(numbers);
        System.out.println("Ascending Sorting: ");
        printArrayInt(numbers);


    }

    private static void printArrayInt(int [] arr)
    {
        for (int j:arr)
        {
            System.out.println(j);
        }
    }

    private static void bubbleSort(int[] arr)
    {
        for (int lastSortedIndex = arr.length -1; lastSortedIndex >0; lastSortedIndex--)
        {
            for (int i=0; i< lastSortedIndex; i++)
            {
                if(arr[i]>arr[i+1])
                {
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
        }
    }

    private static void descendingBubbleSort(int[] arr)
    {
        for (int lastSortedIndex = arr.length -1; lastSortedIndex >0; lastSortedIndex--)
        {
            for (int i=0; i< lastSortedIndex; i++)
            {
                if(arr[i] < arr[i+1])
                {
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
        }
    }

    private static void putRandomIntArr(int[] arr)
    {
        Random rand = new Random();
        for(int l = 0; l < arr.length; l++)
        {
            arr[l] = rand.nextInt(100);
        }

    }

    private static void selectionSort(int[] arr)
    {
        for (int lastSortedIndex = arr.length -1; lastSortedIndex >0; lastSortedIndex--)
        {
            int largestIndex = 0;
            for(int i = 1; i <= lastSortedIndex; i++)
            {
                if(arr[i] >arr[largestIndex])
                {
                    largestIndex = i;

                }
            }

            int temp = arr[lastSortedIndex];
            arr[lastSortedIndex] = arr[largestIndex];
            arr[largestIndex] = temp;
        }
    }

    private static void DescendingSelectionSort(int[] arr)
    {
        for (int lastSortedIndex = arr.length -1; lastSortedIndex >0; lastSortedIndex--)
        {
            int largestIndex = 0;
            for(int i = 1; i <= lastSortedIndex; i++)
            {
                if(arr[i] < arr[largestIndex])
                {
                    largestIndex = i;
                }
            }

            int temp = arr[lastSortedIndex];
            arr[lastSortedIndex] = arr[largestIndex];
            arr[largestIndex] = temp;
        }
    }

    private static void descendingSelectionSort(int[] arr)
    {
        for (int lastSortedIndex = arr.length -1; lastSortedIndex >0; lastSortedIndex--)
        {
            int smallestIndex = 0;
            for(int i = 1; i <= lastSortedIndex; i++)
            {
                if(arr[i] < arr[smallestIndex])
                {
                    smallestIndex = i;

                }
            }

            int temp = arr[lastSortedIndex];
            arr[lastSortedIndex] = arr[smallestIndex];
            arr[smallestIndex] = temp;
        }
    }
}


