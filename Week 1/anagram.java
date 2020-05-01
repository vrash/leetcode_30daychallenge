/*
Given an array of strings, group anagrams together.

Example:

Input: ["eat", "tea", "tan", "ate", "nat", "bat"],
Output:
[
  ["ate","eat","tea"],
  ["nat","tan"],
  ["bat"]
]
Note:

All inputs will be in lowercase.
The order of your output does not matter.*/


class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<String, List<String>>();
        for(String s: strs)
        {
            char[] arr = s.toCharArray();
            Arrays.sort(arr);
            String sortedStr = String.valueOf(arr);
            if(!map.containsKey(sortedStr))
            {
                map.put(sortedStr, new ArrayList<String>());
            }
            map.get(sortedStr).add(s);
        }
        return new ArrayList<>(map.values());
    }
}
