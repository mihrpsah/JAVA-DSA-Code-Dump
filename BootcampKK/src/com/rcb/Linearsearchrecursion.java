package com.rcb;

public class Linearsearchrecursion {
    public static void main(String[] args) {
        int[] arr = {69,42,36,49,999};
        int target = 69;

        System.out.println( search(arr,target,0));
    }
    static boolean search(int[] arr, int target, int index){
       if(index==arr.length-1){
           return false;
       }
       return target==arr[index] || search(arr, target, index+1);
    }
}
