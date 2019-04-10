/*
Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

Example:

Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].
*/

// assume the list of numbers are already sorted.
class Solution {
    public int[] twoSum(int[] nums, int target) {
        // array named ret that has 2 element 
        int[] ret = new int[2];
        // hashmap with two integers 
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0, length = nums.length; i < length; i++) {
            if (hashMap.containsKey(target - nums[i])) { 
                ret[0] = hashMap.get(target - nums[i]); 
                ret[1] = i;
                break;
            }
            hashMap.put(nums[i], i);
        }
        return ret;
    }
}