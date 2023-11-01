import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Программа проверяет, могут ли две летающие тарелки n-ых радиусов уместится на поле Джона n-а радиуса");

        System.out.print("Введите радиус поля Джона : ");
        int FieldR = scanner.nextInt();

        System.out.print("Введите радиус первой летающей тарелки : ");
        int r1NLO = scanner.nextInt();

        System.out.print("Введите радиус второй летающей тарелки : ");
        int r2NLO = scanner.nextInt();

        if(r2NLO + r1NLO <= FieldR)
            System.out.println("Тарелки могут уместится на поле");
        else
            System.out.println("Тарелки не могут уместится на поле");




    }
}