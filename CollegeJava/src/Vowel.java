import java.util.*;
public class Vowel {
    public static void main(String arg[]){
        char vowel;
        System.out.println("Enter  a character:-");
        Scanner sc=new Scanner(System.in);
        vowel= sc.next().charAt(0);
        if (vowel == 'a' || vowel == 'e' || vowel == 'i' || vowel == 'o' || vowel == 'u')
            System.out.println("The character is a vowel.");
        else
            System.out.println("The character is a consonant.");
    }
}