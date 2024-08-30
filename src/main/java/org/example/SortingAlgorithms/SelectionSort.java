package org.example.SortingAlgorithms;


public class SelectionSort {

    public void sort(int[] numbers){

        for (int i = 0; i < numbers.length-1; i++) {
            int min = i;

            for(int j = i+1; j < numbers.length; j++){

                if(numbers[j] < numbers[min]) min = j;
            }

            if(min != i){
                int temp = numbers[min];
                numbers[min] = numbers[i];
                numbers[i] = temp;
            }
        }
    }
}
