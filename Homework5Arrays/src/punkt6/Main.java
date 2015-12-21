package punkt6;

/**
 * Created by Sergey on 21.10.2015.
 */
public class Main {
    public static void main(String[] args) {
        int n = 11;
        int first = 1;
        int second = 1;
        int[] fibonacci = new int[n];
        for(int i = 0; i < fibonacci.length; i++){
            int sum = first + second;
            first = second;
            second = sum;
            fibonacci[i] = sum;
            System.out.print(fibonacci[i] + " ");
        }
    }
}
