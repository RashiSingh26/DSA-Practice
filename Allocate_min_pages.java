import java.util.*;

class Solution {
    public int findPages(int[] arr, int k) {
        int n = arr.length;

        if (n < k) return -1;

        int low = 0, high = 0;

        for (int i = 0; i < n; i++) {
            low = Math.max(low, arr[i]); 
            high += arr[i];              
        }

        int res = -1;

        while (low <= high) {
            int guess = (low + high) / 2;

            if (fun(arr, n, guess, k)) {
                res = guess;
                high = guess - 1;
            } else {
                low = guess + 1;
            }
        }

        return res;
    }

    public boolean fun(int[] arr, int n, int limit, int k) {
        int students = 1;
        int pages = 0;

        for (int i = 0; i < n; i++) {
            if (pages + arr[i] <= limit) {
                pages += arr[i];
            } else {
                students++;
                pages = arr[i];

                if (students > k) {
                    return false;
                }
            }
        }

        return true;
    }
}
