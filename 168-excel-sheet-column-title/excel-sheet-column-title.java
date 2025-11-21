class Solution {
    public String convertToTitle(int columnNumber) {
        // A:1 AA:27 -> MOD=26
        StringBuilder sb = new StringBuilder();

        while(columnNumber > 0){
            columnNumber--;
            int remainder = columnNumber % 26;
            char letter = (char) (remainder + 'A');

            sb.append(letter);
            columnNumber /= 26;

        }
        return sb.reverse().toString();
    }
}