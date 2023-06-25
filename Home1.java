// 1) Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! 
// (произведение чисел от 1 до n)

import java.util.Scanner;

public class Home1 {
    public static void main(String[] args) {
        System.out.println("Введите n:");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        int resultfact = 1;
        int resultsumm= 0;

        for (int i = 1; i <= n; i++) {
            resultfact*=i;
            resultsumm+=i;
        }
        System.out.println("Summa chisel on 1 do "+n+": "+resultsumm);
        System.out.println("Proisvedenie chisel on 1 do "+n+": "+resultfact);
    }

}
