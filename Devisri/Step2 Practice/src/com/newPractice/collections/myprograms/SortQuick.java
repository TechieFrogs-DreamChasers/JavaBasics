package com.newPractice.collections.myprograms;

import java.util.Arrays;
import java.util.Random;

public class SortQuick {
    public static void main(String[] args) {
        Random r = new Random();
        int[] numbers = new int[10];
        for(int i=0;i<numbers.length;i++){
            numbers[i] = r.nextInt(100);
        }
        System.out.println("Before: "+Arrays.toString(numbers));
        sortQuickly(numbers,0, numbers.length-1);
        System.out.println("After: "+Arrays.toString(numbers));
    }
    public static void sortQuickly(int[] numbers,int prev,int next){
        if(prev >= next)
            return;
        int pivot = numbers[next];
        int left = prev;
        int right = next;
        while (left < right){
            while (numbers[left] <= pivot && left < right ){
                left++;
            }
            while (numbers[right] >= pivot && left < right ){
                right--;
            }
            swap(numbers,left,right);
        }
        swap(numbers,left,next);
        sortQuickly(numbers,prev,left-1);
        sortQuickly(numbers,left+1,next);
    }
    private static void swap (int[] numbers,int index1,int index2){
        int temp = numbers[index1];
        numbers[index1] = numbers[index2];
        numbers[index2] = temp;
    }
}
