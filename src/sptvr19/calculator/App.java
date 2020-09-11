package sptvr19.calculator;
import java.util.Scanner;

class App {
    private Scanner scanner = new Scanner(System.in);
    public void run() {
        System.out.println("Выполняется метод run()");
        
        System.out.print("Введите первое число: ");
        double number1 = scanner.nextDouble();
        System.out.print("Введите второе число: ");
        double number2 = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Укажите операцию(+,-,*,/): ");
        String symbol = scanner.nextLine();
        System.out.print("\nРезультат: ");
                
        if(null != symbol) switch (symbol) {
            case "+":
                System.out.println(number1 + number2);
                break;
            case "-":
                System.out.println(number1 - number2);
                break;
            case "*":
                System.out.println(number1 * number2);
                break;
            case "/":
                System.out.printf("%.3f\n", number1 / number2);
                break;
            default:
                System.out.println("Как-то нехорошо получается...");
                break;
        }
        
        System.out.println("Закончился метод run()");
    }
}
