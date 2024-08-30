package org.example;

import org.example.SortingAlgorithms.SelectionSort;

import java.util.Arrays;

public class Main {

    public  static int[] sortedArray(int[] nums){
        int[] sortedNums = new int[nums.length];

        for(int i = 0; i < nums.length; i++){
            sortedNums[i] = nums[i];
            for(int k = i; k > 0;  k--){
                if(sortedNums[k] < sortedNums[k-1]){
                    int biggerNumber = sortedNums[k-1];
                    int smallerNumber = sortedNums[k];
                    sortedNums[k] = biggerNumber;
                    sortedNums[k-1] = smallerNumber;
                }
            }

        }
        return sortedNums;
    }
    public static void main(String[] args) {
        System.out.println("Hello world!");
        SelectionSort selectionSort = new SelectionSort();
        int[] array = {9, 4, 3};
        selectionSort.sort(array);
        System.out.println(Arrays.toString(array));
    }
}