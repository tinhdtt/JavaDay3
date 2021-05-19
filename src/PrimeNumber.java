import java.util.Scanner;

public class PrimeNumber {
    void Prime(){
        Scanner sc = new Scanner(System.in);
        System.out.println("========");
        System.out.print("Input the first numbers of prime which you want to show: ");
        int n = sc.nextInt();
        Check c = new Check();
        System.out.print(n + " first prime numbers: ");
        int index = 0;
        int i = 2;
        while (index < n) {
            if (c.isPrimeNumber(i)) {
                System.out.print(i + "\t");
                index++;
            }
            i++;
        }
    }
}
