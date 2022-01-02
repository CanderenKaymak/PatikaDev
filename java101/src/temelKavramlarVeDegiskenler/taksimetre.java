package temelKavramlarVeDegiskenler;
import java.util.Scanner;

/*
 * Gidilen mesafeye (KM) göre taksimetre tutarını ekrana yazdıran programı yazın.
    *Taksimetre KM başına 2.20 TL tutmaktadır.
    *Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.
    *Taksimetre açılış ücreti 10 TL'dir.
 */
public class taksimetre {
    public static void main(String[] args) {
        double km, total, perKm = 2.2, startPrice = 10;
        Scanner input = new Scanner(System.in);

        System.out.print("Mesafeyi kilometre cinsinden giriniz : ");
        km = input.nextDouble();
        total = km * perKm;
        total += startPrice;

        total = (total < 20) ? 20 : total;
        System.out.print("Ödemeniz gereken tutar : " + total);


    }
}
