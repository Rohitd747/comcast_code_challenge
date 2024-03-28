package com.tek.systems;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15};
        int target = 9;

        int[] result = calcAndFindTargetValIndexes(arr, target);
        System.out.println("[" + result[0] + ", " +  result[1] + "]");
    }

    private static int[] calcAndFindTargetValIndexes(int[] arr, int target) {
        int startIndx = 0;
        int endIndx = arr.length - 1;

        while(startIndx < endIndx) {
            int sum = arr[startIndx] + arr[endIndx];

            if(sum == target) {
                break;
            } else if(sum < target) {
                startIndx++;
            } else {
                endIndx--;
            }
        }
        int[] result = new int[] {startIndx + 1, endIndx + 1};
        return result;
    }
}
