/*

Given a string, find the first non-repeating character in it and return it's index. If it doesn't exist, return -1.

Examples:

s = "leetcode"
return 0.

s = "loveleetcode",
return 2.
Note: You may assume the string contain only lowercase letters. 
*/



class Solution {
    public int firstUniqChar(String s) {
        
        if(s.length()==0)
                  return -1;
        
        HashMap<Character, Integer> map = new HashMap<>();
        
        for(int i=0; i<s.length(); i++)
        {
            char c = s.charAt(i);
            if(!map.containsKey(c))
            {
                map.put(c,i);
            }
            else
                map.put(c,Integer.MAX_VALUE);
        }
        
        int ans = Collections.min(map.values());
        return ans == Integer.MAX_VALUE? -1: ans;
    }
}
