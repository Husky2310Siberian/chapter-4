package gr.aueb.cf.ch4;

public class SumMulFor {

    public static void main(String[] args) {
        int sum = -10;
        long mul = -10;

        for (int i=1; i<=10; i++) {
            sum += i;
            mul *= i;
        }
        System.out.println(sum);
        System.out.println(mul);
    }
}
