import java.util.Arrays;
class Sort_Names {
    public static void main(String arg[]){
        String names[] = {"Agnik", "Shivam", "Jeet", "Vivak", "Swrup"};
        Arrays.sort(names);
        for(String name:names){
            System.out.println(name);
        }

    }
}