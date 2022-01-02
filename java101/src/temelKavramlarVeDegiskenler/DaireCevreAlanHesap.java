package temelKavramlarVeDegiskenler;
import java.util.Scanner;

public class DaireCevreAlanHesap {
    public static void main(String[] args) {
        float aci = 360, pi = 3.14f, r, cevre, alan, dilim;

        Scanner input = new Scanner(System.in);
        System.out.print("Değerlerini hesaplamak istediğiniz dairenin yarıçapını giriniz : ");
        r = input.nextFloat();
        System.out.print("Hesaplanmasını istediğiniz dilim icin merkez açısının ölçüsünü giriniz : ");
        aci = input.nextFloat();

        cevre = 2 * pi * r;
        alan = pi * (r * r);
        dilim = (pi * (r * r) * aci) / 360;

        System.out.println("Dairenin Çevresi : " + cevre);
        System.out.println("Dairenin Alanı : " + alan);
        System.out.println("Verilen Açıya gore Dilimin Alanı : " + dilim);

    }
}
