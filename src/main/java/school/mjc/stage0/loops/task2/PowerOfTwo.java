package school.mjc.stage0.loops.task2;

public class PowerOfTwo {
    public void printPower(int power) {

        if(power<0){
            System.out.println("too much power");
            return;
        }
        int cycle = 1;
        System.out.println("1");
        int result=1;
        while (cycle <= power) {
            System.out.println(2 * result);
            result=2*result;
            cycle++;
        }
    }
}
