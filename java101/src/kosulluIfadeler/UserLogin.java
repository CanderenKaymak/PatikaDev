package kosulluIfadeler;
import java.util.Locale;
import java.util.Scanner;

public class UserLogin {
    public static void main(String[] args) {
        String userName, password, select,newPassword;
        Scanner input = new Scanner(System.in);

        System.out.print("Kullanıcı Adınızı Giriniz : ");
        userName = input.next();

        System.out.print("Lütfen Parolanızı Giriniz : ");
        password = input.next();

        if(userName.equals("patika") && password.equals("Java123")){
            System.out.println("Sisteme başarılı bir şekildi giriş yaptınız...");
        } else{
            System.out.println("Bilgileriniz hatalı !!!");
            System.out.println("Şifrenizi sıfırlamak ister misiniz?? Evet(e)/Hayır(h)?");
            select = input.next().toLowerCase();

            if (select.equals("e")){
                System.out.print("Lütfen yeni şifrenizi giriniz : ");
                newPassword = input.next();

                if (newPassword.equals("Java123") || newPassword.equals(password) ){
                    System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz!!!");
                }else{
                    password = newPassword;
                    System.out.println("Şifre oluşturuldu...");
                }
            }

            else if (select.equals("h")){
                System.out.println("Bilgilerinizi doğru girene kadar giriş yapamazsınız ..! Güle Güle...");
            }else {
                System.out.println("Geçersiz seçim!!");
            }
        }
    }
}
