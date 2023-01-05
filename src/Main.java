import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int yariCap;
        double pi = Math.PI, alan, cevre;

        System.out.print("Dairenin yarıçap Değerini Giriniz : ");
        yariCap = input.nextInt();

        alan = pi * yariCap * yariCap;
        cevre = 2 * pi * yariCap;

        System.out.println("Dairenin Alanı : " + alan);
        System.out.println("Dairenin Çevresi : " + cevre);



    }
}
