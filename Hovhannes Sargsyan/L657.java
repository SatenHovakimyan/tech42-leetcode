class Solution {
    public boolean judgeCircle(String moves) {
        int l = 0, d = 0,u = 0,r = 0;
        for(int i=0;i<moves.length();i++) {
            if(moves.charAt(i)=='L') l++;
            else if(moves.charAt(i)=='R') r++;
            else if(moves.charAt(i) == 'D') d++;
            else if(moves.charAt(i) == 'U') u++;
        }
        if(l ==  r && u == d) return true;
        return false;
    }
}
