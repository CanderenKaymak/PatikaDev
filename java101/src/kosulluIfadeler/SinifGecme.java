package kosulluIfadeler;
import java.util.Scanner;

public class SinifGecme {
    public static void main(String[] args) {
        int mat, fiz, kim, tur, muz;
        double pass = 55, avr;
        Scanner input = new Scanner(System.in);

        System.out.print("Matematik notunuzu giriniz : ");
        mat = input.nextInt();
        if (mat < 0 || mat > 100)
            mat = 0;


        System.out.print("Fizik notunuzu giriniz : ");
        fiz = input.nextInt();
        if (fiz < 0 || fiz > 100)
            fiz = 0;

        System.out.print("Kimya notunuzu giriniz : ");
        kim = input.nextInt();
        if (kim < 0 || kim > 100)
            kim = 0;

        System.out.print("Türkçe notunuzu giriniz : ");
        tur = input.nextInt();
        if (tur < 0 || tur > 100)
            tur = 0;

        System.out.print("Müzik notunuzu giriniz : ");
        muz = input.nextInt();
        if (muz < 0 || muz > 100)
            muz = 0;

        avr = (mat + fiz + kim + tur + muz) / 5;

        if (avr >= pass){
            System.out.println("Sınıfı " + avr + " not ortalaması ile geçtiniz..");
        }else{
            System.out.println(avr + " not ortalaması ile sınıfta kaldınız ..");
        }
    }
}
