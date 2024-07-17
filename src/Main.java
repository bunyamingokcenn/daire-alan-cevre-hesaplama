import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int r;
        double pi = 3.14, alan, cevre;

        Scanner input = new Scanner(System.in);

        System.out.print("Dairenin yarı çapını giriniz: ");
        r = input.nextInt();

        alan = pi * r * r;
        cevre = 2 * pi * r;

        System.out.println("Dairenin alanı: " + alan);
        System.out.println("Dairenin çevresi: " + cevre);

        }
    }
