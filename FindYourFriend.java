import java.util.*;
class FindYourFriend {
    public static void main(String arg[]){
        String friends[] = {"Agnik", "Shivam", "Jeet", "Vivak", "Swrup"};
        String find;
        int i;
        int f = 0;
        Scanner k = new Scanner(System.in);
        System.out.println("Enter your friend name to find your friend: ");
        find = k.next();
        for(i = 0; i < friends.length; i++){
            if(friends[i].equals(find)){
                f = 1;
                break;
            }
        }if(f==1){
            System.out.println(friends[i]+ "Said, I am here buddy!");
        }else{
            System.out.println("I am not your friend.");
        }
    }
}