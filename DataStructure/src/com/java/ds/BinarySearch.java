package com.java.ds;

public class BinarySearch {

	public static void main(String[] args) {
        int arr[] = {1, 5, 6, 9, 10, 12, 14, 16, 20};
        int ans = binarySearch(arr, 0, 9, 10);

        if(ans == -1)
            System.out.println("Key not found");
        else
            System.out.println("Key found at position " + (ans));
    }
    static int binarySearch(int[] array, int left, int right, int key) {
        if (left > right) {
            return -1;
        }

        int mid = (left + right) / 2;

        if (array[mid] == key) {
            return mid;
        }

        if (array[mid] > key) {
            return binarySearch(array, left, mid - 1, key);
        }

        return binarySearch(array, mid + 1, right, key);
    }

}
