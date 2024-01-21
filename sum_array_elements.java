 class sum_array_elements {
    public static void main(String arg[]){
        int number[] = {1, 2, 3, 4, 5};
        int i = 0, sum = 0;
        for(i = 0; i<number.length; i++){
            sum = sum + number[i];

        }
        System.out.println("The sum of array" + sum);

    }
}