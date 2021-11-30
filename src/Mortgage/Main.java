package Mortgage;       /*папка Ипотека*/
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner in = new Scanner(System.in);
        System.out.print("Enter full payment: "); /*Толык толемди енгизиниз*/
        double sum = in.nextDouble();
        System.out.print("Enter monthly payment: "); /*Айлык толемди енгизиниз*/
        double monthSum = in.nextDouble();

        JusanBank bank = new JusanBank(sum, monthSum);
        bank.Print();
    }
}
