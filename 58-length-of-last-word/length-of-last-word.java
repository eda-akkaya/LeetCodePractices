class Solution {
    public int lengthOfLastWord(String s) {
        String regex = " ";
        
        // delete spaces from start and end
        // string to array
         String[] arr = s.trim().split(regex);

        // return last elements length
        String lastEl = arr[arr.length - 1];
        return lastEl.length();

    }
}