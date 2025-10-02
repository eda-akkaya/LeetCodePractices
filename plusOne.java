class Solution {
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {      // 9 değilse
                digits[i]++;          // 1 ekle
                return digits;        // iş bitti
            }
            digits[i] = 0;            // 9 ise sıfırla ve eldeyi sola taşı
        }

        // buraya geldiysek tüm basamaklar 9 dur
        int[] result = new int[digits.length + 1];
        result[0] = 1;                // [1, 0, 0, ... , 0]
        return result;
    }
}
