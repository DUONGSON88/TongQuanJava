import java.util.Scanner;

public class Chuyen_Doi {
    public static void main(String[] args) {
        //Bài 1: Chuyển từ độ C sang độ F. °C  x  9/5 + 32 = °F
//        Scanner input = new Scanner(System.in);
//        System.out.println("Chuyển Đổi độ C sang độ F : ");
//        System.out.println("Bạn hãy nhập độ C  : ");
//        double doC=input.nextDouble();
//        double sum=doC*9/5+32;
//        System.out.println(doC + "Độ C bằng "+sum+ " Độ F");

//Bài 2: Chuyển từ mét sang feet: ft =m * 3.2808
//        Scanner input = new Scanner(System.in);
//        System.out.println("Chuyển Đổi độ mét  sang độ feet : ");
//        System.out.println("Bạn hãy nhập số Mét  : ");
//        double met=input.nextDouble();
//        double feet=met*3.2808;
//        System.out.println(met + " Mét bằng  "+feet+ " Feet");

//Bài 3: Tính diện tích hình vuông khi biết cạnh a.
//Scanner input = new Scanner(System.in);
//        System.out.println(" Bạn hãy điền chỉ số cạnh của hình vuông : ");
//        double a= input.nextDouble();
//        System.out.println("Diện tích hình vuông cạnh :" + a + " cm là :" + (a*a)+" cm2");

        // Bài 4: Tính diện tích hình  chữ nhật khi biết 02 cạnh a, b.
//        Scanner input = new Scanner(System.in);
//        System.out.println(" Bạn hãy điền chỉ số chiều dài của hình chữ nhật : ");
//        double a = input.nextDouble();
//        System.out.println(" Bạn hãy điền chỉ số chiều rộng của hình chữ nhật : ");
//        double b = input.nextDouble();
//        System.out.println("Diện tích hình chữ nhật có chiều dài : " + a + " cm và chiều rộng là : " + b + " cm là " + (a * b) + " cm2");

//Bài 5: Tính diện tích tam giác vuông khi biết 02 cạnh kề a, b.
//        Scanner input = new Scanner(System.in);
//        System.out.println(" Bạn hãy điền chỉ số cạnh 1 của tam giá vuông: ");
//        double a = input.nextDouble();
//        System.out.println(" Bạn hãy điền chỉ số cạnh 2 của tam giá vuông: ");
//        double b = input.nextDouble();
//        System.out.println("Diện tích hình tam giác vuông  có cạnh 1 : " + a + " cm và cạnh 2 là : " + b + " cm là " + (a * b)/2 + " cm2");

        //Bài 6: Giải phương trình bậc 1.
//        Scanner input = new Scanner(System.in);
//        System.out.println(" Giải phương trình ax+b=0 ");
//        System.out.println(" Bạn hãy nhập số a :");
//        double a = input.nextDouble();
//        System.out.println("  Bạn hãy nhập số b :");
//        double b = input.nextDouble();
//        if(a == 0 && b== 0 ){
//            System.out.println("Phương trình trên  vô số nghiệm !");
//        }else if ( a==0 && b!=0){
//            System.out.println("Phương trình trên vô nghiệm !");
//        }else {
//            System.out.println("Phương trình trên có 1 nghiệm duy nhất là: " + (-b/a));
//        }

        //Bài 7: Giải phương trình bậc 2.
//        Scanner input = new Scanner(System.in);
//        System.out.println(" Giải phương trình ax2+bx+c=0. ");
//        System.out.println(" Bạn hãy nhập số a :");
//        double a = input.nextDouble();
//        System.out.println("  Bạn hãy nhập số b :");
//        double b = input.nextDouble();
//        System.out.println("  Bạn hãy nhập số c :");
//        double c = input.nextDouble();
//        double alfa=Math.pow(b,2)-4*a*c;
//        if (a ==0 ){
//            if (b==0){
//                System.out.println("Phương trình trên  vô nghiệm !");
//            }else {
//                System.out.println("Phương trình trên có 1 nghiệm x = " + (-c/b)  );
//            }
//        }
//        if(alfa<0 ){
//            System.out.println("Phương trình trên  vô nghiệm !");
//        }else if ( alfa==0){
//            System.out.println("Phương trình trên có nghiệm kép là x1=x2 = " + (-b/(2*a))  );
//        }else {
//            System.out.println("Phương trình trên có 2 nghiệm x1= " + ((-b+Math.sqrt(alfa))/(2*a))+ " và x2 = "+((-b-Math.sqrt(alfa))/(2*a)));
//        }
//
        //Bài 8: Kiểm tra xem một số nhập vào có phải là tuổi của một người không. Một số nguyên là tuổi của một người khi nhỏ 120 và lơn hơn 0.
//        Scanner input = new Scanner(System.in);
//        System.out.println("Bạn hãy nhập số tuổi của bạn : ");
//        int age = input.nextInt();
//        if (age >0 && age <120){
//            System.out.println("Bạn có số tuổi là " + age);
//        }else {
//            System.out.println("Bạn hãy xác nhận lại số tuổi của mình ");
//        }

        //Bài 9: Kiểm tra xem 3 số thực (a,b,c) nhập vào có phải là cạnh của một tam giác. Điều kiện để a,b,c là cạnh của một tam giác là:
        //a,b,c > 0
        //a + b > c
        //b + c > a
        //a + c > b
//        Scanner input = new Scanner(System.in);
//        System.out.println("Để kiểm tra có phải hình tam giác hay không :");
//        System.out.println(" Bạn hãy nhập cạnh a :");
//        double a = input.nextDouble();
//        System.out.println("  Bạn hãy nhập cạnh b :");
//        double b = input.nextDouble();
//        System.out.println("  Bạn hãy nhập cạnh c :");
//        double c = input.nextDouble();
//        if (a > 0 && b > 0 && c > 0) {
//            if (a + b > c && b + c > a && a + c > b) {
//                System.out.println("Là hình tam giác có ba cạnh là  : " + a + " , " + b + " , " + c);
//            } else {
//                System.out.println("không phải hình tam giác");
//            }
//        } else {
//            System.out.println("không phải hình tam giác");
//        }

        //Bài 10: Viết chương trình tính giá điện.
//        Scanner input = new Scanner(System.in);
//        System.out.println("Hãy nhập tên của khách hàng : ");
//        String name = input.nextLine();
//        System.out.println("Hãy nhập số điện của khách hàng đã sử dụng : ");
//        double number=input.nextDouble();
//        if (number > 100) {
//            System.out.println(" Giá cước của khách hàng " + name + " là :" + (time * 500) + " VND");
//        } else if (time <= 100 && time > 50) {
//            System.out.println(" Giá cước của khách hàng " + name + " là :" + (time * 350) + " VND");
//        } else {
//            System.out.println(" Giá cước của khách hàng " + name + " là :" + (time * 250) + " VND");
//        }

        //Bài 11: Viết chương trình tính thuế thu nhập cá nhân.
        Scanner input = new Scanner(System.in);
        System.out.println("Hãy nhập tên của bạn : ");
        String name = input.nextLine();
        System.out.println("Tổng  thu nhập của bạn năm ngoái là : ");
        int tax = input.nextInt();
        if (tax>50000000) {
            System.out.println(name + " thuế của bạn là : " + (tax *10/100));
        } else if ( tax >30000000 && tax < 50000000 ) {
            System.out.println(name + " thuế của bạn là : " + (tax *8/100));
        } else {
            System.out.println(name + " thuế của bạn là : " + (tax *6/100));
        }
    }
}