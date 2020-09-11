package sptvr19.calculator;
import java.util.Scanner;

public class SPTVR19Calculator {

    public static void main(String[] args) {
    
        System.out.println("~~~ CalcPro2 ~~~");
        System.out.println("by Georg Laabe\n");
        
        while (true) {
            
            double num3 = 0;
            
            Scanner sc = new Scanner(System.in);
            
            System.out.print("Input the first number: ");
            double num1 = sc.nextInt();
            System.out.print("Input the second number: ");
            double num2 = sc.nextInt();
            System.out.print("Input the operation(+,-,*,/,**): ");
            sc.nextLine();
            String operation = sc.nextLine();
            
            switch(operation){
                case "+":{
                    num3 = num1 + num2;
                    break;
                }
                case "-":{
                    num3 = num1 - num2;
                    break;
                }
                case "*":{
                    num3 = num1 * num2;
                    break;
                }
                case "/":{
                    num3 = num1 / num2;
                    break;
                }        
            }
            
            System.out.printf("\nYour Answer is: %.2f\n", num3);
            System.out.printf(" --------------------------- \n");   
            
        }
    }
    
}
