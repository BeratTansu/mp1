import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("birinci sayı= ");
        int birinci_sayi = scn.nextInt();
        System.out.println("ikinci sayı= ");
        int ikinci_sayi = scn.nextInt();

        int gecici = birinci_sayi;
        birinci_sayi = ikinci_sayi;
        ikinci_sayi = gecici;
        System.out.print("Değiştirdikten sonra; ");
        System.out.print(" birinci sayı= " + birinci_sayi);
        System.out.print(" ikinci sayı= " + ikinci_sayi);
    }
}
