class Solution {
    public int strStr(String haystack, String needle) {
        if (haystack.length() <= 0 || needle.length() > 10000){
            return -1;
        }

        return haystack.indexOf(needle);
    }
}