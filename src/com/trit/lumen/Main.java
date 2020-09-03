package com.trit.lumen;

public class Main {

    public static final int MIN = -100;
    public static final int MAX = 100;
    public static final int PRODUCT = 900;
    public static final int SOM = 100;

    public static void main(String[] args) {

        for (int b = MIN; b <= MAX; b++) {
            if (isGelijk(f(b),g(b))) {

                float som = f(b) + b;
                float  product = f(b) * b;

                drukWaardenAf(b, som, product);

            }
        }

    }

    private static void drukWaardenAf(int b, float som, float product) {
        System.out.println("--------------------------");
        System.out.println("a = " + f(b));
        System.out.println("b = " + (float) b);
        System.out.println("som = " + som);
        System.out.println("product = " + product);
        System.out.println("--------------------------");
    }

    private static boolean isGelijk(float f, float g) {
        if (Float.compare(f,g) == 0) {
            return true;
        }

        return false;
    }

    private static float g(float b) {
        return SOM - b;
    }

    private static float f(float b) {
        if (b == 0) {
            return 0;
        }
        return PRODUCT / b;
    }
}
