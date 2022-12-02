package com.yanhuo5;


public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {12,56,89,99,100,150,160};
        System.out.println(re(arr, 12));
    }
    public static int re(int[] arr,int x){
        int left = 0;
        int right = arr.length-1;
        if (x > arr[arr.length-1]){
            return -arr.length;
        }else {
            while (left<=right){
                int mid = (left + right) / 2;
                if (x > arr[mid]){
                    left = mid+1;
                }else if (x < arr[mid]){
                    right = mid-1;
                }else {
                    return mid;
                }
            }
        }
        return x;
    }
}
