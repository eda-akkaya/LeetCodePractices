class Solution {
    public int lengthOfLastWord(String s) {
        // delete spaces from start and end
        String newS = s.trim();

        String regex = " ";
        // string to array
        String[] arr = newS.split(regex);
        // return last elements length
        String lastEl = arr[arr.length - 1];
        return lastEl.length();

    }
}