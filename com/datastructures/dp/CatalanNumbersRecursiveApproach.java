package com.com.datastructures.dp;

public class CatalanNumbersRecursiveApproach {

    private static int nthCatalan(int n) {
        int res = 0;

        if (n <= 1) {
            return 1;
        }
        for (int i = 0; i < n; i++) {
            res += nthCatalan(i) * nthCatalan(n - i - 1);
        }
        return res;
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println("Nth catalan number :" + nthCatalan(n));
    }
}
