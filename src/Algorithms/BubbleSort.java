package Algorithms;

public class BubbleSort {
    void bubbleSort(int[] arr)
        {
            int n = arr.length;
            for (int i = 0; i < n-1; i++)
                for (int j = 0; j < n-i-1; j++)
                    if (arr[j] > arr[j+1])
                    {
                        // swapping order of arr
                        int temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;
                    }
        }

        // print the array
        void printArray(int[] arr)
        {
            int n = arr.length;
            for (int j : arr) System.out.print(j + " ");
            System.out.println();
        }

        public static void main(String[] args)
        {
            BubbleSort ob = new BubbleSort();
            int[] arr = {21, 37, 17, 2, 97, 11, 50};
            ob.bubbleSort(arr);
            System.out.println("Sorted array");
            ob.printArray(arr);
        }
    }
