// 4) (дополнительное задание) Задано уравнение вида q + w = e, q, w, e >= 0.
//  Некоторые цифры могут быть заменены знаком вопроса, например, 2? + ?5 = 69. 
//  Требуется восстановить выражение до верного равенства.
//   Предложить хотя бы одно решение или сообщить, что его нет.

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Home4 {
    public static void main(String[] args) {
        String equation = "";
        equation = "2? + ?5 = 69"; // Для пользовательского ввода эту строку надо закомментить.
        if (equation == "") {
            System.out.println("Уравнение в строку вида a + b = с (пробелы крайне важны!),некоторые цифры могут быть знаком '?' :");
            Scanner scanner = new Scanner(System.in);
            equation = scanner.nextLine();
            scanner.close();
        }

        List<String> solutions = findSolutions(equation);
        if (solutions.isEmpty()) {
            System.out.println("No solution found");
        } else {
            for (String solution : solutions) {
                System.out.println(solution);
            }
        }
    }

    public static List<String> findSolutions(String equation) {
        List<String> solutions = new ArrayList<>();

        int index = equation.indexOf("?");
        if (index == -1) {
            String[] splitEquation = equation.split(" ");
            String aStr = splitEquation[0], bStr = splitEquation[2], cStr = splitEquation[4];

            int a = Integer.parseInt(aStr);
            int b = Integer.parseInt(bStr);
            int c = Integer.parseInt(cStr);
            if (a + b == c) {
                solutions.add(equation);
            }
        } else {
            for (int i = 0; i <= 9; i++) {
                String newEquation = equation.substring(0, index) + i + equation.substring(index + 1);
                solutions.addAll(findSolutions(newEquation));
            }
        }

        return solutions;
    }

}
