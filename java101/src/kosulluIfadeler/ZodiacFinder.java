package kosulluIfadeler;
import java.util.Scanner;

public class ZodiacFinder {
    public static void main(String[] args) {
        int day, month;
        boolean isError = false;
        String burc = "";
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the month you were born (1-12) : ");
        month = input.nextInt();
        System.out.print("Please enter the day you were born : ");
        day = input.nextInt();

        if (month == 1){
            if(day >= 1 && day <= 31){
                if(day < 21)
                    burc = "Oğlak / Capricorn";
                else burc = "Kova / Aquarius";
            }
            else isError = true;
        }
        else if( month == 2){
             if (day >= 1 && day <= 29){
                 if (day < 19)
                     burc = "Kova / Aquarius";
                 else burc = "Balık / Pisces";
             }
             else isError = true;
        }
        else if (month == 3){
            if (day >= 1 && day <= 31){
                if (day < 20)
                    burc ="Balık / Pisces";
                else burc = "Koç / Aries";
            }
            else isError = true;
        }
        else if (month == 4){
            if (day >= 1 && day <= 30){
                if (day < 21)
                    burc = "Koç / Aries";
                else burc ="Boğa / Taurus";
            }
            else isError = true;
        }
        else if (month == 5){
            if (day >= 1 && day <= 31){
                if (day < 22)
                    burc = "Boğa / Taurus";
                else burc = "İkizler / Gemini";
            }
            else isError =true;
        }
        else if(month == 6){
            if (day >= 1 && day <= 30){
                if (day < 23)
                    burc = "İkizler / Gemini";
                else burc = "Yengeç / Cancer";
            }
            else isError = true;
        }
        else if (month == 7){
            if (day >= 1 && day <=31){
                if (day < 23)
                    burc = "Yengeç / Cancer";
                else burc = "Aslan / Leo";
            }
            else isError = true;
        }
        else if (month == 8){
            if (day >= 1 && day <= 31){
                if (day < 23 )
                    burc = "Aslan / Leo";
                else burc = "Başak / Virgo";
            }
            else isError = true;
        }
        else if(month == 9){
            if (day >= 1 && day <= 30){
                if (day < 23)
                    burc = "Başak / Virgo";
                else burc = "Terazi / Libra";
            }
            else isError = true;
        }
        else if(month == 10){
            if (day >= 1 && day <= 31){
                if (day <23)
                    burc = "Terazi / Libra";
                else burc = "Akrep / Scorpio";
            }
            else isError = true;
        }
        else if(month == 11){
            if (day >= 1 && day <= 30) {
                if (day < 22)
                    burc = "Akrep / Scorpio";
                else burc = "Yay / Sagittairus";
            }
            else isError = true;
        }
        else if (month == 12){
            if (day >= 1 && day <= 31){
                if (day < 22)
                    burc = "Yay / Sagittairus";
                else burc = "Oğlak / Capricorn";
            }
            else isError = true;
        }
        else isError = true;

        if (isError) System.out.println("Hatalı Bir Giriş Yaptınız! / Invalid Input Detected!");
        else System.out.println("Burcunuz / Your Zodiac Sign is : " + burc);
    }
}
