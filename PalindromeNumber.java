class Solution {
    public boolean isPalindrome(int x) {
        String strNumber = Integer.toString(x);
         if(x<0)
        {
            return false;
        }
        for (int i = 0; i < strNumber.length() / 2; i++) {
            if (strNumber.charAt(i) != strNumber.charAt(strNumber.length() - 1 - i)) {
                return false;
            }
        }

        return true;
    }
}