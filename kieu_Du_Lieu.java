import java.util.Scanner;

public class kieu_Du_Lieu {
    public static void main(String[] args) {
        //1. Khai báo 1 biến kiểu int, in ra số đó.
//        int a=1;
//        System.out.println(a);
        //2. Nhập 1 biến kiểu int, in ra số đó.
//        Scanner input=new Scanner(System.in);
//        System.out.println("Hãy Nhập Số : ");
//        int number = input.nextInt();
//        System.out.println("Số bạn vừa nhập là : "+ number);
        //3. Nhập vào 2 biến kiểu int, in ra tổng, tích, hiệu, thương, số dư của 2 số đó.
//        Scanner input = new Scanner(System.in);
//        System.out.println("Hãy nhập number 1 : ");
//        int number1 = input.nextInt();
//        System.out.println("Hãy nhập number 2 : ");
//        int number2 = input.nextInt();
//        System.out.println("Tổng của 2 số là :" + (number1+number2));
//        System.out.println("Tích của 2 số là :" + (number1*number2));
//        System.out.println("Hiệu của 2 số là :" + (number1-number2));
//        System.out.println("Thương của 2 số là :" + (number1/number2));
//        System.out.println("Số dư của 2 số là :" + (number1%number2));
        //4. Nhập vào tên, tuổi. In ra: ""Xin chào ..., tôi năm nay ..."""
        Scanner input= new Scanner(System.in);
        System.out.println("Bạn hãy nhập tên của bạn : ");
        String name=input.nextLine();
        System.out.println("Bạn hãy nhập  số tuổi của bạn : " );
        int age =input.nextInt();

        System.out.println("Tên :  " + name + " ||  Có số tuổi là : " +age );


    }
}
