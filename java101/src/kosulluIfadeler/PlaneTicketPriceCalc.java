package kosulluIfadeler;
import java.util.Scanner;

public class PlaneTicketPriceCalc {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int age, distance, ttype;
        double stdPrice, total = 0, ageSale, ttypeSale = 0;
        boolean isValid = true;

        System.out.print("Please enter the distance you want to travel / Lüten seyahat edeceğiniz mesafeyi giriniz " +
                "(KM) : ");
        distance = input.nextInt();
        System.out.print("Please enter you age / Lütfen yaşınızı giriniz : ");
        age = input.nextInt();
        System.out.print("Please enter the Ticket type(1=> One Way, 2=> Round-Trip) / Lütfen Bilet tipini seçiniz" +
                "(1=> Tek Yön, 2=> Gidiş-Dönüş) : ");
        ttype = input.nextInt();

        if (age < 0 || distance <= 0 || !(ttype == 1 || ttype ==2)){
            isValid = false;
        }
        else{
            // to determine sale by age
            if (age >= 0 && age <= 12){
                ageSale = 0.5;
            }
            else if (age > 12 && age <= 24){
                ageSale = 0.9;
            }
            else if (age >= 65){
                ageSale = 0.7;
            }
            else {
                ageSale = 1;
            }
            //to determine sale by travel type
            if (ttype == 1){
                ttypeSale = 1;
            }else ttypeSale = 1.6;
            //ticket price calc.
            stdPrice = distance * 0.1;
            total = stdPrice * ageSale * ttypeSale;
        }
        if (!isValid)
            System.out.println("Invalid Input / Hatalı Veri Girildi..!");
        else System.out.println("Total Price / Toplam Tutar : " + total);
    }
}
