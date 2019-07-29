import java.util.Scanner;

public class GodzilaVSKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int statists = Integer.parseInt(scanner.nextLine());
        double clothes = Double.parseDouble(scanner.nextLine());

        double decorPrice = budget * 0.10;
        double clothesPrice = statists * clothes;

        if (statists > 150) {
            clothesPrice = clothesPrice * 0.90;
        }
        double totalPrice = decorPrice + clothesPrice;

        if (totalPrice > budget) {
            System.out.printf("Not enough money!%n");
            System.out.printf("Wingard needs %.2f leva more.", totalPrice - budget);
        } else {
            System.out.printf("Action!%n");
            System.out.printf("Wingard starts filming with %.2f leva left.", budget - totalPrice);
        }
    }
}
