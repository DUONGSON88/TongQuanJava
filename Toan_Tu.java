import java.util.Scanner;

public class Toan_Tu {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("number 1 : ");
        int number1=input.nextInt();
        System.out.println("number 2 :");
        int number2= input.nextInt();
        //1. Sử dụng: +, -, *, /, %
//        System.out.println("Tổng của 2 số là :" + (number1+number2));
//        System.out.println("Tích của 2 số là :" + (number1*number2));
//        System.out.println("Hiệu của 2 số là :" + (number1-number2));
//        System.out.println("Thương của 2 số là :" + (number1/number2));
//        System.out.println("Số dư của 2 số là :" + (number1%number2));
        //2. Sử dụng =, +=, -=, *=, /=
//        System.out.println("= : "+(number1=number2));
//        System.out.println("+= : "+(number1+=number2));
//        System.out.println("-= : "+(number1-=number2));
//        System.out.println("*= : "+(number1*=number2));
//        System.out.println("/= : "+(number1/=number2))
//        ;
         //3. Sử dụng ++, --
//        System.out.println(number1=number2++);
//        System.out.println(number1=number2--);
        //4. Sử dụng <, >, <=, >=, ==, !=
        System.out.println("< : "+(number1<number2));
        System.out.println("> : "+(number1>number2));
        System.out.println("<= : "+(number1<=number2));
        System.out.println(">= : "+(number1>=number2));
        System.out.println("== : "+(number1==number2));
        System.out.println("!= : "+(number1!=number2));
    }
}
