package com.example._1_int;

import java.util.Arrays;

public class IntTest {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(countBits(7)));
    }


    public static int divide(int x, int y) {
        if (x == Integer.MIN_VALUE && y == -1) {
            return Integer.MAX_VALUE;
        }
        int neg = 2;
        if (x > 0) {
            neg--;
            x = -x;
        }
        if (y > 0) {
            neg--;
            y = -y;
        }
        int res = divideCore(x, y);
        return neg == 1 ? -res : res;
    }

    public static int divideCore(int x, int y) {
        int result = 0;
        while (x <= y) {
            int val = y;
            int q = 1;
            while (val >= Integer.MIN_VALUE >> 1 && x <= val << 1) {
                q = q << 1;
                val = val << 1;
            }
            result += q;
            x -= val;
        }
        return result;
    }

    public static String addBinary(String x, String y) {


        StringBuilder res = new StringBuilder();
        int n = 0;
        int i = x.length() - 1;
        int j = y.length() - 1;
        while (i >= 0 || j >= 0) {
            int a = i < 0 ? 0 : (x.charAt(i) == '1' ? 1 : 0);
            int b = j < 0 ? 0 : (y.charAt(j) == '1' ? 1 : 0);
            int sum = a + b + n;
            if (sum >= 2) {
                sum -= 2;
                n = 1;
            } else {
                n = 0;
            }
            res.append(sum);
            i--;
            j--;
        }
        return res.reverse().toString();
    }

    public static int[] countBits(int num) {
        int[] res = new int[num + 1];
//        for (int i = 0; i <= num; i++) {
//            int j = i;
//            while (j != 0) {
//                res[i]++;
//                j &= (j - 1);
//            }
//        }
//        return res;


//        for (int i = 1; i <= num; i++) {
//            res[i] = res[i & (i - 1)] + 1;
//        }

        for (int i = 1; i <= num; i++) {
            res[i] = res[i >> 1] + (i & 1);
        }
        return res;
    }


}
