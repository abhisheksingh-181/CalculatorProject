package java_cal;


import java.util.*;

public class miniproject {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number1 : ");
        int num1 = sc.nextInt();
        System.out.print("enter the character s : ");
        char symbol = sc.next().charAt(0);
        System.out.print("enter the number2 : ");
        int num2 = sc.nextInt();



        switch (symbol) {
            case '+':
                System.out.println("your sum is : "+(num1+num2));
                break;
            case '-':
                System.out.println("your sub is : "+(num1-num2));
                break;
            case '*':
                System.out.println("your mult is : "+(num1*num2));
                break;
            case '/':
                System.out.println("your divide is : "+(num1/num2));
            default:
                break;
        }




    }

}