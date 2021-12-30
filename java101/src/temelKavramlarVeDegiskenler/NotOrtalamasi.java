package temelKavramlarVeDegiskenler;
import java.util.Scanner;

public class NotOrtalamasi {
    public static void main(String[] args) {
        int turkce, tarih, muzik, fizik, kimya, matematik;

        Scanner input = new Scanner(System.in);

        System.out.println("Matematik Notunuzu Giriniz : ");
        matematik = input.nextInt();

        System.out.println("Kimya Notunuzu Giriniz : ");
        kimya = input.nextInt();

        System.out.println("Fizik Notunuzu Giriniz : ");
        fizik = input.nextInt();

        System.out.println("Türkçe Notunuzu Giriniz : ");
        turkce = input.nextInt();

        System.out.println("Tarih Notunuzu Giriniz : ");
        tarih = input.nextInt();

        System.out.println("Müzik Notunuzu Giriniz : ");
        muzik = input.nextInt();

        float ort = (matematik + tarih + turkce + fizik + kimya + muzik) / 6;
        System.out.println("Ortalamanız " + ort);

        String gecis = (ort >= 60) ? "Sınıfı Geçtiniz" : "Sınıfta Kaldınız";
        System.out.println(gecis);

    }
}
