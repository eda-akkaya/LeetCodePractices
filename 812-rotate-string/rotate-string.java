class Solution {
    public boolean rotateString(String s, String goal) {
        // concatanate s with itself and search for goal
    

        // size check -> they must have the same length
        if (s.length() != goal.length()){
            return false;
        }

        if (s.length() < 1 || goal.length() >= 101){
            return false;
        }
       
        // double_s : abcd + abcd -> abcdabcd
        String double_s = s.concat(s) ;

        return double_s.contains(goal);

    }
}