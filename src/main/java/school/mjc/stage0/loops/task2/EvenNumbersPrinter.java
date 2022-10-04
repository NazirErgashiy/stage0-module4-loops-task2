package school.mjc.stage0.loops.task2;

public class EvenNumbersPrinter {
    public void printEvenNumbers(int printTillInclusive) {
        int n = 2;
        while (n <= printTillInclusive) {
            System.out.println(n);
            n+=2;
        }
    }
}
