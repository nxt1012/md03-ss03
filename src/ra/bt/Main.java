package ra.bt;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        sử dụng cấu trúc lặp để nhập vào dữ liệu với điều kiện sau:
//        nhập vào 1 chuỗi cho đến khi thỏa mãn đủ 12 đến 20 ký tự (sử dụng .length)
//        nhập vào 1 số > 18 thì mới dừng nhập
//        nhập vào 1 ký tự đến khi nhập ký tự O thì dừng và in ra những ký tự vừa nhập


//        nhập vào 1 chuỗi cho đến khi thỏa mãn đủ 12 đến 20 ký tự (sử dụng .length)
        Scanner sc = new Scanner(System.in);
        String str;
        int num;
        char ch;
        StringBuilder chars = new StringBuilder();
        do {
            System.out.print("Vui lòng nhập vào một chuỗi bất kỳ: ");
            str = sc.nextLine();
            if(str.length() < 12 || str.length() > 20){
                System.out.println("\u001B[31mChuỗi vừa nhập không thỏa mãn điều kiện về độ dài. \u001B[0m");
            } else {
                System.out.println("\u001B[32mChuỗi nhập vào hợp lệ. Chương trình kết thúc.");
            }
        } while (str.length() < 12 || str.length() > 20);

//        nhập vào 1 số > 18 thì mới dừng nhập
        do {
            System.out.print("Vui lòng nhập vào một số bất kỳ: ");
            num = sc.nextInt();
            if(num < 18){
                System.out.println("\u001B[31mSố vừa nhập không thỏa mãn điều kiện lớn hơn 18. \u001B[0m");
            } else {
                System.out.println("\u001B[32mSố nhập vào hợp lệ. Chương trình kết thúc.");
            }
        } while (num < 18);
//        nhập vào 1 ký tự đến khi nhập ký tự O thì dừng và in ra những ký tự vừa nhập
        do {
            System.out.print("Vui lòng nhập vào một ký tự bất kỳ: ");
            ch = sc.next().charAt(0);
            chars.append(ch+" ");
            if(ch != 'O'){
                System.out.println("\u001B[31mKý tự vừa nhập không thỏa mãn điều kiện. Vui lòng nhập lại. \u001B[0m");
            } else {
                System.out.println("\u001B[32mBạn đã nhập vào ký tự 'O'. Các ký tự bạn đã nhập vào.");
                System.out.println(chars);
            }
        } while (ch != 'O');

    }
}
