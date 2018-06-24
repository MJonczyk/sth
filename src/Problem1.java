import java.util.Scanner;

public class Problem1 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        while(number != 42){
            System.out.println(number);
            number = sc.nextInt();
        }
    }
}
