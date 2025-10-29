class Solution {
    public void reverseString(char[] s) {
        // swap

        final int MIN_LENGTH = 1;
        final int MAX_LENGTH = 100000;

        if (s== null || s.length < MIN_LENGTH || s.length > MAX_LENGTH)
            throw new IllegalArgumentException();


        int left = 0;
        int right = s.length -1;

        while (left < right){
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;

            left++ ;
            right-- ;
        }
    }
}