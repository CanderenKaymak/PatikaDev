package Loops;
import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int balance = 1000, amount, right = 3, selection;
        String userName, password;

        while(right > 0) {
            //userLogin
            System.out.print("Kullanıcı adınızı giriniz : ");
            userName = input.next();
            System.out.print("Şifrenizi giriniz : ");
            password = input.next();

            if (userName.equals("can") && password.equals("can123")) { //auth
                System.out.println("X Bank'a Hoş Geldiniz...");

                do { //menu
                    System.out.println(" 1- Para Çekme\n 2- Para Yatırma\n 3- Bakiye Sorgulama\n 4- Çıkış Yap");
                    System.out.print("Lütfen seçiminizi yapın : ");
                    selection = input.nextInt();
                        switch (selection){ // procedure
                            case 1:
                                System.out.print("Çekmek istediğiniz para miktarını giriniz : ");
                                amount = input.nextInt();
                                if (amount > balance) System.out.println("Yetersiz Bakiye!!!\n");
                                else if (amount <= 0) System.out.println("Negatif para çekme işlemi mümkün değil !\n");
                                else{
                                    balance -= amount;
                                    System.out.println(amount + " lira çekitiniz. Kalan bakiye : " + (balance) + "TL" +
                                            "\n");
                                }
                                break;
                            case 2:
                                System.out.print("Yatırmak istediğiniz para miktarını giriniz : ");
                                amount = input.nextInt();
                                if (amount > 0){
                                    balance += amount;
                                    System.out.println( amount +" lira başarılı bir şekilde yatırıldı. Yeni Bakiyeniz" +
                                              ": " + balance + "TL\n");
                                }
                                else System.out.println("Böyle bir işlem mümkün değildir..!\n");
                                break;
                            case 3:
                                System.out.println("Bakiyeniz : " + balance + " TL\n");
                                break;
                            case 4:
                                System.out.println("Bizi tercih etiiğiniz için teşekkür ederiz.. Güle Güle...\n");
                                break;
                            default:
                                System.out.println("Geçersiz işlem...\n");
                        }

                }while(selection != 4);
            }
            else {
                right--;
                System.out.println("Hatalı bir Şifre ya da Kullanıcı Adı Girdiniz!");
                System.out.println("Tekrar Deneyiniz..." + "Kalan Hakkınız : " + right);
                if (right == 0) System.out.println("Hesabınız bloke edildi.. Lütfen bankamız ile iletişime geçiniz!");
            }
        }
    }
}
