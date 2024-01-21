import java.util.*;
class perimeter {
    public static void main(String arg[]){
        String choice;
        int result , len, wid;
        int pi=22/7;
        int r;

        while(true){
            System.out.println(" => c .Circle \n => r .Rectangle \n => e .Exit:");
            Scanner  ch = new Scanner(System.in);
            choice = ch.next();

            if(choice.charAt(0)== 'c'){
                System.out.println("Enter the r value:");
                Scanner cir = new Scanner(System.in);
                r = cir.nextInt();
                result = 2*(pi*r);
                System.out.println("The perimeter of circle is,"+result);

            } else if (choice.charAt(0) == 'r') {
                Scanner rec = new Scanner(System.in);
                System.out.println("Enter the length of rectangle: ");
                len = rec.nextInt();
                System.out.println("Enter the width of rectangle: ");
                wid = rec.nextInt();
                result = 2*(wid+len);
                System.out.println("The perimeter of rectangle is,"+result);



            } else if (choice.charAt(0) == 'e') {
                System.out.println("Exit");
                break;

            }else {
                System.out.println("Please select valid option!");
            }
        }
    }
}