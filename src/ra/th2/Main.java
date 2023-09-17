package ra.th2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double money = 1.0;
        int month = 1;
        double interestRate = 1.0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter investment amount: ");
        money = sc.nextDouble();
        System.out.print("Enter number of months: ");
        month = sc.nextInt();
        System.out.print("Enter annual interest rate in percentage: ");
        interestRate = sc.nextDouble();
        double totalInterest = 0;
        for (int i = 0; i < month; i++){
            totalInterest += money * (interestRate/100)/12 * month;
        }
        System.out.print("Total of interest: "+totalInterest);
    }
}
