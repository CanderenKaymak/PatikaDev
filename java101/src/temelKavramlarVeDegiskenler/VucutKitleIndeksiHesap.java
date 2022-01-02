package temelKavramlarVeDegiskenler;
import java.util.Scanner;
// Kullanıcıdan boy ve kilo değerlerini alıp bir değişkene atayın. Aşağıdaki formüle göre kullanıcının
// "Vücut Kitle İndeks" değerini hesaplayıp ekrana yazdırın. *** VKI = Kilo (kg) / Boy(m) * Boy(m)
public class VucutKitleIndeksiHesap {
    public static void main(String[] args) {
        double weight , height, vki;
        Scanner input = new Scanner(System.in);

        System.out.println("*** Vücut Kitle İndeksi Hesaplama Programı ***");
        System.out.print("Lütfen metre cinsinden boyunuzu giriniz: ");
        height = input.nextDouble();
        System.out.print("Lütfen kilogram cinsinden ağırlığınızı giriniz : ");
        weight = input.nextDouble();

        vki = weight / (height * height);
        System.out.println("Vücut Kitle İndeksiniz : " + vki);

    }
}
