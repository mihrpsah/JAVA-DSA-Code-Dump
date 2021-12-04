package com.rcb;

public class Checkifarrayissorted {
    public static void main(String[] args) {
        int[] arr = {1,2,4,5};
        System.out.println(check(arr, 0));
    }
  static boolean check(int[] arr, int first){
        if(first== arr.length-1){
            return true;
        }

            return arr[first]<arr[first+1] && check(arr, first+1);
}}
