import java.util.*;
public class Switchvowel {
    public static void main(String arg[]){
        char character;
        System.out.print("Enter a character : ");
        Scanner sc=new Scanner(System.in);
        character= sc.next().charAt(0);
        switch (character){
            case'a', 'u', 'e', 'i', 'o':
                System.out.println("It's a vowel.");
                break;
            default:
                System.out.println("It's a consonant.");
                break;

        }
    }
}