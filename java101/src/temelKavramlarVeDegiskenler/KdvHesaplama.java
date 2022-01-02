package temelKavramlarVeDegiskenler;
import  java.util.Scanner;
public class KdvHesaplama {
    public static void main(String[] args) {
        double tax, taxPrice, price, total;
        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen KDV'sini hesaplamak istediğiniz tutarı giriniz : ");
        price = input.nextDouble();

        String hata = (price < 0) ? "Sıfırdan küçük tutar girilemez! Lütfen Sıfından BÜYÜK bir tutar giriniz..." :
                "Tutarı tekrar giriniz: ";
        System.out.println(hata);
        price = input.nextDouble();

        tax = ((price > 0) && price <= 1000) ? 0.18 : 0.08;
        taxPrice = tax * price;
        total = taxPrice + price;

        System.out.println("KDV'siz tutar: " + price);
        System.out.println("KDV Oranı: " + tax);
        System.out.println("KDV Tutarı: " + taxPrice);
        System.out.println("Toplam Tutar: " + total);
        //
    }
}
