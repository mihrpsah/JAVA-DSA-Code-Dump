package com.rcb;

import java.util.ArrayList;

public class Linearsearchrecursionmultipleoccurence {
    public static void main(String[] args) {
        int[] arr = {69,64,7,4,4,42,69,69,49};
        int target = 69;

    }
    ArrayList<Integer> list = new ArrayList<>();

    public ArrayList search(int[] arr, int target, int index, ArrayList list){
        if(index == arr.length){
            return list;
        }
        if(arr[index]==target){
            list.add(index);
        }
         return search(arr, target, index+1, list);
    }
}
