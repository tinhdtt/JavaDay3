import java.util.Scanner;

public class Factorial {
    public void factorial() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n========");
        System.out.print("Input n to calculate its factorial: ");
        int n = sc.nextInt();
        System.out.println(n+"! = " + calFactorial(n));
    }


    public static long calFactorial(int n) {
        long fac = 1;
        if (n == 0 || n == 1) {
            return fac;
        } else {
            for (int i = 2; i <= n; i++) {
                fac *= i;
            }
            return fac;
        }


    }
}
