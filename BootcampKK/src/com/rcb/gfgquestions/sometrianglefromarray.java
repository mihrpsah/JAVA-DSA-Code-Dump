package com.rcb.gfgquestions;

import java.util.Arrays;

public class sometrianglefromarray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        tri(arr);
    }
   static void tri(int[] nums){
        if(nums.length<1){

            return;
        }
        int[] neww = new int[nums.length-1];
        for(int i = 0; i<neww.length; i++){
            neww[i] = nums[i]+ nums[i+1];
        }
        tri(neww);
       System.out.println(Arrays.toString(neww));
   }
}
