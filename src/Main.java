public class Main {
    public static void main(String[] args){

        System.out.println(sumOfPositive(100));


    }

    public static int sumOfPositive(int i){
        int sum = 0;

        for (int k = 0; k <= i; k++){
            sum += k;
        }

        return sum;
    }
}
