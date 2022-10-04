package school.mjc.stage0.loops.task2;

public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive) {
        int n = 0;
        int x;
        if (multiplyByAndToInclusive > 0) {
            x = multiplyByAndToInclusive * multiplyByAndToInclusive;
            while (n <= x) {
                System.out.println(n);
                n += multiplyByAndToInclusive;
            }
        } else {
            x = multiplyByAndToInclusive * -multiplyByAndToInclusive;
            while (n >= x) {
                System.out.println(n);
                n += multiplyByAndToInclusive;
            }
        }
    }
}
