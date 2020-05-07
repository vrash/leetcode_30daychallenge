/*

Given an array of size n, find the majority element. The majority element is the element that appears more than ⌊ n/2 ⌋ times.

You may assume that the array is non-empty and the majority element always exist in the array.

Example 1:

Input: [3,2,3]
Output: 3
Example 2:

Input: [2,2,1,1,1,2,2]
Output: 2

*/

class Solution {
    public int majorityElement(int[] nums) { 
        if (nums.length==0)
            return 0;
        else if(nums.length == 1)
            return nums[0];
        HashMap<Integer, Integer> map = new HashMap<>();
        int ans = 0;
        int l = nums.length;
        for(int i: nums)
        {
            if(map.containsKey(i))
            {
                map.put(i,map.get(i)+1);
                if(map.get(i) > l/2)
                {
                        ans = i; 
                        break;
                }
    
            }
            else
                map.put(i,1);
        }
        return ans;
    }
}
