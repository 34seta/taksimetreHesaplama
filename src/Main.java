import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int km;
        double perkm = 2.20;
        int startPrice = 10;
        double total = 0;

        System.out.println("Lutfen Gidilecek Mesafeyi giriniz: ");
        km = scanner.nextByte();


        total = startPrice + perkm * km;
        total = (total < 20) ? 20 : total;
        System.out.println("Taksimetre Tutari: " + total + " TL'dir.");




    }
}