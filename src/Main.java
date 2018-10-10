import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" nhập năm ");
        int i = input.nextInt();
        System.out.println("năm " + i + " có " + day_in_Year.numberOfDaysInAYear(i) + " ngày");
    }
}
