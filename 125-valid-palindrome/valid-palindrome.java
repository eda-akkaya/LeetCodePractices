class Solution {
    public boolean isPalindrome(String s) {
        // remove spaces from start and finish, then convert into lowercase
        String newS = s.trim();
        // remove punc and spaces
        newS = newS.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        // convert to char array
        char[] letters = newS.toCharArray();
        //check palindrome
        if (newS == ""){return true;}
        

        int i=0;
        while (i < newS.length() / 2 ){
            if (letters[i] == letters[newS.length()-1-i]){
                i++;
            }else{
                return false;
            }
            
        }
        return true;
    }
}