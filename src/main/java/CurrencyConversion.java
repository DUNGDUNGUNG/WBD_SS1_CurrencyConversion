import java.util.Scanner;

public class CurrencyConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Menu: ");
        System.out.println("1. chuyen VND sang USD ");
        System.out.println("2. Chuyen USD sang VND ");
        System.out.println("0. Thoat ");
        System.out.println("Nhap lua chon cua ban: ");
        while (true) {
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Nhap so tien VND ban muon chuyen qua USD: ");
                    double vnd = sc.nextDouble();
                    double usd = vnd / 23000.0;
                    System.out.println("Ban co " + Math.floor(usd) + "usd sau khi da doi");
                    break;
                case 2:
                    System.out.println("Nhap so tien USD ban muon chuyen qua VND: ");
                    double usd1 = sc.nextDouble();
                    double vnd1 = usd1 * 23000.0;
                    System.out.println("Ban co " + vnd1 + "vnd sau khi doi");
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("khong co su lua chon");
            }
        }
    }
}
