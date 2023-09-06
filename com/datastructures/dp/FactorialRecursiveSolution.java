package com.com.datastructures.dp;

import java.util.Scanner;

public class FactorialRecursiveSolution {
    public static void main(String[] args) {
        System.out.println("Given n find factorial of n");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter n :");
        int n = scan.nextInt();
        int ans = n * fact(n - 1);
        System.out.println("Factorial =" + ans);
    }

    public static int fact(int n) {
        int ans ;
        if (n == 0 || n == 1)
            return 1;
        else
            ans = n * fact(n - 1);
        return ans;
    }
}
