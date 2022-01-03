package kosulluIfadeler;
import java.util.Scanner;

/*  Koşullar videoya göre düzenlendi.. Ödevin Orijinalinde 15-25 derece arası Piknik gözüküyordu.
    Sıcaklık 5'dan küçük ise "Kayak" yapmayı öner.
    Sıcaklık 5 ve 15 arasında ise "Sinema" etkinliğini öner.
    Sıcaklık 10 ve 25 arasında ise "Piknik" etkinliğini öner.
    Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner.
*/

public class WeatherEventAdvice {
    public static void main(String[] args) {
        int temperature;
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter a temperature (Celcius) to get an advice : ");
        temperature = input.nextInt();

        if (temperature <= 5 ) {
            System.out.println("You can go to Ski..");
        }
        else if (temperature > 5 && temperature < 10)
            System.out.println("You can go to Cinema..");
        else if (temperature >= 10 && temperature <= 15)
            System.out.println("You can choose a Picnic or to go to Cinema..");
        else if (temperature > 15 && temperature <= 25)
            System.out.println("You should go to Picnic..");
        else System.out.println("Find a beach to Swim ...");
    }
}
