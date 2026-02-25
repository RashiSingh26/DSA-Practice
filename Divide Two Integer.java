class Solution {
    public int divide(int dividend, int divisor) {

        // Overflow case
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }

        boolean negative = (dividend < 0) ^ (divisor < 0);

        long dvd = Math.abs((long) dividend);
        long dvs = Math.abs((long) divisor);

        int quotient = 0;

        while (dvd >= dvs) {

            long temp = dvs;
            int multiple = 1;

            while (dvd >= (temp << 1)) {
                temp = temp << 1;//multiple by 2
                multiple = multiple << 1;//quotient * 2
            }

            dvd -= temp;
            quotient += multiple;
        }

        return negative ? -quotient : quotient;
    }
}
