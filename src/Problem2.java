import java.util.Scanner;

public class Problem2 {
    public static boolean isPrime(int number){
        for(int i = 2;i <= (int)Math.sqrt(number);i++){
            if(number % i == 0)
                return false;
        }
        return number > 1;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int j = sc.nextInt();
        int[][] arr = new int[j][2];
        for(int k = 0;k < j;k++) {
            arr[k][0] = sc.nextInt();
            arr[k][1] = sc.nextInt();
        }
        for(int k = 0;k < j;k++) {
            for (int i = arr[k][0]; i <= arr[k][1]; i++) {
                if (Problem2.isPrime(i))
                    System.out.println(i);
            }
            System.out.println();
        }
    }
}
