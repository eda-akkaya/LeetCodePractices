class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        // empty array
        if (strs == null){
            return "";
        }
        
        // sort the array
        Arrays.sort(strs);

        String first = strs[0];
        String last = strs[strs.length-1];

        int len = 0;

        if (first.length() <= last.length()){
            len = first.length();
        }else{
            len = last.length();
        }

        String common = "";

        for (int i=0; i<len; i++){
            if (first.charAt(i) == last.charAt(i)){
                common += first.charAt(i); 
            }else{
                break;
            }

        }
    return common;

    }
}