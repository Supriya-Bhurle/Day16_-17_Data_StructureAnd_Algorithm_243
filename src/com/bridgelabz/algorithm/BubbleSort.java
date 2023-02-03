package com.bridgelabz.algorithm;

public class BubbleSort {

    //Bubble sort :-  that works by repeatedly swapping the adjacent elements if they are in the wrong order.
    void bubbleSort(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (arr[j] > arr[j + 1]) {
                    // swap arr[j+1] and arr[j]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
    }

    /* Prints the array */
    void printArray(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void main(String[] args) {

        {
            int array[] = {88,44,55,66,76,86,90 };
            BubbleSort obj = new BubbleSort();
            System.out.println("Before sorting");
            for (int elements : array) {
                System.out.print(elements + " ");
            }
            System.out.println();

            obj.bubbleSort(array);
            System.out.println("after sorting");
            //print array elements
            for (int elements : array) {
                System.out.print(elements + " ");
            }

        }

    }}

