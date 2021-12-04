package com.rcb;

public class SelectionSortRecursion {
    public static void main(String[] args) {
        int[] arr = {4,3,2,1};
        int i = 0;
        int j = arr.length;

        sort(arr, i, j);
        System.out.println(arr);
    }
    static int[] sort(int[] arr, int i, int j){
        while(j>0){
      int mindex = i;
      for(int n= i +1 ; n<arr.length; n++ ){
          if(arr[n]<arr[mindex]){
              mindex = n;
          }
      }
      swap(arr, i, mindex);
      j--;
      sort(arr, i+1, j);
        return arr;}
        return arr;
    }
    static int[] swap(int[] arr, int first, int second ){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp ;
        return arr;
    }
}
