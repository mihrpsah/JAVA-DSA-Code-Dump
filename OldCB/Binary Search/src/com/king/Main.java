package com.king;

public class Main {

    public static void main(String[] args) {
        int[] arr = {69, 42, 41, 35, 32, 24, 22, 21, 15, 11, 5, 2, 1};
        int tar = 41;
        int ans = bse(arr, tar);
        System.out.println(ans);
    }

    static int bse(int[] arr, int tar) {
        int start = 0;
        int end = arr[arr.length] - 1;

        //checking order
        boolean check = arr[start] < arr[end];

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (arr[mid] == tar) {
                return mid;
            }
            if (check) {
                if (tar < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }

            } else {
                if (tar > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;


    }
}


