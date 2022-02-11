package OtherTopics;

import java.util.Scanner;

public class PalindromeWords {
    static boolean isPalindrome(String str){
        String reversed = "";
        for (int i = str.length() -1; i >= 0; i--){
            reversed += str.charAt(i);
        }
        return str.equals(reversed);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen bir kelime giriniz : ");
        String entry = input.next();

        if (isPalindrome(entry))
            System.out.println("Bu kelime, palindrom bir kelimedir.");
        else
            System.out.println("Bu kelime, palindrom kelime değildir.");
    }
}
