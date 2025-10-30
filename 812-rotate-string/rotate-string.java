class Solution {
    public boolean rotateString(String s, String goal) {
        // concatanate s with itself and search for goal
        s.toLowerCase();
        goal.toLowerCase();

        // size check -> they must have the same length
        if (s.length() != goal.length()){
            return false;
        }
       
        // double_s : abcd + abcd -> abcdabcd
        String double_s = s.concat(s) ;

        return double_s.contains(goal);

    }
}