package com.groupqa1.homework2;

public class Main {
    public static void main(String[] arg) {
        variable(1, 5);
        difference_reverse(300);
        difference2(571);
        weight(5);
        deposit_profit(10000, 18, 12);
    }

    public static void variable (int a, int b) {
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("a = " + a + "; b = " + b);
    }

    public static void difference_reverse (int n){
        int n_orig = n;
        int [] a;
        a = new int[5];
        int i = 0;
        while (n / 10 > 0){
            a[i] = n % 10;
            n = Math.abs (n / 10);
            i++;
        }
        a[i] = n;

        int sum = 0;
        int k = 0;
        for (int j = i; j >= 0; j--) {
            if (j == 0) {
                sum += a[k];
            } else {
                sum+=a[k] * Math.pow(10, j);
            }
            k++;
        }
        System.out.println(n_orig - sum);
        }
        
    public static void difference2 (int d) {
        int d_init = d;
        int number_reverse1 = d % 10 * 100;
        d /= 10;
        int number_reverse2 = d % 10 * 10;
        d /= 10;
        int number_reverse = number_reverse1 + number_reverse2 + d;
        d = d_init - number_reverse;
        System.out.println(d);
    }

    public static void weight (int pound) {
        float kg = pound * 453.6f / 1000;
        float gramm = kg - (int)kg;
        kg = (int) kg;
        System.out.println(pound + " pound = " + kg + " kg " + gramm + " g");
    }

    public static void deposit_profit (int sum, int period, float percent) {
        float deposit_profit = percent / 100 / 12.0f * period * sum;
        deposit_profit = (int)deposit_profit;
        System.out.println("deposit summ = " + sum + "; period month = " + period + "; annual percent = "
                            + percent + "%; " + "deposit profit = " + deposit_profit);

    }
}
