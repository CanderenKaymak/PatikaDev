package temelKavramlarVeDegiskenler;
import java.util.Scanner;

/*
* kullanıcıların manavdan almış oldukları ürünlerin kilogram değerlerine göre
* toplam tutarını ekrana yazdıran programı yazın.

Meyveler ve KG Fiyatları

Armut : 2,14 TL
Elma : 3,67 TL
Domates : 1,11 TL
Muz: 0,95 TL
Patlıcan : 5,00 TL
*/

public class ManavKasa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double armut = 2.14, elma = 3.67, domates = 1.11, muz = 0.95, patlican = 5, totalPrice, wArmut, wElma,
        wDomates, wMuz, wPatlican;

        System.out.print("Armut Kaç Kilo ? : ");
        wArmut = input.nextDouble();
        System.out.print("Elma Kaç Kilo ? : ");
        wElma = input.nextDouble();
        System.out.print("Domates Kaç Kilo ? : ");
        wDomates = input.nextDouble();
        System.out.print("Muz Kaç Kilo ? : ");
        wMuz = input.nextDouble();
        System.out.print("Patlıcan Kaç Kilo ? : ");
        wPatlican = input.nextDouble();

        totalPrice = (wArmut * armut) + (wElma * elma) + (wDomates * domates) + (wMuz * muz) + (wPatlican * patlican);
        System.out.println("Toplam Tutar : " + totalPrice + " TL");
    }
}
