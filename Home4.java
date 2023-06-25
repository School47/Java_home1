// 4) (дополнительное задание) Задано уравнение вида q + w = e, q, w, e >= 0.
//  Некоторые цифры могут быть заменены знаком вопроса, например, 2? + ?5 = 69. 
//  Требуется восстановить выражение до верного равенства.
//   Предложить хотя бы одно решение или сообщить, что его нет.

import java.util.Scanner;

public class Home4 {
    public static void main(String[] args) {
        String equation = "";
        equation = "2? + ?5 = 121"; // Для пользовательского ввода эту строку надо закомментить.
        if (equation == "") {
            System.out.println("Введите n:");
            Scanner scanner = new Scanner(System.in);
            equation = scanner.nextLine();
            scanner.close();
        }
        String[] splitEquation = equation.split(" ");
        String a = splitEquation[0], b = splitEquation[2], c = splitEquation[4];
        // разбиваем строку на 2 слогаемых и сумму a+b=c, перебираем
        boolean found = false;
        for (int i = 0; i <= 9; i++) {
            for (int j = 0; j <= 9; j++) {
                int aNum = Integer.parseInt(a.replace("?", String.valueOf(i)));
                int bNum = Integer.parseInt(b.replace("?", String.valueOf(j)));
                int cNum = Integer.parseInt(c);

                if (aNum + bNum == cNum) {
                    System.out.println(a.replace("?", String.valueOf(i)) + " + " +
                            b.replace("?", String.valueOf(j)) + " = " + c);
                    found = true;
                    break;
                }
            }
            if (found) {
                break;
            }
        }

        if (!found) {
            System.out.println("No solution found");
        }

    }

}
