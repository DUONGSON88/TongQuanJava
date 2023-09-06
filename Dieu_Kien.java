import java.util.Scanner;

public class Dieu_Kien {
    public static void main(String[] args) {
        //Bài 1: Nhập vào hai số a và b, và kiểm tra xem a có chia hết cho b hay không.
//        Scanner input= new Scanner(System.in);
//        System.out.println("Number1 : ");
//        int number1= input.nextInt();
//        System.out.println("Number2 : ");
//        int number2= input.nextInt();
//        if (number1%number2==0){
//            System.out.println(number1 + " có chia hết " + number2);
//        }else{
//            System.out.println(number1 + " không chia hết " + number2);
//        }
        //Bài 2: Nhập tuổi và in ra kết quả nếu tuổi học sinh đó không đủ điều kiện vào học lớp 10.
//        Scanner input = new Scanner(System.in);
//        System.out.println("Hãy nhập số tuổi của bạn : ");
//        int number1 = input.nextInt();
//        if (number1 >= 16) {
//            System.out.println("Bạn đủ điều kiện vào lớp 10 ^^!");
//        } else {
//            System.out.println("Bạn không đủ điều  vào lớp 10 ^^!");
//        }
        //Bài 3: Nhập một số nguyên bất kỳ và in kết quả ra màn hình để nói cho người dùng biết số đó là lớn hay nhỏ hơn 0
//        Scanner input= new Scanner(System.in);
//        System.out.println("Hãy nhập số nguyên bất kì : ");
//        int number1= input.nextInt();
//        if(number1>=0){
//            System.out.println(number1+ " : là số nguyên dương");
//        }else{
//            System.out.println(number1+ " : là số nguyên âm");
//        }
        //Bài 4: Nhập 3 số nguyên và tìm giá trị lớn nhất của ba số nguyên đó
//        Scanner input= new Scanner(System.in);
//        System.out.println("Number1 : ");
//        int number1= input.nextInt();
//        System.out.println("Number2 : ");
//        int number2= input.nextInt();
//        System.out.println("Number3 : ");
//        int number3= input.nextInt();
//        if(number1>number2 && number1>number3){
//            System.out.println(number1 + " is Max");
//        }else if(number1 < number3 && number3> number2){
//            System.out.println(number3 + " is Max");
//        }else {
//            System.out.println(number2 + " is Max");
//        }
        //Bài 5: Xếp hạng học lực của học sinh dựa trên các điểm bài kiểm tra, điểm thi giữa kỳ, điểm thi cuối kỳ
//        Scanner input = new Scanner(System.in);
//        System.out.println("Hãy nhập tên của bạn : ");
//        String name = input.nextLine();
//        System.out.println("Điểm thi giữa kì : ");
//        double number1 = input.nextDouble();
//        System.out.println("Điểm thi cuối kì : ");
//        double number2 = input.nextDouble();
//        double avg = (number1 + number2) / 2;
//        if (avg > 10) {
//            System.out.println("Bạn hãy nhập chính xác số điểm của bạn !!!");
//        } else if (avg >= 8) {
//            System.out.println(name + " Đại học  sinh Giỏi");
//        } else if (avg >= 6.5) {
//            System.out.println(name + " Đại học  sinh Khá");
//        } else {
//            System.out.println(name + " Đại học  sinh Trung Bình");
//        }
        //Bài 6: Tính hoa hồng nhận được tuỳ theo mức doanh số bán hàng
//        Scanner input = new Scanner(System.in);
//        System.out.println("Hãy nhập tên của bạn : ");
//        String name = input.nextLine();
//        System.out.println("Tổng  sản phẩm bạn đã bán được là : ");
//        int sp = input.nextInt();
//        if (sp>5 && sp <= 10) {
//            System.out.println(name + " Hoa hông bạn nhận được là : 500k");
//        } else if (sp <= 5 && sp >3) {
//            System.out.println(name + " Hoa hông bạn nhận được là : 250k");
//        } else {
//            System.out.println(name + " Bạn hãy trao đổi trực tiếp với kế toán");
//        }
//Bài 7: Tính cước điện thoại cho một hộ gia đình với các thông số đã cho
        Scanner input = new Scanner(System.in);
        System.out.println("Hãy nhập tên của khách hàng : ");
        String name = input.nextLine();
        System.out.println("Hãy nhập số thời gian của khách hàng đã sử dụng : ");
       double time=input.nextDouble();
        if (time > 3) {
            System.out.println(" Giá cước của khách hàng " + name + " là :" + (time * 500) + " VND");
        } else if (time <= 3 && time > 1) {
            System.out.println(" Giá cước của khách hàng " + name + " là :" + (time * 350) + " VND");
        } else {
            System.out.println(" Giá cước của khách hàng " + name + " là :" + (time * 250) + " VND");
        }
    }
}