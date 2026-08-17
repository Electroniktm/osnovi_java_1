package org.example;

public class Main {
    public static void main(String[] args) {
        int a = 7;
        int b = 9;
        double c = 5.0;
        double d = 8.0;
        int maxInteger = Integer.MAX_VALUE;

        // 0) Арифметические операции над двумя int
        System.out.println(a + b);
        System.out.println(b - a);
        System.out.println(b / a);
        System.out.println(a * b);

        // 1) Арифметические операции над int и double
        System.out.println(c * b);
        System.out.println(d / a);
        System.out.println(a + c);
        System.out.println(b - d);

        // 2) Логические операции (<, >, >=, <=)
        if (a > b) {
            System.out.println(a);
        } else {
            System.out.println(b);
        }
        if (c <= d) {
            System.out.println(c);
        } else {
            System.out.println(d);
        }
        System.out.println(a >= b);
        System.out.println(a < b);

        // 3) Диапазоны float/double
        System.out.println(Float.MIN_VALUE);
        System.out.println(Float.MAX_VALUE);
        System.out.println(Double.MIN_VALUE);
        System.out.println(Double.MAX_VALUE);

        // 4) Переполнение
        System.out.println(maxInteger + 1);
    }
}
