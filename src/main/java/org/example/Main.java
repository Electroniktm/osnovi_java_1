package org.example;

public class Main {
    public static void main(String[] args) {
        int a = 22;
        int b = 43;

        System.out.println("=== 0) Операции над int ===");
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));

        int x = 15;
        double y = 6.5;

        System.out.println("\n=== 1) Операции над int и double ===");
        System.out.println("x + y = " + (x + y));
        System.out.println("x - y = " + (x - y));
        System.out.println("x * y = " + (x * y));
        System.out.println("x / y = " + (x / y));
        System.out.println("x / y * 2 - y + 1 = " + (x / y * 2 - y + 1));

        int m = 9;
        int n = 4;

        System.out.println("\n=== 2) Сравнительные операции ===");
        System.out.println("m <  n  = " + (m < n));
        System.out.println("m >  n  = " + (m > n));
        System.out.println("m >= n  = " + (m >= n));
        System.out.println("m <= n  = " + (m <= n));
        System.out.println("m == n  = " + (m == n));
        System.out.println("m != n  = " + (m != n));

        System.out.println("(m > n) && (m < 10) = " + ((m > n) && (m < 10)));
        System.out.println("(m < n) || (m == 9) = " + ((m < n) || (m == 9)));
        System.out.println("!(m == n)           = " + (!(m == n)));

        System.out.println("\n=== 3) Диапазоны float и double ===");
        System.out.println("float  MIN_VALUE            = " + Float.MIN_VALUE);
        System.out.println("float  MAX_VALUE            = " + Float.MAX_VALUE);
        System.out.println("double MIN_VALUE            = " + Double.MIN_VALUE);
        System.out.println("double MAX_VALUE            = " + Double.MAX_VALUE);
        System.out.println("float  MIN_NORMAL           = " + Float.MIN_NORMAL);
        System.out.println("double MIN_NORMAL         = " + Double.MIN_NORMAL);
        System.out.println("float  POSITIVE_INFINITY    = " + Float.POSITIVE_INFINITY);
        System.out.println("double NEGATIVE_INFINITY  = " + Double.NEGATIVE_INFINITY);
        System.out.println("double NaN                = " + Double.NaN);

        System.out.println("\n=== 4) Переполнение ===");

        int maxInt = Integer.MAX_VALUE;
        System.out.println("Integer.MAX_VALUE          = " + maxInt);
        System.out.println("Integer.MAX_VALUE + 1      = " + (maxInt + 1));
        System.out.println("Integer.MAX_VALUE * 2      = " + (maxInt * 2));

        int minInt = Integer.MIN_VALUE;
        System.out.println("Integer.MIN_VALUE - 1      = " + (minInt - 1));

        long maxLong = Long.MAX_VALUE;
        System.out.println("Long.MAX_VALUE + 1         = " + (maxLong + 1));

        double big = Double.MAX_VALUE;
        System.out.println("Double.MAX_VALUE * 2       = " + (big * 2));
        System.out.println("Double.MAX_VALUE + 1e308   = " + (big + 1e308));

        float bigF = Float.MAX_VALUE;
        System.out.println("Float.MAX_VALUE * 2        = " + (bigF * 2));

        double tiny = Double.MIN_VALUE;
        System.out.println("Double.MIN_VALUE / 1e10    = " + (tiny / 1e10));

        double result = big * 2;
        System.out.println("Double.isInfinite(result)  = " + Double.isInfinite(result));
        System.out.println("Double.isNaN(Double.NaN)   = " + Double.isNaN(Double.NaN));
    }
}
