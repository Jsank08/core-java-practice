package com.jsank.corejavapractice.DSA;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class TwoSum {

    public static int[] twoSum(int[] nums, int target){

        int[] indexes = new int[2];

//        for (int i = 1; i < nums.length; i++){
//
//            for (int j = 0; j < i; j++){
//                if(nums[j] + nums[i] == target){
//                    indexes[0] = j;
//                    indexes[1] = i;
//                }
//            }
//        }

        Map<Integer ,Integer> map = new HashMap<>();

        for (int i = 1; i < nums.length; i++) {
            int remain = target - nums[i];

            if (map.containsKey(remain)){
                indexes[0] = map.get(remain);
                 indexes[1] = i;
            }

            map.put(nums[i], i);
        }

        return indexes;
    };

    public static int[] meanderingArray(int[] nums){

        Arrays.sort(nums);

        int left = 0, right = nums.length - 1;
        int idx = 0;

        int[] result = new int[nums.length];

        while (left <= right) {
            if (left != right) {
                if (idx < result.length) result[idx++] = nums[right--];
                if (idx < result.length) result[idx++] = nums[left++];
            } else {
                result[idx++] = nums[left];
                break;
            }
        }

        return result;
    }


    public static void main(String[] args) {
        int[] nums = {3, 2, 4, 11, 15};
        int target = 6;

        int[] Input = {1, 2, 3, 4, 5};
//        int[] Output = {5, 1, 4, 2, 3};

        System.out.println("two sum: " + Arrays.toString(twoSum(nums, target)));

//        System.out.println("Meandering array : " + Arrays.toString(meanderingArray(Input)));
    }
}
