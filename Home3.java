// 3) Реализовать простой калькулятор

import java.util.Scanner;

public class Home3 {

    public static void main(String[] args) {
        System.out.println("Программа Калькулятор!");
        System.out.println("Введите знак действия (*,+,/,-)");
        Scanner scanner = new Scanner (System.in);
        String action = scanner.nextLine();
        System.out.println("Введите первое число:");
        int Number1 = scanner.nextInt();
        System.out.println("Введите второе число:");
        int Number2 = scanner.nextInt(); 
        scanner.close();
        String ResultString = Number1 +" "+ action +" "+ Number2 +" = ";
        switch (action) {
            case "+":
                ResultString = ResultString + (Number1+Number2);
                break;
            case "-":
                ResultString = ResultString + (Number1-Number2);
                 break;
            case "*":
                ResultString = ResultString + (Number1*Number2);
                break;
            case "/":
                if (Number2==0){
                    ResultString="Деление на ноль запрещено!";
                }
                else{
                ResultString = ResultString + (Number1/Number2);
                }
                break;           
            default:
                System.out.println("Вы ввели неправильную операцию.");
                break;
        }
        System.out.println(ResultString);
    }
}
