import java.util.Scanner;

public class PrimeNumberLessThan100 {
    void pnlt100() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n========");
        System.out.print("Input n= ");
        int n = sc.nextInt();
        Check c = new Check();
        System.out.print("The prime numbers less than " +n+ " are: ");
        if (n >= 2) {
            System.out.print(2);
        }
        for (int i = 3; i < n; i+=2) {
            if (c.isPrimeNumber(i)) {
                System.out.print("\t" + i);
            }
        }
    }
}
