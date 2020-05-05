/*

Given an arbitrary ransom note string and another string containing letters from all the magazines, write a function that will return true if the ransom note can be constructed from the magazines ; otherwise, it will return false.

Each letter in the magazine string can only be used once in your ransom note.

Note:
You may assume that both strings contain only lowercase letters.

canConstruct("a", "b") -> false
canConstruct("aa", "ab") -> false
canConstruct("aa", "aab") -> true

*/

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        boolean ret = true;
        HashMap<Character,Integer> mag = new HashMap<Character,Integer>();
        for(char c: magazine.toCharArray())
        {
            if(mag.containsKey(c))
                mag.put(c,mag.get(c)+1);
            else
                mag.put(c,1);
        }
        for(char c: ransomNote.toCharArray())
        {
            if(mag.containsKey(c) && mag.get(c)>0)
                mag.put(c,mag.get(c)-1);
            else
                ret = false;
        }
        
        return ret; 
    }
}
