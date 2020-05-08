/*
You are given an array coordinates, coordinates[i] = [x, y], where [x, y] represents the coordinate of a point. Check if these points make a straight line in the XY plane.

 

 

Example 1:



Input: coordinates = [[1,2],[2,3],[3,4],[4,5],[5,6],[6,7]]
Output: true
Example 2:



Input: coordinates = [[1,1],[2,2],[3,4],[4,5],[5,6],[7,7]]
Output: false
 

Constraints:

2 <= coordinates.length <= 1000
coordinates[i].length == 2
-10^4 <= coordinates[i][0], coordinates[i][1] <= 10^4
coordinates contains no duplicate point.

*/

class Solution {
    public boolean checkStraightLine(int[][] c) {
        if(c.length == 0 || c.length == 1 || c.length==2)
            return true;
        
        int y2 = c[1][1];
        int y1 = c[0][1];
        int x2 = c[1][0]; 
        int x1 = c[0][0];
       
        int dx = x2 - x1; 
        int dy = y2-y1; 
        
        for(int i=2; i<c.length; i++)
        {
             int y3 = c[i][1];
             int x3 = c[i][0];
            if(dy * (x3-x1) != dx * (y3-y1))
                return false;
        }
            
        return true;
    }
}
