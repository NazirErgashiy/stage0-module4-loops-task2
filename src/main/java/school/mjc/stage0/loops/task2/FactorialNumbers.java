package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        long result = 1;
        System.out.println("1");
        for (int i = 1; i <= printToInclusive; i++) {
            result *= i;
            System.out.println(result);
        }
    }
}
